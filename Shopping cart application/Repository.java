package Com.Shopping;

import java.util.ArrayList;

public class Repository {
	
	public static ArrayList<Electronic> list1;
	  public static ArrayList<Sport> list2;
	  public static ArrayList<Furniture> list3;
	  public static ArrayList<Gadgets> list4;
	  
	  public static void Repo() 
	  {
		  	  
		  list1 = new ArrayList<Electronic>();
	//***************Creating Data For Electronics Items**************************************//	  
		  Electronic electronic1 = new Electronic();
		  electronic1.setId(1);
		  electronic1.setName("Iron Machine");
		  electronic1.setDecription("Model-1232 Havels ");
		  electronic1.setPrice(1000);
		  list1.add(electronic1);
		  
		  Electronic electronic2 = new Electronic();
		  electronic2.setId(2);
		  electronic2.setName("Vaccume Cleaner");
		  electronic2.setDecription("Model-1453 Syska");
		  electronic2.setPrice(1500);
		  list1.add(electronic2);
		  
		  Electronic electronic3 = new Electronic();
		  electronic3.setId(3);
		  electronic3.setName("Table Fan");
		  electronic3.setDecription("Model-1443 Luminious");
		  electronic3.setPrice(3000);
		  list1.add(electronic3);
		  
		  Electronic electronic4 = new Electronic();
		  electronic4.setId(4);
		  electronic4.setName("Night Lamp");
		  electronic4.setDecription("Model-1754 Philipes");
		  electronic4.setPrice(1000);
		  list1.add(electronic4);
		  
		  Electronic electronic5 = new Electronic();
		  electronic5.setId(5);
		  electronic5.setName("Washing Machine");
		  electronic5.setDecription("Model-1662 Godrej");
		  electronic5.setPrice(1000);
		  list1.add(electronic5);
		  
		  
		  list2 = new ArrayList<Sport>();
	//***************Creating Data For Sports Items**************************************//
		  Sport  sport1 = new Sport();
		  sport1.setId(1);
		  sport1.setName("Tennis BallSet");
		  sport1.setDecription("Set Of 6 Wilson");
		  sport1.setPrice(800);
		  list2.add(sport1);
		  
		  Sport  sport2 = new Sport();
		  sport2.setId(2);
		  sport2.setName("FootBall");
		  sport2.setDecription("M-3424 Riddle");
		  sport2.setPrice(1050);
		  list2.add(sport2);

		  
		  Sport  sport3 = new Sport();
		  sport3.setId(3);
		  sport3.setName("Gym Gloves");
		  sport3.setDecription("Pair Of 2 Nike");
		  sport3.setPrice(800);
		  list2.add(sport3);

		  
		  Sport  sport4 = new Sport();
		  sport4.setId(4);
		  sport4.setName("SkateBoard");
		  sport4.setDecription("Strauss Bronx");
		  sport4.setPrice(1099);
		  list2.add(sport4);

		  
		  Sport  sport5 = new Sport();
		  sport5.setId(5);
		  sport5.setName("Table Tennis Set");
		  sport5.setDecription("PSB Tennis With Ball");
		  sport5.setPrice(399);
		  list2.add(sport5);

		  
		 list3 = new ArrayList<Furniture>();
	//***************Creating Data For Furniture Items**************************************//
		 Furniture furniture1 = new Furniture();
		 furniture1.setId(1);
		 furniture1.setName("Laptop Table");
		 furniture1.setDecription("Adjustable Height");
		 furniture1.setPrice(799);
		 list3.add(furniture1);
		 
		 Furniture furniture2 = new Furniture();
		 furniture2.setId(2);
		 furniture2.setName("Furniture Cafe");
		 furniture2.setDecription("Floating wallMounted Self");
		 furniture2.setPrice(999);
		 list3.add(furniture2);

		 
		 Furniture furniture3 = new Furniture();
		 furniture3.setId(3);
		 furniture3.setName("Wooden Temple");
		 furniture3.setDecription("UFH Designed Style");
		 furniture3.setPrice(1599);
		 list3.add(furniture3);

		 
		 Furniture furniture4 = new Furniture();
		 furniture4.setId(4);
		 furniture4.setName("Herostyle Sofa");
		 furniture4.setDecription("3 Seater Fabric Set");
		 furniture4.setPrice(2599);
		 list3.add(furniture4);

		 
		 Furniture furniture5 = new Furniture();
		 furniture5.setId(5);
		 furniture5.setName("Bean Bags");
		 furniture5.setDecription("Set Of 3 Bags");
		 furniture5.setPrice(1799);
		 list3.add(furniture5);
		 
		
		 list4 = new ArrayList<Gadgets>();
		//***************Creating Data For Gadgets Items**************************************//
			 Gadgets gadget1 = new Gadgets();
			 gadget1.setId(1);
			 gadget1.setName("AmazeFit gtr");
			 gadget1.setDecription("smart watch OS");
			 gadget1.setPrice(4999);
			 list4.add(gadget1);
			 
			 Gadgets gadget2 = new Gadgets();
			 gadget2.setId(2);
			 gadget2.setName("Blutooth Headset");
			 gadget2.setDecription("Model-402 Wireless");
			 gadget2.setPrice(1499);
			 list4.add(gadget2);
			 
			 Gadgets gadget3 = new Gadgets();
			 gadget3.setId(3);
			 gadget3.setName("Power Bank");
			 gadget3.setDecription("5000-MH Cap. MI ");
			 gadget3.setPrice(1999);
			 list4.add(gadget3);
			 
			 Gadgets gadget4 = new Gadgets();
			 gadget4.setId(4);
			 gadget4.setName("Smart Band");
			 gadget4.setDecription("MI-6 10days Battery");
			 gadget4.setPrice(4499);
			 list4.add(gadget4);
			 
			 
			 Gadgets gadget5 = new Gadgets();
			 gadget5.setId(5);
			 gadget5.setName("Night Lamp");
			 gadget5.setDecription("15H Runtime Cap.");
			 gadget5.setPrice(999);
			 list4.add(gadget5);
	     }

		
	  }