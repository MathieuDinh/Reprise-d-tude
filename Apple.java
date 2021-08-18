package fr.dish.programme;

public class Apple extends Fruit implements PeelFruit {

	public boolean peeled = false;
	
	public Apple() {
		super("pomme");
	}
	
	@Override
	public void taste() {
		System.out.println("la pomme a un gout plutôt sucré ");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return null;
	}

}
