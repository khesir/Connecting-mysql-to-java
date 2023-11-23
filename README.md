# OOP-Gui
This is a activity exercise from class CS 2136 Object-Oriented Programming where we create a basic GUI and have mysql database installed.

## Mysql Setup and connection set up
1. Download the mysql j connector and add the jar file to the project library
then there add the database from the services tab (If ever you are using Apache netbeans

2. To establish the database connection you have to this
```java 
String dburl = "jdbc:mysql://localhost:3306/javadb";
String dbuser = "root";
String dbpassword = "root";
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(dburl,dbuser,dbpassword);
    statement = con.createStatement();
} catch(Exception e){
    System.err.println(e);
}
```
3. Here are the basic commands for CRUD application
```java
public void update(String query)throws Exception{
  statement.executeUpdate(query);
}
public ResultSet query(String query)throws Exception{
  return statement.executeQuery(query);
}
```
