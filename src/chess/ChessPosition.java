package chess;

public class ChessPosition {
	private char column;
	private int row;
	
	public ChessPosition() {
		
	}

	public ChessPosition(char column, int row) {
		super();
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	
}
