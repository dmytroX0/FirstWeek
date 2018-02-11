package Homework1;

import java.util.Scanner;

public class TaskNine {

	public static void main(String[] args) {
		System.out.println("введіть число");
		Scanner first=new Scanner(System.in);
		int a = first.nextInt();
		String s = String.valueOf(a);
		int count = s.length() - s.replace("5", "").length();
		System.out.println("число 5 зусрічається - " + count + " разів");

	}

}
