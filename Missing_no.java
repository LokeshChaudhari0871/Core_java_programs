package com.arrays;

public class Missing_no {

	
			
		public static void main(String[]args)
		{
			int [] arr = new int[100];
			int [] arr1={1,2,3,4,5,6,7,8,9,11,12};
			int count=0;
			
			for(int i = 0; i<=99;i++)
			{
				arr[i] = i+1;
			}
			
			for(int i=0;i<arr.length;i++)
			{
				count=0;
				for(int j=0;j<arr1.length;j++)
				{
					
					if(arr1[j]==arr[i])
					{
						//System.out.println(arr[i]);
						count++;
						
					}
					
				}
				if(count==0)
				{
					System.out.println(arr[i]);
				}
			}
			
			
			
			
		}
		
	}

