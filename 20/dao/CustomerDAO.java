package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class CustomerDAO {
	private Connection con;

	public CustomerDAO(Connection con) {
		this.con = con;
	}

	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM customer";
			PreparedStatement pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("customer_id");
				String name = rs.getString("customer_name");
				Customer customer = new Customer(id, name);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return customerList;
	}

	public void insert(Customer customer) {
		try {
			String sql = "INSERT INTO customer (customer_id, customer_name) VALUES (?, ?)";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, customer.getId());
			pStmt.setString(2, customer.getName());
			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	public void delete(int i) {
		try {
			String sql = "DELETE FROM customer WHERE customer_id = ?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, i);
			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
