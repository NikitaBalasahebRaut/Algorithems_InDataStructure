import java.lang.*;
import java.util.*;

class Insertion
{
   public void Sort(int arr[])
   {
      int pass = 0, key = 0, j = 0;
	  
	  for(pass = 1; pass < arr.length; pass++)   //start sorting from 2nd element because first element consider as sorted
	  {
	     key = arr[pass];                        //consider key as a second element then it increse
		 j = pass-1;                             //j contain first value 
		 
		 while((j>=0) && (arr[j] > key))         // loop iterate until first value is greter than second 
		 {
		    arr[j+1] = arr[j];                    //swap the values 
			j--;
	     }
		 arr[j+1] = key;
	  }
   }
}

class InsertionSort
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
	  
	  Insertion iobj = new Insertion();
	  iobj.Sort(arr);
	  
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

D:\ProgramTopicWise\DataStructure\Algorithem>java InsertionSort
Enter the size of array
5
Enter the values
50
30
10
20
40
Entered data is
50
30
10
20
40
Array after complete sorting:
10
20
30
40
50
*/