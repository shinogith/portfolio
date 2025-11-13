public class Main{
	public static void main(String[] args){
		int[] x;
		x = new int[]{1,2};
		add(x);
		x[1] = 3;
		add(x);
	}
	public static void add(int[] x){
		int sum = x[0] + x[1];
		System.out.println(sum);
	}
}