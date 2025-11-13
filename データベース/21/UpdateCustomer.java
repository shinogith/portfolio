import java.util.Scanner;
import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class UpdateCustomer{
	      public static void main(String[] args){
	      	         DatabaseConnection con = new DatabaseConnection();
	      	         System.out.println("顧客IDを入力してください");
	      	         Scanner sc = new Scanner(System.in);
	      	         int i = sc.nextInt();
	      	         System.out.println("氏名を入力してください");
	      	         String s = sc.next();
	      	         
	      	         Customer customer = new Customer();
	      	         customer.setId(i);
	      	         customer.setName(s);
	              	 CustomerDAO customerDAO =new CustomerDAO(con.getConnection());
	      	         customerDAO.update(customer);

	      	         con.close();
	      }
}