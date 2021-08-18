package fr.dish.programme;

public class Strawberry extends Fruit {

	public Strawberry(String name) {
		super("fraise");
	
	}

	@Override
	public void taste() {
		System.out.println("Le gout est plutôt sucré ");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

}
