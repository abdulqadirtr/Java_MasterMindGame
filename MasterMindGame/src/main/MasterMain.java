package main;
import java.util.*;
public class MasterMain {

	

	    public static void main(String args[]) {
	      char[] guessA=new char[4];
	      char[] guessB=new char[4];
	      char[] range= {'A','B','C','D','E','F'};
	      int trueNumb=0;
	      int usefulNumb=0;
	      boolean wrongNumber=true;
	      Scanner sc=new Scanner(System.in);
	      while(true){
	    	  /**
	    	   * Enter The characters by Player 1
	    	   */
	      System.out.println("Player A Enter the Guess Number");
	      for(int i=0;i<4;i++){
	          guessA[i]=sc.next().charAt(0);
	      }
	      
	      /**
    	   * Enter The characters by Player 2
    	   */
	      System.out.println("Player B Select the Guess Number");
	     for(int i=0;i<4;i++){
	          guessB[i]=sc.next().charAt(0);
	      }	     
	      
	     /**
   	   * Checking the character at same position
   	   */
	      for(int i=0;i<4;i++){
	          if(guessA[i]==guessB[i]){
	              trueNumb=trueNumb+1;
	              guessA[i]='0';
	              guessB[i]='1';
	           //  guessA[i].deleteCharAt(i);
	          }
	          
	      }
	      for(int i=0;i<4;i++){
	          for(int j=0;j<4;j++){
	              if(guessB[i]==guessA[j]){
	                  usefulNumb=usefulNumb+1;
	                //  duplicate=true;
	              }
	          }
	      }
	      System.out.println("True Numbers are" + trueNumb );
	      System.out.println("Usefull Numbers are" + usefulNumb );
	      
	      
	    }
	    }
	}


