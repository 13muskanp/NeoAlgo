/* Find number of digits in an integer : 
   Providing with three methods to find number of digits
   in an integer
   -Iterative
   -Recursive
   -String Method
*/
Iterative:
import java.util.Scanner;

public class CountDigits {

	public static void countdigit(int n) {
	        int count=0;
		while(n!=0){
                count=count+1;
                n=n/10;
              }
             System.out.println(count);   

	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		System.out.println("Number of digits in a number are : ");
		countdigit(n);
				
	}
/*	
 	Sample Input : 
	Enter a number : 24567
 	
	Sample Output : 5
	 	
*/

Recursive:
import java.util.Scanner;

public class CountDigits {

	public static int countdigit(int n) {
	        if(n==0){
                   return 0;
                }
                return 1 + countdigit(n/10);  

	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		System.out.println("Number of digits in a number are : ");
		System.out.println(countdigit(n));
				
	}
/*	
 	Sample Input : 
	Enter a number : 24567
 	
	Sample Output : 5
	 	
*/

String Method:
import java.util.Scanner;

public class CountDigits {

	public static int countdigit(int n) {
	     if(n==0){
	         return 1;
	     }
         return (Integer.toString(n).length());
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		System.out.println("Number of digits in a number are : ");
		System.out.println(countdigit(n));
				
	}
}	
/*	
 	Sample Input : 
	Enter a number : 24567
 	
	Sample Output : 5
	 	
*/
