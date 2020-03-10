package test2;

import test1.PrivateData;

public class PriavteAccess extends PrivateData {
	
	void printVar() {
		System.out.println("protectedVar = " + protectedVar);
	}
	
	public static void main(String[] args) {
		PrivateData pd = new  PrivateData();
		PriavteAccess pa = new PriavteAccess();
		pa.printVar();
		System.out.println(pd.publicVar);
	}
}
