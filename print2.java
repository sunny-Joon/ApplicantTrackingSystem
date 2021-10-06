package ats;

import java.io.*;  
import java.sql.*;  

public class print2 {
	public static void main(String[] args)
	{
    try {
      Class.forName("com.mysql.jdbc.Driver");
  } catch (ClassNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
  }
try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");
    Statement select = con.createStatement();
    ResultSet result = select.executeQuery
                        ("select * from resume order by ranking desc;");         

    System.out.println("Got results:");
    System.out.println(result+" ");
    FileWriter fw = new FileWriter("D:\\retrievefile.txt"); 
    BufferedWriter bw = new BufferedWriter(fw);
    while(result.next()) 
    {  
        try{
                bw.write(String.valueOf(result.getString("name"))+" ");// \n is for to write in a new Line .  
                //bw.newLine();
                bw.write(String.valueOf(result.getString("phoneno"))+" "); 
                bw.write(String.valueOf(result.getString("dob"))+" ");
                bw.newLine();
        }  
        catch (Exception e) {  
            System.out.println("Errrrr......... writing to a file..... :P"+e);  
        }            
    }  
    bw.close();
    select.close();
    con.close();
  }
  catch( Exception e ) {
    e.printStackTrace();
  }
	
}}
