package com.bitcode.questions.mysql.birtday;

import com.bitcode.mysql.menudrivenstudent.Student;
import com.bitcode.questions.mysql.BankAccount;

import java.sql.*;

public class DbBirthdayUtil {
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

    //insert Birthdates
    public static void insertBirthdate(Birthday b){
        String url = "INSERT INTO birthday (id,name,birthday) VALUES (?,?,?)";
        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(url);
            stmt.setInt(1,b.getId());
            stmt.setString(2,b.getName());
            stmt.setDate(3, (Date) b.getBirthDay());

            int rows = stmt.executeUpdate();
            if(rows>0){
                System.out.println("Birthdates Inserted Successfully!");
            }else{
                System.out.println("Record not Inserted..!");
            }
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    //search by name
    public void searByName(Birthday b){
        {
            String sql = "SELECT * FROM birthday WHERE name=?";
            try{
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1,b.getName());

                ResultSet result = stmt.executeQuery();
                while(result.next()) {
                    int id = result.getInt(1);
                    String name = result.getString(2);
                    Date birthday = result.getDate(3);

                    Birthday b1  = new Birthday(id, name,  birthday);
                    System.out.println(b1);
                }
                stmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }

    //search by month
    public void searchByMonth(int month) {
        String sql = "SELECT * FROM birthday WHERE MONTH(birthday) = ?";
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, month);
            ResultSet result = stmt.executeQuery();
            boolean found = false;
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                Date birthday = result.getDate("birthday");
                Birthday b = new Birthday(id, name, birthday);
                System.out.println(b);
                found = true;
            }
            if (!found) {
                System.out.println("No birthdays found in this month.");
            }
            result.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
