package main;

import java.util.Scanner;

public class Basic1056 {

	public static void main(String[] args) {
		
		int result = 1;
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성(sc)
		String tnf = sc.nextLine();
		sc.close();
		
		String[] arr = tnf.split(" ");
		
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		
		if(n1 == 1 && n2 == 1) result = 0;
		if(n1 == 0 && n2 == 0) result = 0;
		
		System.out.println(result);
		
	}
}