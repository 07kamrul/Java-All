package Enum;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		
		String ch;
		do {
		Enum []months = Enum.values();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Input : ");
		String str = input.next();
		
		for(Enum month : months) {
			//System.out.println("Month Name : "+month.getMonthName()+" "+month.getDays());
		
			switch(str) {
			case "JANUARY" :
				if(month.name() == "JANUARY") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "FEBRUARY" :
				if(month.name() == "FEBRUARY") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "MARCH" :
				if(month.name() == "MARCH") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "April" :
				if(month.name() == "JANUARY") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "MAY" :
				if(month.name() == "MAY") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "JUNE" :
				if(month.name() == "JUNE") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "JULY" :
				if(month.name() == "JULY") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "AUGUST" :
				if(month.name() == "AUGUST") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "SEPTEMBER" :
				if(month.name() == "SEPTEMBER") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "OCTOBER" :
				if(month.name() == "OCTOBER") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "NOVEMBER" :
				if(month.name() == "NOVEMBER") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			case "DECEMBER" :
				if(month.name() == "DECEMBER") {
					System.out.println("Month Name : "+month.getMonthName());
					System.out.println("Date : "+month.getDays());
				}
				break;
			}
		}
		
		}while(true);
		/*
		 * String check = Enum.contains("Mac"); if(check == null) {
		 * System.out.println("Not FOund"); } else { System.out.println("Check"); }
		 */
	}
}
