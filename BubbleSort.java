//Bubble sort

import java.lang.*;
import java.util.*;

class Bubble
{
   public void Sort(int arr[])
   {
      int pass = 0,no = 0, j = 0, temp = 0;
	  
	  for(pass = 0; pass < arr.length; pass++)
	  {
		  no = pass+1;
		  System.out.println("Inside pass :"+no);
		  
		  for(j = 0; j < arr.length-1-pass;j++)
		  {
			  if(arr[j] > arr[j+1])
			  {
				  temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
			  }
		  }
		  System.out.println("Array after pass :"+ no);
		  for(int k = 0; k < arr.length; k++)
		  {
			  System.out.println(arr[k]+"\t");
		  }
		  System.out.println();
	  }
   }	   
  
}

class BubbleSort
{
	public static void main(String args[]) throws Exception
	{
	   	Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter The values");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		System.out.println("Enterred data is :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println();
		
		Bubble bobj = new Bubble();
		bobj.Sort(arr);
		
		System.out.println("Array after complete sorting :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+ "\t");
		}
		System.out.println();
		
	

	}
}

/*
output
D:\ProgramTopicWise\DataStructure\Algorithem>java BubbleSort
Enter the size of array
5
Enter The values
99
77
11
9
4
Enterred data is :
99
77
11
9
4

Inside pass :1
Inside pass :2
Inside pass :3
Inside pass :4
Inside pass :5
Array after complete sorting :
4
9
11
77
99


D:\ProgramTopicWise\DataStructure\Algorithem>
D:\ProgramTopicWise\DataStructure\Algorithem>javac BubbleSort.java

D:\ProgramTopicWise\DataStructure\Algorithem>java BubbleSort
Enter the size of array
5
Enter The values
78
47
99
66
7
Enterred data is :
78
47
99
66
7

Inside pass :1
Array after pass :1
47
78
66
7
99

Inside pass :2
Array after pass :2
47
66
7
78
99

Inside pass :3
Array after pass :3
47
7
66
78
99

Inside pass :4
Array after pass :4
7
47
66
78
99

Inside pass :5
Array after pass :5
7
47
66
78
99

Array after complete sorting :
7
47
66
78
99
*/