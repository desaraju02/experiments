package com.nag;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =7-1*0+2/2;
		
		//System.out.println(x);
		
		System.out.println("The answer is: "+x);
		System.out.println("And isEven is "+ isEven(x));

	}
	
	public static boolean isEven(int x1)
	{
		return (x1%2 == 0);
	}

}
