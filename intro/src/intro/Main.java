package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		
		String internetŞubeButonu ="İnternet Şubesi";
		double dolarBugun = 8.15;
		double dolarDun = 8.15;
		int vade = 36;
		boolean düstüMü= false;		
				
		System.out.println(internetŞubeButonu);		
		System.out.println("Hello world");
		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar düştü resmi");
		}else if (dolarBugun == dolarDun){
			System.out.println("dolar aynı");
		}else {
			System.out.println("dolar yükseldi resmi");
		}
		
		
		String[] krediler = {"Hazır kredi","mutlu emekli kredisi","konut kredisi","çiftci kredisi","Msb kredisi"};
		
		
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		

	}

}
