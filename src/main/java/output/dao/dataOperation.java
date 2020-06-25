package output.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class dataOperation {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://demo1.yoxvtech.com:5432/thingsboard",
                            "postgres", "youxu");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
