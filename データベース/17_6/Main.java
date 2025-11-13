import java.util.List;

public class Main{
	      public static void main (String[] args){
	      	        List<String> name = NameList.addName();
	      	        if (name.contains("岩見沢隆")) name.remove(name.indexOf("岩見沢隆"));
	      	        for(int i=0;i<name.size();i++){
	      	        	     System.out.println(i+":"+name.get(i));
	      	        }
	      }
}