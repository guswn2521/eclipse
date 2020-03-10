package chap03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int com1 = 0, com2 = 0, com3 = 0;
		
		while(com1 == com2 && com2 == com3 && com3 == com1) {
			com1 = (int)(Math.random()*9+1); // 1<com<1000
			com2 = (int)(Math.random()*9+1); 
			com3 = (int)(Math.random()*9+1);
			System.out.printf("%s%s%s",com3,com2,com1);
		}
		
		String rs1 = "";
		String rs2 = "";
		String rs3 = "";
		
		int i = 0, j = 0, k = 0, n=0;
	
		
		do {
			int user = sc.nextInt();
			n++;
			
			i=0; j=0; k=0;			
			
			int a = (user/100) ;
			int b = (user / 10) % 10;
			int c = user % 10;
			
			if(a==com3 || b==com2 || c==com1) {
				if(a==com3) i++;
				if(b==com2) i++;
				if(c==com1) i++;
				rs1 = i + "S";}
			
			if (a==com2 || a==com1 || b==com1 || b==com3|| c==com2 || c==com3){
				if(a==com2) j++;
				else if(a==com1) j++;
				if(b==com1) j++;
				else if(b==com3) j++;
				if(c==com3) j++;
				else if(c==com2) j++;
				rs2 = j + "B";}

			k=3-i-j;
			rs3 = k+ "O";
		
		System.out.printf("%sS %sB %sO%n",i,j,k);
		
		if (i == 3) {
			System.out.printf("3S %n%s 회시도",n);
			break;
		}			
			}while(n<=10);
		
		
	}
}
