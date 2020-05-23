package Networking;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/booked?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addTicket(Tickets ticket){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO tickets (id, direction, flyTime, price, trainType, carriage, spot, flyDate, flyTimeDate, flyFinalDate, flyFinalTimeDate, privileges) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, ticket.getDirection());
            statement.setInt(2, ticket.getFlyTime());
            statement.setInt(3, ticket.getPrice());
            statement.setString(4, ticket.getTrainType());
            statement.setInt(5, ticket.getCarriage());
            statement.setInt(6, ticket.getSpot());
            statement.setDate(7, Date.valueOf(ticket.getFlyDate()));
            statement.setTime(8, Time.valueOf(ticket.getFlyTimeDate()));
            statement.setDate(9, Date.valueOf(ticket.getFlyFinalDate()));
            statement.setTime(10, Time.valueOf(ticket.getFlyFinalTimeDate()));
            statement.setString(11, ticket.getPrivileges());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Tickets> getAllTickets(){
        ArrayList<Tickets> ticketList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tickets");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String direction = resultSet.getString("direction");
                int flyTime = resultSet.getInt("flyTime");
                int price = resultSet.getInt("price");
                String trainType = resultSet.getString("trainType");
                int carriage = resultSet.getInt("carriage");
                int spot = resultSet.getInt("spot");
                Date flyDate = resultSet.getDate("flyDate");
                Time flyTimeDate = resultSet.getTime("flyTimeDate");
                Date flyFinalDate = resultSet.getDate("flyFinalDate");
                Time flyFinalTimeDate = resultSet.getTime("flyFinalTimeDate");
                String privileges = resultSet.getString("privileges");

                ticketList.add(new Tickets(id, direction, flyTime, price, trainType, carriage, spot, flyDate, flyTimeDate, flyFinalDate, flyFinalTimeDate, privileges));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ticketList;
    }
    public void deleteTicket(Integer id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM tickets WHERE id = ?"
            );
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
