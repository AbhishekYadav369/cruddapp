package com.java.crudapp;
import java.sql.*;

public class StudentDAO {

    private static final String url="jdbc:mysql://localhost:3306/crud";
    private static final String user="root";
    private static final String password="Abhi123.321";
    private Connection connection;
    ResultSet resultSet= null;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,user,password);
        }catch(Exception exception){ System.out.println(exception.getMessage());}
    }
    public void disconnect() throws SQLException { connection.close();}


    //read

    public ResultSet readStudent(String sName,String pName) throws SQLException {
        connect();

        String query="select * from student where sName=?and pName=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,sName);
            statement.setString(2,pName);
            resultSet= statement.executeQuery();
            statement.close();
            disconnect();
        }catch(Exception e){ System.out.println(e.getMessage());}
      return resultSet;
    }


    //create(add value)
    public void addStudent(Student student) {
        connect();
        String query="insert into student values(?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            //set methods is used for setting values for collumns
            statement.setInt(1,student.getsId());
            statement.setString(2,student.getsName());
            statement.setString(3,student.getpName());
            statement.setInt(4,student.getsClass());
            statement.setString(5,student.getPhoneNumber());
            statement.executeUpdate();
            statement.close();
            disconnect();

        }catch(Exception e){ System.out.println(e.getMessage());}
    }


    //update
    public void updateStudent(Student student,String sName,String pName) {
        connect();
        String query="update student set sName=?,pName=?,sClass=?,phoneNo=? where sName=? and pName=?";

        try{
            PreparedStatement statement=connection.prepareStatement(query);

                statement.setString(1,student.getsName());
                statement.setString(2,student.getpName());
                statement.setInt(3,student.getsClass());
                statement.setString(4,student.getPhoneNumber());
                statement.setString(5,sName);
                statement.setString(6,pName);
               statement.executeUpdate();
               statement.close();
               disconnect();

        }catch(Exception e){ System.out.println(e.getMessage());}
        addStudent(student);
        System.out.println("Record not found hence new entry added");
    }

    //delete
    public void deleteStudent(String sName,String pName) {
        connect();
        String query1="set sql_safe_updates=0";
        String query2="set sql_safe_updates=1";
        String query = "delete from student where sName=? and pName=?";

         try {
             PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,sName);
            statement.setString(2,pName);
            statement.executeUpdate();
            statement.close();
            disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
