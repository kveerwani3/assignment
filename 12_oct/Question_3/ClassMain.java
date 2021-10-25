package 12_Oct;

import java.util.List;
public class ClassMain 
{
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.forEach(System.out::println);
	}
}