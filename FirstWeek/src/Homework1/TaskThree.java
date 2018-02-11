package Homework1;
import java.util.*;
public class TaskThree {

	public static void main(String[] args) {
		System.out.println("введіть число");
		Scanner one=new Scanner(System.in);
		int a= one.nextInt();
		int b= a%7;
		if(b==0) {
			System.out.println(a*2);
		}
		else {
			System.out.println("wrong number");
		}
		

	}

}
