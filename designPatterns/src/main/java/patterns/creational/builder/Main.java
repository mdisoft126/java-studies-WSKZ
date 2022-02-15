package patterns.creational.builder;

public class Main {
	public static void main(String[] args) {
		
		Pizza pizza1 = Pizza.builder().setDoughType("thin").setCheese("feta").setSize(32).build();
	}
}
