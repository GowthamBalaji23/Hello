package org.array;

public class IndexValue {

	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		
		a[0] = 105;
		a[1] = 205;
		a[2] = 305;
		a[3] = 405;
		
		int len = a.length;
		System.out.println(len);
		
		System.out.println("*******");
		
		System.out.println(a[1]);
		
		
		System.out.println("*******");
		
		for(int i = 0; i < a.length; i++)
		{
			
			System.out.println(a[i]);
		}
		
		System.out.println("*******");
		
		for(int x : a)
		{
			System.out.println(x);
		}

				
		
	}
	
}
