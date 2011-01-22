package ludo.logic;

public interface IPlayer {

	int toDice(IDice dice);

	void movePiece(IField source, IField target) throws Exception;

}
