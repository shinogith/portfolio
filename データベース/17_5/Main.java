import java.util.ArrayList;

public class Main{
	      public static void main(String[] args){
	      	         ArrayList<Integer>price = new ArrayList<Integer>();
		             price.add(1990);
	      	         price.add(2990);
	      	         price.add(3990);
	      	         for(int i=0;i< price.size();i++){
	      	         	       System.out.println(i+":"+price.get(i)+"円");
	      	         }
	      }
}