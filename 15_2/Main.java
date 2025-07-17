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
	      	        	      String sql="SELECT * FROM item";
	      	        	      PreparedStatement pStmt=con.prepareStatement(sql);
	      	        	      ResultSet rs=pStmt.executeQuery();
	      	        	      while(rs.next()) {
	      	        		           String id=rs.getString("item_id");
	      	        		           System.out.println("商品ID:"+id);
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