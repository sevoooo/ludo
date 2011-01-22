package ludo.logic;

public class Field implements IField {

	private IPiece<?> piece;
	private int number;

	public Field() {
		this.piece = null;
		this.number = 0;
	}

	@Override
	public boolean isEmpty() {
		return (this.piece == null) ? true : false;
	}

	@Override
	public IPiece<?> getPiece() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		return this.piece;
	}

	@Override
	public void setPiece(IPiece<?> piece) {
		this.piece = piece;
	}

	@Override
	public int getFieldNumber() {
		return this.number;
	}

	@Override
	public void setFieldNumber(int number) {
		this.number = number;
	}

}
