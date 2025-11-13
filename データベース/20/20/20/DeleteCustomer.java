import java.util.Scanner;
import java.util.List;
import model.Customer;
import dao.CustomerDAO;

public class DeleteCustomer {
	public static void main(String[] args) {
		DatabaseConnection con = new DatabaseConnection();

		System.out.println("顧客IDを入力してください");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		CustomerDAO customerDAO = new CustomerDAO(con.getConnection());
		customerDAO.delete(i);

		con.close();
	}
}
