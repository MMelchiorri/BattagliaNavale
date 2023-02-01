package BattagliaNavale;

public class GameBoard {
	
	public String[][] gameBoard;
		
	private char[] letter = {'A','B','C','D','E','F','G','H','I','L'}; //row letter
	private int[] number = {1,2,3,4,5,6,7,8,9,10};					   //column number
	
	public GameBoard(int rows,int columns) {
		this.gameBoard = new String[rows][columns];
		for(int i =0; i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				this.gameBoard[i][j] ="~~";
			}
		}
	}
	
	public void setElementGameBoard(int x,int y,String value){
		this.gameBoard[x][y] = value;
		
	}
	
	public String[][] getGameBoard() {

		System.out.println("    1    2    3    4    5    6    7    8    9   10");
		for(int i =0; i<10;i++) {
			System.out.print(letter[i]);
			for(int j=0;j<10;j++) {
				System.out.print('|');
				System.out.print("_");
				System.out.print(this.gameBoard[i][j]);
				System.out.print("_");
			}
			System.out.println('|');
			
		}
		return this.gameBoard;
	}
	
	
	
	

}
