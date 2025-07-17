import java.util.Scanner;
import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class SelectCustomer{
	      public static void main(String[] args){
	      	         System.out.println("顧客IDを入力してください");
	      	         Scanner sc = new Scanner(System.in);
	      	         int i = sc.nextInt();
	      	         CustomerDAO customerDAO = new CustomerDAO();
	      	         List<Customer>customerList=customerDAO.findID(i);
	      	        
	      	         for (Customer customer:customerList){
	      	         	       System.out.println("顧客ID:"+customer.getId());
	      	         	       System.out.println("　氏名:"+customer.getName());
	      	         }
	      }
}