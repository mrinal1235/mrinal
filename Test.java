package pack2;

import java.util.Scanner;

class Test{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("first no");
		int m =s.nextInt();
		System.out.println("enter last no");
		int n=s.nextInt();
		l1:
			for (int i = m; i <n; i++) {
				for (int j = 2; j <i; j++){
				if(i%j==0)
					continue l1;}
		
				System.out.println(i);
				
				
			
			
		
		
	}
}}
	




