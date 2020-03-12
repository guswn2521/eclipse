package chap09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2"); //맨 마지막
		
		q.offer("0");
		q.offer("1");
		q.offer("2"); //맨 마지막
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		//System.out.println(st.pop());
		System.out.println(q.poll());
		

	}

}
