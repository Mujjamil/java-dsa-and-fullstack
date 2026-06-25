package com.bitcode.mysql;

import java.sql.*;

public class DbUtil {

    static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/demodb";
            String username = "root";
            String password = "Mujjamil@7219";

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return con;
    }
    //insert
    public void insertRec(Student s){

            String str = "INSERT INTO student(roll,name,marks,year) VALUES (?,?,?,?)";

            try{
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(str);
                stmt.setInt(1,s.getRollno());
                stmt.setString(2,s.getName());
                stmt.setInt(3,s.getMarks());
                stmt.setInt(4,s.getYear());

              int rows = stmt.executeUpdate();
                if(rows>0){
                    System.out.println("Record Inserted successfully!!");
                }else{
                    System.out.println("Insert Query Failed!!");
                }
                con.close();


            }catch (SQLException e){
                e.printStackTrace();

            }


    }

    //read the record
    public void readRecord(){
        String str = "SELECT * FROM student";


        try{
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(str);
            while(result.next()){
                int rno = result.getInt("roll");
                String name = result.getString("name");
                int marks = result.getInt("marks");
                int yr = result.getInt("year");

                Student s = new Student(rno,name,marks,yr);
                System.out.println(s);
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    //Update the Record
    public void updateRecord(Student s){

        String str = "UPDATE student SET marks = ? WHERE roll=?";

        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setInt(1,s.getMarks());
            stmt.setInt(2,s.getRollno());

            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Record Updated!!");
            }
            else{
                System.out.println("Record not Updated");
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //Delete Record
    public void deleteRecord(Student s){

        String str = "DELETE FROM student WHERE roll=?";

        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setInt(1,s.getRollno());
            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Record Deleted Successfully!!");
            }
            else{
                System.out.println("Record not Updated");
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //sear by year
    public void searchByYear(Student s){
        String str = "SELECT * FROM student WHERE year=?";


        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setInt(1,s.getYear());

            ResultSet result = stmt.executeQuery(str);
            while(result.next()){
                int rno = result.getInt(1);
                String name = result.getString(2);
                int marks = result.getInt(3);
                int yr = result.getInt(4);
                Student s1 = new Student(rno,name,marks,yr);
                System.out.println(s1);
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void getRecord(int yr, String grade) {

        String query;

        if (grade.equalsIgnoreCase("First")) {
            query = "SELECT * FROM student WHERE year = ? AND marks >= 65";
        } else if (grade.equalsIgnoreCase("Second")) {
            query = "SELECT * FROM student WHERE year = ? AND marks < 65";
        } else {
            query = "SELECT * FROM student WHERE year = ?";
        }

        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setInt(1, yr);

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Student s = new Student(
                        result.getInt("roll"),
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

//Display the list of the student who scored first class in perticular year == solved
//Cretae a Menu Driven Program For Student record Manipulation and read the values from the user
//year marks list of students. == solved
//who passed with first class in the year specified. == solved