package BattagliaNavale;

public class Game {
	
	
	public static void play() {
		
		
		GameBoard playerGameBoard = new GameBoard(10,10);
		GameBoard cpuGameBoard = new GameBoard(10,10);
		
		Player player = new Player(playerGameBoard,true);
		Player bot = new Player(cpuGameBoard,false);
		

		


		player.setGameBoard(playerGameBoard);
		System.out.println("                    CPU BOARD                     ");
		bot.setGameBoard(cpuGameBoard);
		bot.getGameBoard(cpuGameBoard);
		System.out.println("-----------------------------------------------------");
		System.out.println("                    PLAYER BOARD                     ");
		player.getGameBoard(playerGameBoard);
	}
		
		
	

}


