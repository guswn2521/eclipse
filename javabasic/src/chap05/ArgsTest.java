package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		Args arg = new Args();
		
		int [] arr = new int[1];
		
		int x = 200; //stack에 만들어짐
		arg.add(x); //
		System.out.println(x);
		
		
		arg.x = 100;
		//값 ->복사본
	
		arg.add(arg.x);
		
		System.out.println("arg.x =" + arg.x);
		
		//참조변수 전달(주소 => 전달)
		arg.add(arg); //Heap에 만들어짐
		System.out.println("arg.x=" + arg.x);
		
		arg.addNew(arg);
		System.out.println(arg);
		
		
		arg.add(arr);//default = 0;
		System.out.println("arr[0] = " + arr[0]);
		
		
		//Args arg = new Args();
		Args arg2 = new Args();
		
		arg.x = 100;
		arg2.x = 200;
		
		
		Car car = new Car();
		car.add(arg,arg2);

	}

}
