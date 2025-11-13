package dao;

import java.sql;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class CustomerDAO {
	      private final String JDBC_FQCN="org.h2.Driver";
	      private final String JDBC_URL= "jdbc:h2:~/omdb";
	      private final String DB_USER ="sa";
	      private final String DB_PASS ="";
	
	      public List<Customer>findAll(){
		             List<Customer>customerList=new ArrayList<>();
	      	         try{
	                          Class.for.name(JDBS_FQCN);
	      	         }catch(ClassNotFoundException e){
	      	          	      throw new IlligalStateException("ドライバのロードに失敗しました");
	      	         }
	      	
	      	         Connection con=null;
	      	         try{
	                          con = DriverManager.getConnection(JDBS_URL,DB_USER,DB_PASS);
	      	         	      String sql="SELECT* FROM customer";
	      	         	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	         	      ResultSet rs=pStmt.executeQuery();
	      	         	      while(rs.next()){
	      	         	               String id=rs.getString("customer_id");
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