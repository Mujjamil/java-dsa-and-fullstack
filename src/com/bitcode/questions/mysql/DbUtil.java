package com.bitcode.questions.mysql;

import java.sql.*;

public class DbUtil {

    static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demodb";
            String username = "root";
            String password = "Mujjamil@7219";
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");

        }catch (SQLException | ClassNotFoundException e){
            System.out.println("Connection not Established");
            e.printStackTrace();

        }
        return con;
    }

    //insert balance
    public static void insertBalance(BankAccount b){
        String url = "INSERT INTO bankaccount (id,name,balance) VALUES (?,?,?)";
        try{
           Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(url);
            stmt.setInt(1,b.getAccountNo());
            stmt.setString(2,b.getAccountHolderName());
            stmt.setDouble(3,b.getBalance());

            int rows = stmt.executeUpdate();
            if(rows>0){
                System.out.println("Record Inserted Successfully!");
            }else{
                System.out.println("Record not Inserted..!");
            }
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static void depositAmmount(BankAccount b){
        String url = "UPDATE bankaccount SET balance= balance + ? WHERE id=?";
        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(url);
            stmt.setDouble(1,b.getBalance());
            stmt.setInt(2,b.getAccountNo());
            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Deposited Successfully");
            }
            else{
                System.out.println("Not Deposited!");
            }
            stmt.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void withDrwaAmmount(BankAccount b){
        String url = "UPDATE bankaccount SET balance= balance - ? WHERE id=?";
        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(url);
            stmt.setDouble(1,b.getBalance());
            stmt.setInt(2,b.getAccountNo());
            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Withdraw Successfully");
            }
            else{
                System.out.println("Not Deposited!");
            }
            stmt.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static double remainingBalance(int accountNo) {

        String sql = "SELECT balance FROM bankaccount WHERE id = ?";
        double balance = -1;
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, accountNo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                balance = rs.getDouble("balance");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }


}
