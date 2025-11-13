package model;

public class Order {
	      private int order_id;
	      private java.sql.Date order_date;
	      private int customer_id;
	      private String customer_name;
	      public Order(){
	      }
	      public Order(int order_id,java.sql.Date order_date,int customer_id,String customer_name){
		           this.order_id=order_id;
	               this.order_date=order_date;
	               this.customer_id=customer_id;
	      	       this.customer_name = customer_name;
	      }
	      public int getOrderId(){return order_id;}
	      public java.sql.Date getOrderDate(){ return order_date; }
	      public int getCustomerId(){return customer_id;}
	      public String getCustomerName(){ return customer_name; }
}	