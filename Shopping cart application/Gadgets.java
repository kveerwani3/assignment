package Com.Shopping;

public class Gadgets {
	
	private int Id;
	   private String Name;
	   private String Decription;
	   private int Price;
	   
	   public Gadgets()
	   {
		super();
		// TODO Auto-generated constructor stub
	   }
	   
	   public Gadgets(int id, String name, String decription, int price)
	   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	   }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Gadgets [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
	}

}
