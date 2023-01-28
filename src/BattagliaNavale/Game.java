package BattagliaNavale;

public class Game {
	
	
	public static void play() {
		
		
		GameBoard playerGameBoard = new GameBoard(10,10);
		GameBoard cpuGameBoard = new GameBoard(10,10);
		
		Player player = new Player(playerGameBoard,true);
		Player bot = new Player(cpuGameBoard,false);
		
		bot.setGameBoard(cpuGameBoard, true);
		bot.getGameBoard(cpuGameBoard);
		
		System.out.println("-----------------------------------------");
		
		player.getGameBoard(playerGameBoard);
	}
		
		
	

}
