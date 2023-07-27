package chess;

import board.Board;
import board.Position;
import chess.pieces.Pawn;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		// Inserindo peças no tabuleiro
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new Pawn(board, Color.WHITE), new Position(1, 0));
	}
}
