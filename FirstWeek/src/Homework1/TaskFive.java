package Homework1;
import java.util.*;
public class TaskFive {

	public static void main(String[] args) {
		System.out.println("введіть 2 числа");
		Scanner first=new Scanner(System.in);
		int a= first.nextInt();
		Scanner second=new Scanner(System.in);
		int b= second.nextInt();
		
		if(a>b) {
			System.out.println(a-b);
			}
		else {
			System.out.println(a*b);
		}
		


		
	}
}
