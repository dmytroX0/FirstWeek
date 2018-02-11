package Homework1;
import java.util.*;
public class TaskSeven {

	public static void main(String[] args) {
		System.out.println("введіть 2 числа");
		Scanner first=new Scanner(System.in);
		float a= first.nextInt();
		Scanner second=new Scanner(System.in);
		float b= second.nextInt();
		float c = a/b;
		
		if((a%b)==0) {
			System.out.println("true:" + c);
			}
		else {
			System.out.println("false:" + c);
		}
	}

}