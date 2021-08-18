package fr.dish.programme;

public class Kiwi extends Fruit implements PeelFruit {

	public boolean peeled = false;
	
	public Kiwi(String name) {
		super("kiwi");
		// TODO Auto-generated constructor stub
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

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
