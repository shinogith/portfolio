package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class CustomerDAO {
	      private final String JDBC_FQCN="org.h2.Driver";
	      private final String JDBC_URL= "jdbc:h2:~/omdb";
	      private final String DB_USER ="sa";
	      private final String DB_PASS ="";
	
	      public List<Customer>findName(String s){
		             List<Customer>customerList=new ArrayList<>();
	      	         try{
	                          Class.forName(JDBC_FQCN);
	      	         }catch(ClassNotFoundException e){
	      	          	      throw new IllegalStateException("ドライバのロードに失敗しました");
	      	         }
	      	
	      	         Connection con=null;
	      	         try{
	                          con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
	      	         	      String sql="SELECT* FROM customer WHERE customer_name = ?";
	      	         	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	         	      pStmt.setString(1,s);
	      	         	      ResultSet rs=pStmt.executeQuery();
	      	         	      while(rs.next()){
	      	         	               int id=rs.getInt("customer_id");
	      	         	               String name = rs.getString("customer_name");
	      	         	               Customer customer = new Customer(id,name);
	      	         	               customerList.add(customer);
	      	         	      }
	      	         }catch(SQLException e){
	      	          	      e.printStackTrace();
	      	         }finally{
	      	         	      if(con!=null){
	      	         		          try{
	      	         		          	        con.close();
	      	         		          }catch(SQLException e){
	      	          	                        e.printStackTrace();
	      	         		          }
	      	         	      }
	      	         	      return customerList;
	      	         }
	      }
}	
