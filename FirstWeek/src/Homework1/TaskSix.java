package Homework1;
import java.util.*;
public class TaskSix {

	public static void main(String[] args) {
		System.out.println("введіть 2 числа");
		Scanner first=new Scanner(System.in);
		int a= first.nextInt();
		Scanner second=new Scanner(System.in);
		int b= second.nextInt();
		int c = a + b;
		
		if((c>=11)&&(c<=19)) {
			System.out.println(c);
			}
		else {
			System.out.println(false);
		}
		
	}


}