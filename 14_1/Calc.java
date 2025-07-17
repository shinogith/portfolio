public class Calc {
	public static void main(String[] args){
		int result;
		result = add(1,2);
		System.out.println(result);
		result = subtract(2,1);
		System.out.println(result);
	}
	public static int add(int x,int y){
		return x + y;
	}
	public static int subtract(int x,int y){
		return x - y;
	}
}