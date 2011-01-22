package ludo.logic;

public class Piece<E extends IPlayer> implements IPiece<E> {

	private E owner;

	public Piece(E owner) {
		this.owner = owner;
	}

	@Override
	public void setOwner(E owner) {
		this.owner = owner;
	}

	@Override
	public E getOwner() {
		return this.owner;
	}

}
