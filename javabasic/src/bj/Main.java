package bj;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1;i<10001;i++) {
			arr.add(i);
		}
		
		for(int i=0;i<10000;i++) {
			for(int j=0;j<arr.size();j++) {
				if(d(i) == arr.get(j)) {
					arr.remove(j);
				}
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		int n=0;
		while(n<=10000) {
			n++;
			n = d(n);
		}
		
		
		
		
	}
	static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum = sum + n%10;
			n = n/10;
		}
		return sum;
	}
	
}
