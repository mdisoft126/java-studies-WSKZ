package patterns.structural.adapter;

public class ClothesAdapterImpl implements ClothesAdapter {

	Clothes clothes;
	
	public ClothesAdapterImpl(Clothes clothes) {
		this.clothes = clothes;
	}

	@Override
	public Float getPrice() {
		return getPriceinUSDFromPLN(clothes.getPrice());
	}
	
	private Float getPriceinUSDFromPLN(Float price) {
		return price / 4;
	}

}
