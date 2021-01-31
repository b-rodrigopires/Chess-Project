package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		for (int i = 0; i < possibleMoves().length; i++) {
			for (int j = 0; j < possibleMoves()[i].length; j++) {
				if (possibleMoves()[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
