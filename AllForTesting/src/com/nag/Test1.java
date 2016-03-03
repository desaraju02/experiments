package com.nag;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =16-1*0+2/2;
		
		//System.out.println(x);
		
		System.out.println("The answer is: "+x);
		System.out.println("And isEven is "+ isEven(x));
		System.out.println("isPrime: "+isPrime(x));

	}
	
	public static boolean isEven(int x1)
	{
		return (x1%2 == 0);
	}
	
	public static boolean isPrime(int x1)
	{
		boolean isPrime = true;
		for(int i = 2; i < x1/2; i++)
		{
			if (x1%i == 0) 
				isPrime = false;
				break;
		}
		
		return isPrime;
	}

}
