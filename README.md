# Connecting MySql to Java projects
This is a guide to how to connect MySQL to any java project

## Mysql Setup and connection set up
1. Download MySQL-connector-j and add it to your dependecies folder
2. Setup your MySQL database
3. To establish the database connection you have to this
```java
// The given information may varies on what database you are using
String dburl = "jdbc:mysql://localhost:3306/javadb";
String dbuser = "root";
String dbpassword = "root";
try{
    // This is the mysql-connector-j 
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(dburl,dbuser,dbpassword);
    statement = con.createStatement();
} catch(Exception e){
    System.err.println(e);
}
```
3. Here are the basic commands for CRUD application
```java
// Query such as that updates the database
public void update(String query)throws Exception{
  statement.executeUpdate(query);
}
// Query such as does not affect the state of the database
public ResultSet query(String query)throws Exception{
  return statement.executeQuery(query);
}
```
