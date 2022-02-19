package patterns.behavioral.iterator;

public class Main {
	public static void main(String[] args) {
		String[] names = {"Jack", "Kate", "Megan"};
		Friends friends = new Friends(names);
		
		Iterator iterator = friends.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
