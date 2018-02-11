package Homework1;

import java.util.*;

public class TaskTwo {

	public static void main(String[] args) {
		System.out.println("введіть три числа");
		Scanner one=new Scanner(System.in);
		int a= one.nextInt();
		Scanner two=new Scanner(System.in);
		int b= two.nextInt();
		Scanner three=new Scanner(System.in);
		int c= three.nextInt();
		{
		if(a>b&&a>c) {
			System.out.println("a-max");
			}
		else if(b>a&&b>c) {
			System.out.println("b-max");
			}
		else if(c>a&&c>b) {
			System.out.println("c-max");
			}
		}
		if(a<b&&a<c) {
			System.out.println("a-min");
			}
		else if(b<a&&b<c) {
			System.out.println("b-min");
			}
		else if(c<a&&c<b) {
			System.out.println("c-min");
			}
	}

}
