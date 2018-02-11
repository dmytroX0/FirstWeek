package Homework1;
import java.util.*;
public class TaskTen {

	public static void main(String[] args) {
		System.out.println("press 1 to convert from binary to decimal - press 2 to convert from decimal to binary");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a==1) {

		    Scanner input = new Scanner(System.in);
		    int binaryN = 0;
		    int counter = 0;
		    int Fnumber = 0;


		    System.out.println("ввести двійкове число: ");
		    binaryN = input.nextInt();
		    while(binaryN != 0)
		    {

		        Fnumber += ((binaryN % 10)) * Math.pow(2,counter);
		        binaryN /= 10;  
		        counter++;

		    }
		    System.out.println("десяткове число : " + Fnumber);
		}
		else if(a==2) {
			System.out.println("введіть десяткове число!");
			Scanner sc=new Scanner(System.in);
		    int decimal=sc.nextInt();

		    String binary="";

		    if(decimal<=0)
		    {
		        System.out.println("Please Enter more than 0");

		    }
		    else
		    {
		        while(decimal>0)
		        {

		            binary=(decimal%2)+binary;
		            decimal=decimal/2;

		        }
		        System.out.println("двійкове число:"+binary);

		    }
		}


		}

	}
