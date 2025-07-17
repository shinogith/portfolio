import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class SelectCustomer{
	      public static void main(String[] args){
	      	         DatabaseConnection con = new DatabaseConnection();
	      	         CustomerDAO customerDAO = new CustomerDAO(con.getConnection());
	      	         List<Customer>customerList=customerDAO.findAll();
	      	        
	      	         for (Customer customer:customerList){
	      	         	       System.out.println("顧客ID:"+customer.getId());
	      	         	       System.out.println("　氏名:"+customer.getName());
	      	         }
	      	
	      	         con.close();
	      }
}