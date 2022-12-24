package sorting;

import java.util.*;
class BS
{
void bubbleSort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n - 1; i++)
for (int j = 0; j < n - i - 1; j++)
if (arr[j] > arr[j + 1])
{
	int temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
}
}
void printArray(int arr[])
{
	int n = arr.length;
    for (int i = 0; i < n; ++i)
    System.out.print(arr[i] + " ");
    System.out.println();
}
public static void main(String args[])
{
	BS ob = new BS();
    int arr[] = { 5, 1, 4, 2, 3};
    ob.bubbleSort(arr);
    System.out.println("Sorted array");
    ob.printArray(arr);
}
}