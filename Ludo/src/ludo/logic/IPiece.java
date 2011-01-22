package ludo.logic;

public interface IPiece<E extends IPlayer> {

	void setOwner(E owner);

	E getOwner();

}
