package ludo.logic;

public class Dice implements IDice {
	
	private int sides;
	
	public Dice() {
		this(6);
	}
	
	public Dice(int sides) {
		this.sides = sides;
	}
	
	@Override
	public int toDice() {
		return (int) (Math.random() * this.sides) + 1;
	}

}
