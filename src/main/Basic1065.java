package main;

import java.util.Scanner;

public class Basic1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a%2 == 0) System.out.println(a);
		if(b%2 == 0) System.out.println(b);
		if(c%2 == 0) System.out.println(c);
			
	}
}