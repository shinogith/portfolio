import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class SelectCustomer{
	      public static void main(String[] args){
	      	         CustomerDAO customerDAO = new CustomerDAO();
	      	         List<Customer>customerList=customerDAO.findAll();
	      	        
	      	         for (Customer customer:customerList){
	      	         	       System.out.println("顧客ID:"+customer.getId());
	      	         	       System.out.println("　氏名:"+customer.getName());
	      	         }
	      }
}