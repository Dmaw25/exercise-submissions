package com.rev.CodeChallenge;

import java.util.Scanner;


public class CodingChallenge extends CodeChallengeUtility{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not gonna do so much commenting in my main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Input start gene: Must be 8 numbers and a config of letters ACTG:");
		String geneStart = sc.nextLine();
		System.out.println("Input end gene: Must be 8 numbers and a config of letters ACTG:");
		String geneEnd = sc.nextLine();
  

		System.out.println("Input a number:");
		int num = sc.nextInt();
		String[] banking = new String[num];
		
		for(int i = 0; i < banking.length; i++)
		{
			System.out.println("Input anouther gene:");
			banking[i] = sc.nextLine();
		}
		
		System.out.println(MinimumMutation(geneStart,geneEnd,banking));
		sc.close(); 
	}
	
	

}
