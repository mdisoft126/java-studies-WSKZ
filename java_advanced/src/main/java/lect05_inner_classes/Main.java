package lect05_inner_classes;

public class Main {

	public static void main(String[] args) {
//		Inner inner = new Inner(); -- No access
		
		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner(); // 1st way
		Outer.Inner inner1 = outer.getInnerObject(); // 2nd way - maybe a bit prettier and cleaner
		
		outer.setOuterValue(10);
		System.out.println(outer.getOuterValue());
		inner1.setInnerValue(5);
		System.out.println(inner1);

	}

}
