package variabelen; 

import java.util.Scanner;
import java.util.Random;

public class MasterMind {

	public static void main(String[] args) {

		final String zwart = "zw";
		final String wit = "wi";
		final String leeg =" - ";

		final String geel = "ge";		
		final String paars = "pa";
		final String groen = "gr";
		final String blauw = "bl";
		final String oranje = "or";
		final String rood = "ro";
		

		final String[] cbcolors = { geel, paars, groen, blauw, oranje, rood };
		Random rnd = new Random();
		
		final String code1 = cbcolors[rnd.nextInt(cbcolors.length)];
		final String code2 = cbcolors[rnd.nextInt(cbcolors.length)];
		final String code3 = cbcolors[rnd.nextInt(cbcolors.length)];
		final String code4 = cbcolors[rnd.nextInt(cbcolors.length)];

		

		System.out.println("Please enter your guess for the code!!");
		System.out.print ("Available colors: wi (wit), ge (geel), pa (paars), gr (groen), bl (blauw), or (oranje), ro (rood)");
		System.out.println("Enter your guess in the format: wi ge pa bl");

		Scanner sc = new Scanner(System.in);

	
		String codemaker1_1 = code1;
		String codemaker1_2 = code2;
		String codemaker1_3 = code3;
		String codemaker1_4 = code4;

		int codegetal = 1;

	        for(int i = 0; i <= 9; i++) {
	            
	            System.out.println("attempt " + codegetal);
	           
	            
	    	String codebreaker1_1 = sc.next();
		String codebreaker1_2 = sc.next();
		String codebreaker1_3 = sc.next();
		String codebreaker1_4 = sc.next();
    
	     
		
		if (codebreaker1_1.equals(code1)) {
			codemaker1_1 = zwart;
		}
		
		else if (codebreaker1_1.equals(code2)) {
			codemaker1_1 = wit;
		}
		
		else if (codebreaker1_1.equals(code3)) {
			codemaker1_1 = wit;
		}
		
		else if (codebreaker1_1.equals(code4)) {
			codemaker1_1 = wit;
		}
		
		else { codemaker1_1 = leeg;
			
		}
		
		System.out.println(codemaker1_1);
		
		
		
		if (codebreaker1_2.equals(code2)) {
			codemaker1_2 = zwart;
		}
		
		else if (codebreaker1_2.equals(code1)) {
			codemaker1_2 = wit;
		}
		
		else if (codebreaker1_2.equals(code3)) {
			codemaker1_2 = wit;
		}
		
		else if (codebreaker1_2.equals(code4)) {
			codemaker1_2 = wit;
		}
		
		else { codemaker1_2 = leeg;
			
		}
		
		System.out.println(codemaker1_2);
		
		if (codebreaker1_3.equals(code3)) {
			codemaker1_3 = zwart;
		}
		
		else if (codebreaker1_3.equals(code1)) {
			codemaker1_3 = wit;
		}
		
		else if (codebreaker1_3.equals(code2)) {
			codemaker1_3 = wit;
		}
		
		else if (codebreaker1_1.equals(code4)) {
			codemaker1_3 = wit;
		}
		
		else { codemaker1_3 = leeg;
			
		}
		
		System.out.println(codemaker1_3);
		
		if (codebreaker1_4.equals(code4)) {
			codemaker1_4 = zwart;
		}
		
		else if (codebreaker1_4.equals(code1)) {
			codemaker1_3 = wit;
		}
		
		else if (codebreaker1_4.equals(code2)) {
			codemaker1_3 = wit;
		}
		
		else if (codebreaker1_4.equals(code3)) {
			codemaker1_4 = wit;
		}
		
		else { codemaker1_4 = leeg;
			
		}
		
		System.out.println(codemaker1_4);
		
		codegetal = ++codegetal;
		
		
	        
		
	        if (codebreaker1_1.equals(code1)) {
	            
	            if (codebreaker1_2.equals(code2)) {
	        	
	        	  if (codebreaker1_3.equals(code3)) {
	        	      
	        	      if (codebreaker1_4.equals(code4)) {
	  			
	        		  System.out.println("Gefeliciteerd je hebt gewonnen!");
	        		  break;
	        		  
	        	      		}
	        	      
	  			}
	        	  
			}	
	            
		}
	        
	        if (i == 9 ) 
	        { System.out.println("Je hebt verloren");
	      
	      break;
	        }
	            
	        }
	        
	
		sc.close();

	}

}
