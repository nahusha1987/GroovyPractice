import groovy.sql.Sql
import java.sql.DriverManager

//DriverManager.registerDriver(new com.mysql.jdbc.Driver())
Class.forName("com.mysql.jdbc.Driver")
sql = Sql.newInstance("jdbc:mysql://127.0.0.1:3306/springdb","root","password","com.mysql.jdbc.Driver")
//sql.eachRow("select * from account", {println it})

row = sql.firstRow("select name, isactive from account")
//println "Name: $row.name, IsActive: $row.isactive"

accountNumber = 3
name = "nahusha"
isactive = 1
city = "Bangalore"
country = "India"
balance = 100
emailaddress = "n.nahusha@gmail.com"

//sql.execute("insert into account (accountNumber,name,isactive,city,country,balance,emailaddress) values (accountNumber,name,isactive,city,country,balance,emailaddress)")
sql.execute("insert into account (accountNumber,name,isactive,city,country,balance,emailaddress)" + "values(?,?,?,?,?,?,?)", [accountNumber,name,isactive,city,country,balance,emailaddress])