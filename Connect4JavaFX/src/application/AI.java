package application;

import java.util.Random;

public class AI {

	public static void makeRandomMove() {
		
		Random random = new Random();
		int randomCol = random.nextInt(7);
		
		int curRow = findColOpening(randomCol, 2);
		while (curRow == -1) {
			randomCol = random.nextInt(7);
			curRow = findColOpening(randomCol, 2);
		}
		
		GameBoard.buttons.get(curRow).get(randomCol).setStyle("-fx-background-color: #F9564F;");
		
	}
	
	public static void makeThoughtfulMove() {
		
		Random random = new Random();
		int randomCol = random.nextInt(7);
		int randomRow = random.nextInt(7);
		
		int colToMove = randomCol;
		int rowToMove = 0;
		
		//check to win across row
//		for (int curRow = 0 ; curRow < 6 ; curRow++) {
//			for (int curCol = 0 ; curCol < 4 ; curCol++) {
//				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow).get(curCol + 3)) && (currBoard.get(curRow).get(curCol + 1) == currBoard.get(curRow).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow).get(curCol + 1))) {
//					
//					for (ArrayList<Button> row : buttons) {
//					    for (Button button : row) {
//					        button.setDisable(true);
//					    }
//					}
//					
//					
//					
//					return true;
//				}
//			}
//		}
		 
		//check win across col
		
//		for (int curCol = 0 ; curCol < 7 ; curCol++) {
//			for (int curRow = 0 ; curRow < 3 ; curRow++) {
//				
//				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 3).get(curCol)) && (currBoard.get(curRow + 1).get(curCol) == currBoard.get(curRow + 2).get(curCol)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 1).get(curCol))) {
//					
//					for (ArrayList<Button> row : buttons) {
//					    for (Button button : row) {
//					        button.setDisable(true);
//					    }
//					}
//					
//					return true;
//				}
//				
//			}
//		}
		
				//check winforward diagonal
//				for (int curRow = 0 ; curRow < 3 ; curRow++) {
//					for (int curCol = 0 ; curCol < 4 ; curCol++) {
//						
//						if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 3).get(curCol + 3)) && (currBoard.get(curRow + 1).get(curCol + 1) == currBoard.get(curRow + 2).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 1).get(curCol + 1))) {
//							
//							for (ArrayList<Button> row : buttons) {
//							    for (Button button : row) {
//							        button.setDisable(true);
//							    }
//							}
//							
//							warning.setText("Click Reset");
//							
//							return true;
//						}
//						
//					}
//				}
				
				//check win backward diagonal
//				for (int curRow = 5 ; curRow > 2 ; curRow--) {
//					for (int curCol = 0 ; curCol < 4 ; curCol++) {
//						
//						if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow - 3).get(curCol + 3)) && (currBoard.get(curRow - 1).get(curCol + 1) == currBoard.get(curRow - 2).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow - 1).get(curCol + 1))) {
//							
//							for (ArrayList<Button> row : buttons) {
//							    for (Button button : row) {
//							        button.setDisable(true);
//							    }
//							}
//							
//							warning.setText("Click Reset");
//							
//							return true;
//						}
//						
//					}
//				}
		
	}
	
	public static int findColOpening(int col, int player) {
		for (int curRow = 0 ; curRow < 6 ; curRow++) {
			if (GameBoard.currBoard.get(curRow).get(col) == 0) {
				GameBoard.currBoard.get(curRow).set(col, player);
				return curRow;
			}
		}
		return -1;
	}
	
}
