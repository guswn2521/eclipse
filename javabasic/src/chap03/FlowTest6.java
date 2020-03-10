package chap03;

public class FlowTest6 {

	public static void main(String[] args) {
		String job = "대표";
		int salary = 0;
		
		switch(job) {
		case "사원":
			salary = 2_000_000;
			break;
		case "대리":
			salary = 3_000_000;
			break;
		case "과장":
			salary = 4_000_000;
			break;
		case "부장":
			salary = 5_000_000;
			break;
		default:
			salary = 100;
		}
		System.out.println(salary);

	}

}
