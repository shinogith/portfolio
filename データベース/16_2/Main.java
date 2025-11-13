import java.sql. *;

public class Main {
	      public static void main(String[] args){
	      	        try{
	      	        	      Class.forName("org.h2.Driver");
	      	        } catch(ClassNotFoundException e) {
	      	        	      throw new IllegalStateException("ドライバのロードに失敗しました");
	      	        }
	      	        Connection con=null;
	      	        try {
	      	        	      con=DriverManager.getConnection("jdbc:h2:~/omdb","sa","");
	      	        	      String sql="SELECT * FROM customer";
	      	        	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	        	      ResultSet rs=pStmt.executeQuery();
	      	        	      while(rs.next()) {
	      	        		           String id=rs.getString("customer_id");
	      	        	      	       String name=rs.getString("customer_name");
	      	        		           System.out.println("顧客ID:"+id);
	      	        	      	       System.out.println("氏名:"+name);
	      	        	      }
	      	        } catch (SQLException e){
	      	        	      e.printStackTrace();
	      	        }finally{
	      	        	      if (con!=null){
	      	        	      	       try{
	      	        	      	       	        con.close();
	      	        	      	       } catch(SQLException e){
	      	        	      	           	    e.printStackTrace();
	      	        	      	       }
	      	        	      }
	      	        }
	      }	        	
}