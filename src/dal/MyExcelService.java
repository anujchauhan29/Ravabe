package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static Utility.WriteToExcel.writeExcel;
import static Utility.AppendToExcel.appendExcel;
public class MyExcelService {
	   
	   //JDBC driver name and database URL
	   private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	   //Database credentials
	   private static final String USER = "root";
	   private static final String PASS = "umang";
	   
	   private static Connection conn = null;
	   private static Statement stmt = null;
	   private static PreparedStatement ps=null;
	   private static ResultSet rs=null;

       static{
    	   
    	   try{
    	      //STEP 1: Register JDBC driver
    	      Class.forName(JDBC_DRIVER);
    	   }
    	   catch(Exception e){
    		   System.out.println("driver not found");
    	   }
       }
	   
       public static Connection openConnection(){
    	 //STEP 2: Open a connection
 	      System.out.println("Connecting to database...");
 	      try{
 	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
          return conn;
 	      }
 	      catch(Exception e){
 	    	  System.out.println("Connection not established");
 	    	  return conn;
 	      }
       }
       
       public static void insertData(){
    	   try{
    		   conn=openConnection();
    		   //STEP 3: Create a query
    		   System.out.println("Creating statement...");
    		   String query;
    		   query = "insert into emp values(?,?,?)";
               ps=conn.prepareStatement(query);
    		   ps.setInt(1,5);
    		   ps.setString(2, "veeru");
    		   ps.setFloat(3, 500000);
    		   //STEP 4: Execute a query
    		   ps.execute();
    		   System.out.println("Data Inserted");
    		   //STEP 5: Closing the connection
    		   ps.close();
    		   conn.close();
    	   }
    	   catch(Exception e){
    		   System.out.println(e.getMessage());
    	   }
       }
       
       public static void fetchData(){
    	   try{
    		   conn=openConnection();
    		 //STEP 3: Create a query
    		   System.out.println("Creating statement...");
    		   String query;
    		   query = "select * from emp";
    		   stmt=conn.createStatement();
    		   rs=stmt.executeQuery(query);
    		   appendExcel(rs);
    		 //STEP 4: Extract data from result set
    		      //while(rs.next()){
    		         //Retrieve by column name
    		        // int id  = rs.getInt("id");
    		         //String name = rs.getString("name");
    		         //float salary=rs.getFloat("salary");

    		         //Display values
    		         //System.out.println("ID: " + id);
    		         //System.out.println("Name: "+ name);
    		         //System.out.println("Salary: "+ salary);
    		         
    		      //}
    		      rs.close();
    		      stmt.close();
    		      conn.close();
    	   }
    	   catch(Exception e){
    		   System.out.println(e.getMessage());
    	   }
       }
	   
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyService ob=new MyService();
		//ob.insertData();
		//MyService.insertData();
		 MyExcelService.fetchData();

	}

}
