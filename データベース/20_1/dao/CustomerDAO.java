package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class CustomerDAO {
	      private Connection con;

	      public CustomerDAO(Connection con){
	      	         this.con=con;
	      }
	      	
	      public List<Customer>findAll(){
		             List<Customer>customerList=new ArrayList<>();
	      	         try{
	      	         	      String sql="SELECT* FROM customer";
	      	         	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	         	      ResultSet rs=pStmt.executeQuery();
	      	         	      while(rs.next()){
	      	         	               int id=rs.getInt("customer_id");
	      	         	               String name = rs.getString("customer_name");
	      	         	               Customer customer = new Customer(id,name);
	      	         	               customerList.add(customer);
	      	         	      }
	      	         }catch(SQLException e){
	      	          	      e.printStackTrace();
	      	         }
	      	         return customerList;
	      }
}	