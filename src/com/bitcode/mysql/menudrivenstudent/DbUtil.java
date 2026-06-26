package com.bitcode.mysql.menudrivenstudent;

import java.sql.ResultSet;


import java.sql.*;

public class DbUtil {
    static Connection getConncection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demodb";
            String username = "root";
            String password = "Mujjamil@7219";

            con = DriverManager.getConnection(url, username,password);
            System.out.println("Connection Established");


        }catch (SQLException | ClassNotFoundException e){
            
            e.printStackTrace();
        }
        return con;
    }


    public void insertRecord(Student s){
        String sql = "INSERT INTO student2(rollno,name,marks,year) VALUES (?,?,?,?)";
        try{
            Connection con = getConncection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1,s.getRollno());
            stmt.setString(2, s.getName());
            stmt.setInt(3,s.getMarks());
            stmt.setInt(4,s.getYear());
            int rows = stmt.executeUpdate();
            if(rows>0){
                System.out.println("Student record added successfully");
            }else{
                System.out.println("Failed to insert student record");
            }
            stmt.close();
            con.close();

        }catch (SQLException e){
            System.out.println("Error while inserting Record");
            e.printStackTrace();
        }

    }

    public void readAllRecord(){
        String sql = "SELECT * FROM student2";
        try{
            Connection con = getConncection();
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()){
                int rno = result.getInt("rollno");
                String name = result.getString("name");
                int marks = result.getInt("marks");
                int yr = result.getInt("year");

                Student s = new Student(rno, name, marks, yr);
                System.out.println(s);
            }
            result.close();
            stmt.close();
            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }


    }

    public void updateRecord(Student s){
        String sql = "UPDATE student2 SET marks =? WHERE rollno=?";

        try{
            Connection con = getConncection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,s.getMarks());
            stmt.setInt(2,s.getRollno());

            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Record Updated Successfully");
            }else{
                System.out.println("Record Not udpated");
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void deleteRecord(Student s){
        String sql = "DELETE FROM student2 WHERE rollno=?";
        try{
            Connection con = getConncection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,s.getRollno());

            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Record Delete Successfully");
            }else{
                System.out.println("Record Not Deleted");
            }
            con.close();
            stmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void searByYear(Student s){
        {
            String sql = "SELECT * FROM student2 WHERE year=?";
            try{
                Connection con = getConncection();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1,s.getYear());

                ResultSet result = stmt.executeQuery();
                while(result.next()) {
                    int rno = result.getInt(1);
                    String name = result.getString(2);
                    int marks = result.getInt(3);
                    int yr = result.getInt(4);
                    Student s1 = new Student(rno, name, marks, yr);
                    System.out.println(s1);
                }
                stmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }

    public void getRecord(int yr , String grade){
        {
            String query;

            if (grade.equalsIgnoreCase("First")) {
                query = "SELECT * FROM student2 WHERE year = ? AND marks >= 65";
            } else if (grade.equalsIgnoreCase("Second")) {
                query = "SELECT * FROM student2 WHERE year = ? AND marks < 65";
            } else {
                query = "SELECT * FROM student2 WHERE year = ?";
            }

            try {
                Connection con = getConncection();
                PreparedStatement stmt = con.prepareStatement(query);

                stmt.setInt(1, yr);

                ResultSet result = stmt.executeQuery();

                while (result.next()) {
                    Student s = new Student(
                            result.getInt("rollno"),
                            result.getString("name"),
                            result.getInt("marks"),
                            result.getInt("year")
                    );

                    System.out.println(s);
                }

                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
