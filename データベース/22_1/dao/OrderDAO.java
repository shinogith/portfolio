package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Order;

public class OrderDAO {
	      private Connection con;

	      public OrderDAO(Connection con){
	      	         this.con=con;
	      }
	      	
	      public List<Order>findAll(){
		             List<Order>orderList=new ArrayList<>();
	      	         try{
	      	         	      String sql="SELECT order_id, order_date, order_list.customer_id, customer_name FROM order_list JOIN customer ON order_list.customer_id=customer.customer_id";
	      	         	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	         	      ResultSet rs=pStmt.executeQuery();
	      	         	      while(rs.next()){
	      	         	               int order_id=rs.getInt("order_id");
	      	         	               java.sql.Date order_date = rs.getDate("order_date");
	      	         	      	       int customer_id=rs.getInt("customer_id");
	      	         	               String customer_name = rs.getString("customer_name");
	      	         	      	       Order order=new Order(order_id,order_date,customer_id,customer_name);
	      	         	               orderList.add(order);
	      	         	      }
	      	         }catch(SQLException e){
	      	          	      e.printStackTrace();
	      	         }
	      	         return orderList;
	      }
}	