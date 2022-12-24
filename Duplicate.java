package sorting;

public class Duplicate
{
	public static void main(String args[])
	{
      int numRay[] = { 1, 2, 4, 3, 1, 2, 9, 5, 1 };
      for (int i = 0; i < numRay.length; i++)
      {
        numRay[numRay[i] % numRay.length]= numRay[numRay[i] % numRay.length]+ numRay.length;
      
      }
      System.out.println("The repeating elements are : ");
       for (int i = 0; i < numRay.length; i++)
       {
        if (numRay[i] >= numRay.length * 2) 
        {
         System.out.println(i + " ");
        }
       }
	}
}