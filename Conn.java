package EmployeeManagementSystm.Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empl?useSSL=false","root","229193");
            s = c.createStatement();
            System.out.println("connection successfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        new Conn();
//    }
}
