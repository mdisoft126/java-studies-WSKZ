package patterns.creational.builder;

public class Pizza {

	private int size;
	private String doughType;
	private String cheese;
	private String meat;
	private boolean pepper;
	private boolean onion;
	private boolean garlic;
	private boolean olives;
	private boolean tomato;
	private boolean pineapple;
	
	public Pizza() {
	}

	public Pizza(int size, String doughType, String cheese, String meat, boolean pepper, boolean onion, boolean garlic,
			boolean olives, boolean tomato, boolean pineapple) {
		this.size = size;
		this.doughType = doughType;
		this.cheese = cheese;
		this.meat = meat;
		this.pepper = pepper;
		this.onion = onion;
		this.garlic = garlic;
		this.olives = olives;
		this.tomato = tomato;
		this.pineapple = pineapple;
	}
	
	public static PizzaBuilder builder() {
		return new PizzaBuilder();
	}
	
	static final class PizzaBuilder {
		private int size;
		private String doughType;
		private String cheese;
		private String meat;
		private boolean pepper;
		private boolean onion;
		private boolean garlic;
		private boolean olives;
		private boolean tomato;
		private boolean pineapple;
		
		public PizzaBuilder setSize(int size) {
			this.size = size;
			return this;
		}
		public PizzaBuilder setDoughType(String doughType) {
			this.doughType = doughType;
			return this;
		}
		public PizzaBuilder setCheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		public PizzaBuilder setMeat(String meat) {
			this.meat = meat;
			return this;
		}
		public PizzaBuilder setPepper(boolean pepper) {
			this.pepper = pepper;
			return this;
		}
		public PizzaBuilder setOnion(boolean onion) {
			this.onion = onion;
			return this;
		}
		public PizzaBuilder setGarlic(boolean garlic) {
			this.garlic = garlic;
			return this;
		}
		public PizzaBuilder setOlives(boolean olives) {
			this.olives = olives;
			return this;
		}
		public PizzaBuilder setTomato(boolean tomato) {
			this.tomato = tomato;
			return this;
		}
		public PizzaBuilder setPineapple(boolean pineapple) {
			this.pineapple = pineapple;
			return this;
		}
		
		public Pizza build() {
			Pizza pizza = new Pizza();
			pizza.size = this.size;
			pizza.doughType = this.doughType;
			pizza.cheese = this.cheese;
			pizza.meat = this.meat;
			pizza.pepper = this.pepper;
			pizza.onion = this.onion;
			pizza.garlic = this.garlic;
			pizza.olives = this.olives;
			pizza.tomato = this.tomato;
			pizza.pineapple = this.pineapple;
			return pizza;
		}
		
	}
}

	