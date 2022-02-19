package patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		
		Clothes jeans = new Jeans();
		System.out.println("price in PLN: " + jeans.getPrice());
		
		ClothesAdapter clothesAdapter = new ClothesAdapterImpl(jeans);
		System.out.println("price in USD: " + clothesAdapter.getPrice());
	}

}
