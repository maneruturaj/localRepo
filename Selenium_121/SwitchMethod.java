package Selenium_121;

import java.util.Scanner;

import org.openqa.selenium.By;

public class SwitchMethod {

	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number from 1 to 7  ");
		
		int i =sc.nextInt();
		System.out.println("you have entered : " + i);
		
		
			switch (i)
			{
				case 1:
				System.out.println("Monday");
			
				
				case 2:
				System.out.println("Tuesday");
				break;
				
				case 3:
				System.out.println("Wednesday");
				break;
				
				case 4:
				System.out.println("Thursday");
				break;
				
				case 5:
				System.out.println("Friday");
				break;
				
				case 6:
				System.out.println("Saturday");
				break;
				
				case 7:
				System.out.println("SundayDay");
				break;
			}
	}	

}
