package fr.dish.programme;

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam(){
		System.out.println("Miam manger 5 fruits et l�gumes par jours / Nom du fruit : " + getName());
	}

	public String getName() {
		return name;
	}
}
