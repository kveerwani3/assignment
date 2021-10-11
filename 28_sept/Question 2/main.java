package Assignment_28_Sept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception 

{
		ArrayList<Item> list = new ArrayList<Item>();
		  
		  Item item1 = new Item();
		  item1.setItemId(1);
		  item1.setItemDescription("Good Quality");
		  item1.setItemQuantityAvailable(5);
		  item1.setItemUnitPrice(2000);
		  item1.setItemDiscountPercentage(21);
		  
		  Item item2 = new Item();
		  item2.setItemId(2);
		  item2.setItemDescription("Low Price");
		  item2.setItemQuantityAvailable(2);
		  item2.setItemUnitPrice(500);
		  item2.setItemDiscountPercentage(30);
		  
		  Item item3 = new Item();
		  item3.setItemId(3);
		  item3.setItemDescription("Best Service");
		  item3.setItemQuantityAvailable(8);
		  item3.setItemUnitPrice(1000);
		  item3.setItemDiscountPercentage(42);
		  
		  Item item4 = new Item();
		  item4.setItemId(4);
		  item4.setItemDescription("Better Ability");
		  item4.setItemQuantityAvailable(6);
		  item4.setItemUnitPrice(2000);
		  item4.setItemDiscountPercentage(35);
		  
		  list.add(item1);
		  list.add(item2);
		  list.add(item3);
		  list.add(item4);

	   FileOutputStream FOS = new FileOutputStream("data.ser");
	   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
	   OOS.writeObject(list);
	   
	   FileInputStream FIS = new FileInputStream("data.ser");
	   ObjectInputStream OIS = new ObjectInputStream(FIS);
	   
	   ArrayList list1 = (ArrayList)OIS.readObject();
	   
	   System.out.println("Item ID :"+"ItemDecs : "+"ItemQuantity : "+"ItemPrice : "+"ItemDiscount " );
	   for(Object obj : list1)
	   {
		  if(obj instanceof Item)
		  {
			  System.out.println(((Item) obj).getItemId()+" : "+((Item) obj).getItemDescription()+" : "+((Item) obj).getItemQuantityAvailable()+" : "+((Item) obj).getItemUnitPrice()+" : "+((Item) obj).getItemDiscountPercentage()+"%");
		  }
	   }
	   

	}

}