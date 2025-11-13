public class Main{
	public static void main(String[] args){
		int sum;
		sum = add(1,2);
		System.out.println(sum);
		sum = add(1,3);
		System.out.println(sum);
	}
	public static int add(int x,int y){
		int sum = x + y;
		return sum;
	}
}