import java.util.ArrayList;

public class Main{
	      public static void main(String[] args){
	      	         ArrayList<String> name = new ArrayList<String>();
		             name.add("札幌太郎");
	      	         name.add("岩見沢隆");
	      	         name.add("江別花子");
	      	         for(int i=0;i<name.size();i++){
	      	         	      System.out.println(i+":"+name.get(i));
	      	         }
	      }
}