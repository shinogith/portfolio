import java.util.Scanner;
import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class SelectCustomer{
	      public static void main(String[] args){
	      	         System.out.println("氏名を入力してください");
	      	         Scanner sc = new Scanner(System.in);
	      	         String s = sc.nextLine();
	      	         CustomerDAO customerDAO = new CustomerDAO();
	      	         List<Customer>customerList=customerDAO.findName(s);
	      	        
	      	         for (Customer customer:customerList){
	      	         	       System.out.println("顧客ID:"+customer.getId());
	      	         	       System.out.println("　氏名:"+customer.getName());
	      	         }
	      }
}