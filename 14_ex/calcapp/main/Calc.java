package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args){
		int result;
		result = CalcLogic.multiply(3,2);
		System.out.println(result);
	}
}