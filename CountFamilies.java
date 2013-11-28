//need 3 loops
import java.util.Scanner;

public class CountFamilies {
  public static void main(String [] args) {
    Scanner moon = new Scanner (System.in);
    Scanner sun = new Scanner (System.in);
    System.out.println("How many families are there?");
    int k = moon.nextInt();
    double k_array [] = new double [k];
    
    for(int i = 0; i < k; i++) {
      System.out.println("Please enter family income:");
      k_array[i] = sun.nextDouble();
    }
    
    double highestIncome = k_array[0];
    
    for(int i = 0; i < k_array.length; i++) {
      if(highestIncome < k_array[i]) {
        highestIncome = k_array[i];
      }
    }
    
    double tenPercent = highestIncome*.1;
    
    int poorFamily = 0;
    
    for(int i = 0; i < k; i++) {
      if(k_array[i] < tenPercent) {
        poorFamily++;
      }
    }
    
    System.out.println("Number of Families: " + k);
    
    for(int i = 0; i < k; i++) {
      
       System.out.println("Income of Family " + (i+1) + ": $" + k_array[i]);
    }
    
    System.out.println("Highest Income: $" + highestIncome);
    System.out.printf("Ten Percent of Highest Income: %.2f", tenPercent);
    System.out.println("\nUnfortunate Families That Make Less Than 10% of the Highest Income: " + poorFamily);
    
    }
  }