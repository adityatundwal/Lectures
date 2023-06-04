package Lecture_22;

public class Queen_Unique_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] board = new boolean[4];
		int tq = 2;
		printanswer(board, tq, "", 0,0);

	}

	public static void printanswer(boolean[] board, int tq, String ans, int qpsf, int idx) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				printanswer(board, tq, ans+"b"+i+"q"+qpsf, qpsf + 1,i+1);
				board[i] = false;

			}
		}

	}

}
