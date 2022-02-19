package patterns.behavioral.iterator;

public class Friends implements People {
	
	private String friends[];
	
	public Friends(String[] friends) {
		this.friends = friends;	
	}

	@Override
	public Iterator iterator() {
		return new FriendsIterator();
	}

	private class FriendsIterator implements Iterator {

		int position;
		
		@Override
		public boolean hasNext() {
			return position < friends.length;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return friends[position++];
			}
			return null;
		}
	}
}
