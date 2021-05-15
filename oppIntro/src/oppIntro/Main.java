package oppIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo v14",15000,"16 gb ram");
		
		Product product2 = new Product();
		product2.Id = 2;
		product2.name = "Lenovo v15";
		product2.detail= "32 gb ram";
		product2.unitPrice = 16000; 
		
		Product product3 = new Product();
		product3.Id = 3;
		product3.name = "HP 5";
		product3.detail= "16 gb ram";
		product3.unitPrice = 10000; 
		
	
		Product[] products = {product1,product2,product3}; 
		
		
		
		for (Product product : products) {
			System.out.println(product.name);
			
		}
		System.out.println("Ürün sayýsý:"+products.length);

		
		
		Category category1 = new Category();
		category1.Id = 1;
		category1.name = "Bilgisayar"; 

		Category category2 = new Category();
		category2.Id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
	}

}
