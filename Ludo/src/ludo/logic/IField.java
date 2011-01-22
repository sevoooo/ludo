package ludo.logic;

public interface IField {

	boolean isEmpty();
	int getFieldNumber();
	void setFieldNumber(int number);

	IPiece<?> getPiece() throws Exception;

	void setPiece(IPiece<?> piece);

}
