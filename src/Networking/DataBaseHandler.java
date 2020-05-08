package Networking;

import java.io.*;
import java.util.ArrayList;

public class DataBaseHandler {
    static ArrayList<Account> accounts = new ArrayList<>();
    static File file = new File("accounts.isns");
    public static boolean newAccount(Account account) throws IOException, ClassNotFoundException {
        accounts.clear();
        if(file.length()>0){
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("accounts.isns"));
        accounts = (ArrayList<Account>) input.readObject();
        for(Account a: accounts){
            if(a.getEmail().equals(account.getEmail())) {
                return false;
            }
        }
        accounts.add(account);
        }
        ObjectOutputStream outputFile = null;
        outputFile = new ObjectOutputStream(new FileOutputStream("accounts.isns"));
        accounts.add(account);
        outputFile.writeObject(accounts);
        outputFile.close();
        return true;
    }

    public static String loginAccount(String login, String password) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("accounts.isns"));
        ArrayList<Account> accounts = (ArrayList<Account>) input.readObject();
        for(Account account: accounts){
            if(account.getEmail().equals(login) && account.getPassword().equals(password)){
                return account.getUsername();
            }
        }
        return null;
    }
}
