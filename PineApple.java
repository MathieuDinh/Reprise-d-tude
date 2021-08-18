package fr.dish.programme;

public class PineApple extends Fruit implements PeelFruit {

	private boolean peeled = false;
	
	public PineApple( ) {
		super("ananas");
	}
	
	@Override
	public void taste() {
		System.out.println("L'ananas a un gout acide ");

	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}
	
	public boolean isPeeled() {
		return peeled;
	}
	
	public String getSkinType() {
		return "piquante";
	}

}
