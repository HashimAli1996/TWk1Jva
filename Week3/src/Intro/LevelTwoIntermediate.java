package Intro;

public class LevelTwoIntermediate {

	public static void main(String[] args) {
		//blackJack(0, 0);
		uniqueSum(1,2,3);
	}
	
	
	public static void blackJack(int a, int b) {
		if(a > 21 && b > 21) {
			System.out.println(0);
		} else if(a == 0 && b == 0) {
			System.out.println(0);
		} else {
			if(a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}
	
	public static void uniqueSum(int a, int b, int c) {
		
		if ((a == b) && (a == c)) 
		{
			System.out.println(0);
		} else if (a == b) 
		{
			int sum = b + c;
			System.out.println(sum);					
		} else if (a == c) 
		{
			int sum = b + c;
			System.out.println(sum);
		} else if (b == c) 
		{
			int sum = a + c;
			System.out.println(sum);
		} else 
		{
			int sum = a + b + c;
			System.out.println(sum);
		}
	}

}
