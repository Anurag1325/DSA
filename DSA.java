package anurag;
import java.util.*;
public class dsa1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    {
    //pattern 
    System.out.println("enter lines:");
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();	
			i++;
		}
    }
    {//inverted pattern
      System.out.println("enter number of lines:");
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
    }
    
    {//half pyramid number
       System.out.println("enter the number of line:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int j=1;j<=i ;j++) {
				System.out.print(j);
			} 
			System.out.println();
			i++;
		}
    }
		{
			//ARRAYLIST
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0, 1);
		list.add(1,2);
		list.add(2,3);// to add an element with index position
		list.add(3,4);
		System.out.println(list.contains(11));
		System.out.println(list);
		System.out.println(list.remove(2));// to remove an element with index position
		System.out.println(list.get(2));
		ArrayList<String>name=new ArrayList<>();
		name.add("anurag");
		name.add("rishav");
		name.add("aditi");
		name.add("ananya");
		name.add("harsh");//to add an element in the list
		name.set(0, "atul");
		System.out.println(name.contains("anurag"));
		System.out.println(name);
		System.out.println(name.size());//length of list
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));//to print the element in the list
		
		System.out.println();//for empty line
		}
		for(int k=name.size()-1;k>=0;k--) {
		System.out.println(name.get(k));
		System.out.println(); //for a empty line
		}
		
		ArrayList<Integer>data=new ArrayList<>();
		data.add(1);
		data.add(4);
		data.add(3);
		data.add(9);
		data.add(11);
		data.add(2);
		data.add(6);
		data.add(13);
		int max=Integer.MIN_VALUE;
		for(int a=0;a<data.size();a++) {
			if(max<data.get(a)) {
				max=list.get(a);
			}
		}
		System.out.println("maixmum element:"+max);
	}

}
	{/// sort arraylist using colllections  import java.util.Collections;
		ArrayList<Integer>data=new ArrayList<>();
		data.add(2);
		data.add(3);
		data.add(1);
		data.add(19);
		data.add(16);
		data.add(5);
		data.add(10);
		data.add(7);
		data.add(81);
		System.out.println(data);
		Collections.sort(data);
		System.out.println(data);
		
	}

	{//reversing array and palindrome
		import java.util.Scanner;
public class Main{
    public static boolen ispalindrome(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
        if(arr[left]!=arr[right]){
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
    
    public static void reversearray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        reversearray(arr);
        for(int j:arr){
            System.out.println(j);
        }
        if(ispalindrome(arr)){
            System.out.println("Array is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

}
	{//printfib number
import java.util.Scanner;
public class Main{
    public static void printfib(int n){
        int firstterm=0;
        int secondterm=1;
        for(int i=0;i<n;i++){
            System.out.println(firstterm+" ");
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printfib(n);
    
    }
}
    

		
	
    
    
