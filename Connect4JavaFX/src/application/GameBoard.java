package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameBoard {

	@FXML public Button b50, b51, b52, b53, b54, b55, b56,
						b40, b41, b42, b43, b44, b45, b46,
						b30, b31, b32, b33, b34, b35, b36,
						b20, b21, b22, b23, b24, b25, b26,
						b10, b11, b12, b13, b14, b15, b16,
						b00, b01, b02, b03, b04, b05, b06, reset, hardAI, easyAI;
	
	
	@FXML public static ArrayList<ArrayList<Button>> buttons;
	
	@FXML public Label winner;
	
	@FXML public Label turn;
	
	@FXML public Label warning;
	
	public static ArrayList<ArrayList<Integer>> currBoard;
	
	public boolean randomAI;
	
	public boolean thoughtfulAI;
	
	public void initialize() {
		
		currBoard = new ArrayList<>(); 
		
		for (int currRow = 0 ; currRow < 6 ; currRow++) { //makes the rows of the board and adds them to the board ListArray
			ArrayList<Integer> newRow = new ArrayList<>();
			
			for (int currCol = 0 ; currCol < 7 ; currCol++) {
				newRow.add(0);
			}
			
			currBoard.add(newRow);
		}
		
		buttons = new ArrayList<>(); 
		
		ArrayList<Button> row0 = new ArrayList<>();
		
		row0.add(b00);
		row0.add(b01);
		row0.add(b02);
		row0.add(b03);
		row0.add(b04);
		row0.add(b05);
		row0.add(b06);
		
		buttons.add(row0);
		
		ArrayList<Button> row1 = new ArrayList<>();
		
		row1.add(b10);
		row1.add(b11);
		row1.add(b12);
		row1.add(b13);
		row1.add(b14);
		row1.add(b15);
		row1.add(b16);
		
		buttons.add(row1);
		
		ArrayList<Button> row2 = new ArrayList<>();
		
		row2.add(b20);
		row2.add(b21);
		row2.add(b22);
		row2.add(b23);
		row2.add(b24);
		row2.add(b25);
		row2.add(b26);
		
		buttons.add(row2);
		
		ArrayList<Button> row3 = new ArrayList<>();
		
		row3.add(b30);
		row3.add(b31);
		row3.add(b32);
		row3.add(b33);
		row3.add(b34);
		row3.add(b35);
		row3.add(b36);
		
		buttons.add(row3);
		
		ArrayList<Button> row4 = new ArrayList<>();
		
		row4.add(b40);
		row4.add(b41);
		row4.add(b42);
		row4.add(b43);
		row4.add(b44);
		row4.add(b45);
		row4.add(b46);
		
		buttons.add(row4);
		
		ArrayList<Button> row5 = new ArrayList<>();
		
		row5.add(b50);
		row5.add(b51);
		row5.add(b52);
		row5.add(b53);
		row5.add(b54);
		row5.add(b55);
		row5.add(b56);
		
		buttons.add(row5);
		
		turn.setText("You");
		
		warning.setText("None");
		
		randomAI = true;
		
		thoughtfulAI = false;
		
		easyAI.setOpacity(0);
	}
	
	public void button_set(ActionEvent e) {
		if ("b00".equals(((Button) e.getSource()).getId()) || "b10".equals(((Button) e.getSource()).getId()) || "b20".equals(((Button) e.getSource()).getId()) || "b30".equals(((Button) e.getSource()).getId()) || "b40".equals(((Button) e.getSource()).getId()) || "b50".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(0, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(0).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b01".equals(((Button) e.getSource()).getId()) || "b11".equals(((Button) e.getSource()).getId()) || "b21".equals(((Button) e.getSource()).getId()) || "b31".equals(((Button) e.getSource()).getId()) || "b41".equals(((Button) e.getSource()).getId()) || "b51".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(1, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(1).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b02".equals(((Button) e.getSource()).getId()) || "b12".equals(((Button) e.getSource()).getId()) || "b22".equals(((Button) e.getSource()).getId()) || "b32".equals(((Button) e.getSource()).getId()) || "b42".equals(((Button) e.getSource()).getId()) || "b52".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(2, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(2).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b03".equals(((Button) e.getSource()).getId()) || "b13".equals(((Button) e.getSource()).getId()) || "b23".equals(((Button) e.getSource()).getId()) || "b33".equals(((Button) e.getSource()).getId()) || "b43".equals(((Button) e.getSource()).getId()) || "b53".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(3, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(3).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b04".equals(((Button) e.getSource()).getId()) || "b14".equals(((Button) e.getSource()).getId()) || "b24".equals(((Button) e.getSource()).getId()) || "b34".equals(((Button) e.getSource()).getId()) || "b44".equals(((Button) e.getSource()).getId()) || "b54".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(4, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(4).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b05".equals(((Button) e.getSource()).getId()) || "b15".equals(((Button) e.getSource()).getId()) || "b25".equals(((Button) e.getSource()).getId()) || "b35".equals(((Button) e.getSource()).getId()) || "b45".equals(((Button) e.getSource()).getId()) || "b55".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(5, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(5).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("b06".equals(((Button) e.getSource()).getId()) || "b16".equals(((Button) e.getSource()).getId()) || "b26".equals(((Button) e.getSource()).getId()) || "b36".equals(((Button) e.getSource()).getId()) || "b46".equals(((Button) e.getSource()).getId()) || "b56".equals(((Button) e.getSource()).getId()) ) {
			int pieceRow = AI.findColOpening(6, 1);
			if (pieceRow != -1) {
				buttons.get(pieceRow).get(6).setStyle("-fx-background-color: #6495ED;");
				if (isWinner() == true) {
					winner.setText("You Win!");
				}
				else if (randomAI) {
					AI.makeRandomMove();
					if (isWinner() == true) {
						winner.setText("Robot Wins!");
					}
				}
			}
			else {
				warning.setText("Col Full, Try Again");
			}
		}
		if ("reset".equals(((Button) e.getSource()).getId())) {
			initialize();
			for (ArrayList<Button> row : buttons) {
			    for (Button button : row) {
			        button.setDisable(false);
			        button.setStyle(null);
			    }
			}
			winner.setText("None");
		}
		if ("hardAI".equals(((Button) e.getSource()).getId())) {
			hardAI.setOpacity(0);
			hardAI.setDisable(true);
			thoughtfulAI = true;
			
			easyAI.setDisable(false);
			easyAI.setOpacity(100);
			randomAI = false;
		}
		if ("easyAI".equals(((Button) e.getSource()).getId())) {
			easyAI.setOpacity(0);
			easyAI.setDisable(true);
			randomAI = true;
			
			hardAI.setDisable(false);
			hardAI.setOpacity(100);
			thoughtfulAI = false;
		}
	}

	public boolean isWinner() {
		
		//straight across rows
		for (int curRow = 0 ; curRow < 6 ; curRow++) {
			for (int curCol = 0 ; curCol < 4 ; curCol++) {
				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow).get(curCol + 3)) && (currBoard.get(curRow).get(curCol + 1) == currBoard.get(curRow).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow).get(curCol + 1))) {
					
					for (ArrayList<Button> row : buttons) {
					    for (Button button : row) {
					        button.setDisable(true);
					    }
					}
					
					warning.setText("Click Reset");
					
					return true;
				}
			}
		}
		
		//straight across columns
		for (int curCol = 0 ; curCol < 7 ; curCol++) {
			for (int curRow = 0 ; curRow < 3 ; curRow++) {
				
				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 3).get(curCol)) && (currBoard.get(curRow + 1).get(curCol) == currBoard.get(curRow + 2).get(curCol)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 1).get(curCol))) {
					
					for (ArrayList<Button> row : buttons) {
					    for (Button button : row) {
					        button.setDisable(true);
					    }
					}
					
					warning.setText("Click Reset");
					
					return true;
				}
				
			}
		}
		
		//forward diagonal
		for (int curRow = 0 ; curRow < 3 ; curRow++) {
			for (int curCol = 0 ; curCol < 4 ; curCol++) {
				
				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 3).get(curCol + 3)) && (currBoard.get(curRow + 1).get(curCol + 1) == currBoard.get(curRow + 2).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow + 1).get(curCol + 1))) {
					
					for (ArrayList<Button> row : buttons) {
					    for (Button button : row) {
					        button.setDisable(true);
					    }
					}
					
					warning.setText("Click Reset");
					
					return true;
				}
				
			}
		}
		
		//backward diagonal
		for (int curRow = 5 ; curRow > 2 ; curRow--) {
			for (int curCol = 0 ; curCol < 4 ; curCol++) {
				
				if ( (currBoard.get(curRow).get(curCol) != 0) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow - 3).get(curCol + 3)) && (currBoard.get(curRow - 1).get(curCol + 1) == currBoard.get(curRow - 2).get(curCol + 2)) && (currBoard.get(curRow).get(curCol) == currBoard.get(curRow - 1).get(curCol + 1))) {
					
					for (ArrayList<Button> row : buttons) {
					    for (Button button : row) {
					        button.setDisable(true);
					    }
					}
					
					warning.setText("Click Reset");
					
					return true;
				}
				
			}
		}
		
		return false;
	}
	
}
