package Homework1;
import java.util.*;
public class TaskEight {

	public static void main(String[] args) {
		
		System.out.println("введіть 2 числа");
		for (int i = 1; i <= 4; i++) {
		Scanner first=new Scanner(System.in);
		int a= first.nextInt();
		Scanner second=new Scanner(System.in);
		int b= second.nextInt();
		if ((a%10)==(b%10)){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		}
	}

}
