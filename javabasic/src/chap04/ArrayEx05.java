package chap04;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] score = {100, 88, 100, 100, 90};
		int sum = 0;
		double avg = 0.0;
		for(int scores : score) {
			System.out.print(scores + "\t");
			sum += scores;
			
		}
		System.out.println();
		avg = (double)sum / score.length;
		System.out.println(sum);
		System.out.println(avg);

	}

}
