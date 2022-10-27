package assignments.prework;

import java.util.Scanner;
//importgsasf

public class Main {
//dfghjkl
Scanner sc = new Scanner(System.in);

       //function to checkPalindrome
       public void checkPalindrome() {
    	   System.out.println("Enter a number to check palindrome ::");
    	   int num = sc.nextInt();
    	   int rev = 0, temp = num;
   			while (temp > 0) {
	   			rev = (rev * 10) + (temp % 10);
	   			temp = temp / 10;
   			}
	   		System.out.println("\n---------------------------------------------------------------------");
	                System.out.println("\n---------------------------------------------------------------------");
	   		if (rev == num) {
	   			System.out.println("Input number is a PALINDROME NUMBER.");
	   		} else {
	   			System.out.println("Input number is NOT a palindrome number.");
	   		}
	   		System.out.println("---------------------------------------------------------------------\n");
	       System.out.println("palindrome is Over");
	       }
       
          	
       //function to printPattern
       public void printPattern() {
    	   System.out.println("Enter a number to print star pattern ::");
    	   int num = sc.nextInt();
    	   for (int i = num; i > 0; i--) {
   			for (int j = i; j > 0; j--) {
   				System.out.print("*");
   			}
   			System.out.println("\n");
   		}
      }

        //function to check no is prime or not
        public void checkPrimeNumber() {
           System.out.println("Enter a number to check prime ::");
     	   int num = sc.nextInt();
     	   int count = 0;
     	   for (int i = 2; i < num; i++) {
     		   if ((num % i) == 0) {
  			   count++;
     		   }
     	   }
  		System.out.println("\n---------------------------------------------------------------------");
  		if ((num > 1) && (count == 0)) {
  			System.out.println("Input number is a PRIME NUMBER.");
  		} else {
  			System.out.println("Input number is NOT a prime number.");
  		}
  		System.out.println("---------------------------------------------------------------------\n");
		System.out.println("---------------------------------------------------------------------\n");
        }


        // function to print Fibonacci Series
        public void printFibonacciSeries() {
        	System.out.println("Enter a number to print Fibonacci numbers ::");
     	   int num = sc.nextInt();
        	int first = 0, second = 1, fib;
    		System.out.println("\n---------------------------------------------------------------------");
    		System.out.print("Fibonacci series :: " + "0 1 ");
    		for (int i = 1; i < num; i++) {
    			fib = first + second;
    			System.out.print(fib + " ");
    			first = second;
    			second = fib;
    		}
    		System.out.println("\n---------------------------------------------------------------------\n");
        }

 

        //main method which contains switch and do while loop
        public static void main(String[] args) {

	        Main obj = new Main();
	
	        int choice;
	
	        Scanner sc = new Scanner(System.in);

			do {
			
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
			
			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
			
			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			
			System.out.println();
			
			 
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			 
			
			case 0:
			
			choice = 0;
			
			break;
			
			 
			
			case 1: {
			
			obj.checkPalindrome();
			
			}
			
			break;
			
			 
			
			case 2: {
			
			 
			
			obj.printPattern();
			
			}
			
			break;
			
			 
			
			case 3: {
			
			obj.checkPrimeNumber();
			
			}
			
			break;
			
			 
			
			case 4: {
			
			 
			
			obj.printFibonacciSeries();
			
			}
			
			break;
			
			 
			
			default:
			
			System.out.println("Invalid choice. Enter a valid no.\n");
			
			}
				System.out.println("------------------");
			
			 
			
			} while (choice != 0);
			
			System.out.println("Exited Successfully!!!");
			
			sc.close();

        }
}
