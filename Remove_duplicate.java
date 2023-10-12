package com.arrays;

public class Remove_duplicate {

	public static void main(String[] args) 
	{
		int[] a = { 1, 3, 9, 3, 6, 2, 8, 9 };

		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
		 	System.out.println();

		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) 
		{
			b[i] = a[i];          // passed the value of array a into b
		}
		
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if (b[i] == b[j])
				{
					if (i != j)      
						b[j] = 0;		//if index is different and value is same then value of b is 0
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if (b[i] != 0)             // 
				System.out.print(b[i]); 
		}

	}
}