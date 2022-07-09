package basicPrograms;

import java.util.Scanner;

public class ShoppingGameInput {

	public static void main(String[] args) {
		          Scanner sc = new Scanner(System.in);
		          int t = sc.nextInt(); //test cases i/p

		          while(t-- > 0){
		             
		              int aayuCap = sc.nextInt(); //capacity of aayush 
		              int harCap = sc.nextInt();  //capacity of harshit
		              
		              
		              int aayuSum = 0; //initial value
		              int harSum = 0; //initial value

		              // In each turn, the no. of smartphones that must be bought 
		              // are incremented by 1
		              int count = 1;
		              
		              //logic
		              while(true){
		                  
		                
		                  aayuSum += count; 
		                  
		               
		                  if(aayuSum > aayuCap){
		                      System.out.println("Harshit");
		                      break;
		                  }

		                  count++; 

		                  harSum += count;

		                  if(harSum > harCap){
		                       System.out.println("Aayush");
		                       break;
		                  }

		                  count++; // increment for next iteration
		              }

		          }
		    }
		}

