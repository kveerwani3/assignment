package Com.Shopping;

import java.util.ArrayList;
import java.util.Scanner; 

public class Functional extends Repository 
{

	int Num;
	int Quantity;
	int Sum ;
	
  Controller con = new Controller();
  public  void viewElectronic()
  {   
	  System.out.println(">>>>>ELECTRONICS MENU");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Electronic elec:list1) 
	  {
		  System.out.println("  " +elec.getId()+"       :  "+elec.getName()+"          :  "+elec.getDecription()+"       :  "+elec.getPrice()+".00");
	      System.out.println();
	  }
	  
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Electronic elec:list1)
	  {
		  if(Num==elec.getId())
		  {
			  Sum = Sum+(elec.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  
  }
  
  public  void viewSport()
  {    
	  System.out.println(">>>>>>SPORTS MENU");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
      System.out.println();
	  for(Sport spt:list2) 
	  {
		  System.out.println("  " +spt.getId()+"       :  "+spt.getName()+"          :  "+spt.getDecription()+"      :  "+spt.getPrice()+".00");
	      System.out.println();  
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Sport spt:list2)
	  {
		  if(Num==spt.getId())
		  {
			  Sum = Sum+(spt.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  }
  
  public  void viewFurniture()
  {   
	  System.out.println(">>>>>>FURNITURE MENU");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Furniture ftr:list3) 
	  {
		  System.out.println("  " +ftr.getId()+"        "+ftr.getName()+"          :   "+ftr.getDecription()+"        :  "+ftr.getPrice()+".00");
	      System.out.println();
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Furniture ftr :list3)
	  {
		  if(Num==ftr.getId())
		  {
			  Sum = Sum+(ftr.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  }
  
  
  public  void viewGadgets()
  {   
	  System.out.println(">>>>>>GADGETS MENU");
	  System.out.println("Item ID :  Brand Name :          Description      :     Price");
	  System.out.println();
	  for(Gadgets gdt:list4) 
	  {
		  System.out.println("  " +gdt.getId()+"        "+gdt.getName()+"          :   "+gdt.getDecription()+"        :  "+gdt.getPrice()+".00");
	      System.out.println();
	  }
	  System.out.println("Enter ID to Buy Product");
	  Scanner sc = new Scanner(System.in);
	  Num = sc.nextInt();
	  System.out.println("Enter Quantity");
	  Quantity = sc.nextInt();
	  for(Gadgets gdt :list4)
	  {
		  if(Num==gdt.getId())
		  {
			  Sum = Sum+(gdt.getPrice())*Quantity;
			  System.out.println("ADD To Cart!! Total Amount "+Sum);
		  }
	  }
	  
  }

}
