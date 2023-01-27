package BattagliaNavale;

import java.util.Random;

public class Player {
	
	private GameBoard gameBoard;
	
	
	private boolean bot; // if true player is a human else a bot
	public enum Navi {PO,CO,CR,SO,NA};

	//Ship Size
	public static int size_of_portaerei = 5;
	public static int size_of_corazzate = 4;
	public static int size_of_crociere = 3;
	public static int size_of_sottomarini = 3;
	public static int size_of_assalto = 1;
	
	//Number of ships
	public static int number_of_portaerei = 1;
	public static int number_of_corazzate = 1;
	public static int number_of_crociere = 2;
	public static int number_of_sottomarini = 3;
	public static int number_of_assalto = 3;
		
		
	public Player(GameBoard gameBoard, boolean bot) {
		super();
		this.gameBoard = gameBoard;
		this.bot = bot;
	}
	
	public void getGameBoard(GameBoard gameBoard) {
		gameBoard.getGameBoard();
	}
	
	public boolean checkAvailability(int row, int column, int size, char HIV) {
		
		if(HIV == 'V') {
			for(int i=0;i<size;i++) {				
				if(this.gameBoard.gameBoard[row][column] != "~~") {
					return false;
				}
				row ++;
			}
			return true;
		}else {
			
			for(int i=0;i<size;i++) {				
				if(this.gameBoard.gameBoard[row][column] != "~~") {
					return false;
				}
				column ++;
			}
			return true;
			
		}
		
		
		
	}
	
	public void setGameBoard(GameBoard gameBoard,boolean bot) {
		
		for (Navi boat : Navi.values()) {
		    System.out.println(boat);
		    boolean value = new Random().nextBoolean(); // true Horizontal false Vertical
		    switch(boat) {
		    	case PO:
		    		int size = size_of_portaerei;
		    		if(value) {
			    		int rand_column = new Random().nextInt(10-size);
			    		int rand_row = new Random().nextInt(9);
			    		System.out.println("sono in orizzontale");
			    		System.out.println(rand_row);
			    		checkAvailability(rand_row,rand_column,size_of_portaerei,'H');
			    		for(int i=0;i<size;i++) {
			    			gameBoard.setElementGameBoard(rand_row, rand_column, "PO");
			    			rand_column++;
			    		}
		    		}else {
			    		int rand_row = new Random().nextInt(10-size);
			    		int rand_column = new Random().nextInt(9);
			    		System.out.println("sono in verticale");
			    		System.out.println(rand_row);
			    		for(int i=0;i<size;i++) {
			    			gameBoard.setElementGameBoard(rand_row, rand_column, "PO");
			    			rand_row++;
			    		}
		    			
		    		}
		    	number_of_portaerei--;
		    	break;
		    	case CO:
		    		

		    		
		    
		    default:
		   }
		    	
		}
		
	}

	

}
