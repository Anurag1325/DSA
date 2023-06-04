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
    
    
    
