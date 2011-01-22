package ludo.logic;

public class HumanPlayer implements IPlayer {

	private String name;

	public HumanPlayer() {
		this.name = "Spieler ?";
	}

	public HumanPlayer(String name) {
		this.name = name;
	}

	@Override
	public int toDice(IDice dice) {
		return dice.toDice();
	}

	@Override
	public void movePiece(IField source, IField target) throws Exception {
		target.setPiece(source.getPiece());
		source.setPiece(null);
	}

	@Override
	public String toString() {
		return name;
	}

}
