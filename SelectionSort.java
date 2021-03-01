//program to demonstrate the concept of selection sort

import java.lang.*;
import java.util.*;

class Selection
{
  public void Sort(int arr[])
  {
     int pass = 0, j = 0, temp = 0, min_i = 0;
	 
	 for(pass = 0; pass < arr.length-1; pass++)
	 {
	    min_i = pass;
		
		for(j = pass+1; j < arr.length; j++)
		{
			if(arr[min_i] > arr[j])
			{
				min_i = j;
			}
		}
		if(arr[pass] != arr[min_i])
		{
			temp = arr[pass];
			arr[pass] = arr[min_i];
			arr[min_i] = temp;
		}
	 }
  }
}

class SelectionSort
{
	public static void main(String args[])throws Exception
	{
	  Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size = sobj.nextInt();

      int arr[] = new int [size];

      System.out.println("Enter the values");
      for(int i = 0; i < arr.length; i++)
      {
         arr[i] = sobj.nextInt();
      }	
	  
	  System.out.println("Entered data is");
      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i]+"\t");
      }	
	  
	  Selection bobj = new Selection();
	  bobj.Sort(arr);
	  
	  System.out.println("Array after complete sorting:");
	  
	  for(int i = 0; i < arr.length; i++)
	  {
		  System.out.println(arr[i]+"\t");
	  }
	  System.out.println();
	}
}


/*
output

Enter the size of array
4
Enter the values
88
44
22
38
Entered data is
88
44
22
38
Array after complete sorting:
22
38
44
88
*/