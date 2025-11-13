import java.util.List;
import model.Order;
import dao.OrderDAO;

public class SelectOrder{
	      public static void main(String[] args){
	      	         DatabaseConnection con = new DatabaseConnection();
	      	         OrderDAO orderDAO = new OrderDAO(con.getConnection());
	      	         List<Order>orderList= orderDAO.findAll();
	      	        
	      	         for (Order order:orderList){
	      	         	       System.out.println("注文ID:"+order.getOrderId());
	      	         	       System.out.println("注文日:"+order.getOrderDate());
	      	         	       System.out.println("顧客ID:"+order.getCustomerId());
	      	         	       System.out.println("　氏名:"+order.getCustomerName());
	      	         }
	      	
	      	         con.close();
	      }
}