package Com.Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void menuUI()
	   {
		 System.out.println("**********  WelCome To Shopping Cart  ***********");
		 System.out.println();
		 
		 System.out.println(" << SELECT CATEGORIES");
		 System.out.println("1 Electronics");
		 System.out.println("2 Sports");
		 System.out.println("3 Furniture");
		 System.out.println("4 Gadgets");
		 System.out.println("5 To Conformed Order");
		 System.out.println("6 To Exit From Shopping Cart");
		 System.out.println();
		 
		 
	   }
		public static void main(String[] args)
		{
			Functional funtion = new Functional();
		    Repository repo = new Repository();
		    repo.Repo();
			int option;
			do
			{
				menuUI();
				System.out.println("Press Number To Select Category");
				Scanner sc = new Scanner(System.in);
				option = sc.nextInt();
				switch(option) 
				{
				
				case 1:funtion.viewElectronic();
				       System.out.println("*****************************************************************");
				       break;
				case 2:funtion.viewSport();
			           System.out.println("*****************************************************************");
			           break;
				case 3:funtion.viewFurniture();
			           System.out.println("*****************************************************************");
			           break;
				case 4:funtion.viewGadgets();
			           System.out.println("*****************************************************************");
			           break;

				case 5:System.out.println("ThankYou!!!!!!!!!!!!!!!!");
					   System.out.println("Your Order Has Been Placed");
					   System.out.println("Amount to Be paid  "+funtion.Sum+".00");
					   System.exit(0);
				}
			}
			while(option!= 6) ;
			
				
			
			
		}
}
