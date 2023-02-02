package BattagliaNavale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Game {
	
	
	public static void play() {
		
		//player
		GameBoard playerGameBoard = new GameBoard(10,10);
		Player player = new Player(playerGameBoard,true);
		Map<String, Integer> playerNav = new HashMap<String, Integer>();

		playerNav.put("PO1", 5);
		playerNav.put("CO1", 4);
		playerNav.put("CR1", 3);
		playerNav.put("CR2", 3);
		playerNav.put("SO1", 3);
		playerNav.put("SO2", 3);
		playerNav.put("SO3", 3);
		playerNav.put("NA1", 2);
		playerNav.put("NA2", 2);
		playerNav.put("NA3", 2);
		
		//bot
		GameBoard cpuGameBoard = new GameBoard(10,10);
		Player bot = new Player(cpuGameBoard,false);
		
		Map<String, Integer> botNav = new HashMap<String, Integer>();
		botNav.put("PO1", 5);
		botNav.put("CO1", 4);
		botNav.put("CR1", 3);
		botNav.put("CR2", 3);
		botNav.put("SO1", 3);
		botNav.put("SO2", 3);
		botNav.put("SO3", 3);
		botNav.put("NA1", 2);
		botNav.put("NA2", 2);
		botNav.put("NA3", 2);
		
		
		
		player.setGameBoard(playerGameBoard);
		System.out.println("                    CPU BOARD                     ");
		bot.setGameBoard(cpuGameBoard);
		bot.getGameBoard(cpuGameBoard);
		GameBoard grigliaVisibile = new GameBoard(10, 10);
		System.out.println("-----------------------------------------------------");
		System.out.println("                    PLAYER BOARD                     ");
		player.getGameBoard(playerGameBoard);
		
		
		boolean nave_colpita;
		int number_of_boat_bot =10;
		int number_of_boat_player=10;
		while(true) {
			//turno player
			System.out.println("Seleziona una cella da colpire");
			Scanner input = new Scanner(System.in);
			String target = input.nextLine();
			System.out.println(target);
            int firstValue = (int) target.charAt(0);
            String secondValue = target.substring(1, target.length());
            String boat = cpuGameBoard.gameBoard[9-firstValue+65][Integer.parseInt(secondValue)];

			nave_colpita = bot.checkNaveColpita(9-firstValue+65, Integer.parseInt(secondValue));
			if(nave_colpita) {

				int elem = botNav.get(boat);
				elem--;
				botNav.put(boat, elem);
				
				if(botNav.get(boat)==0) {
					number_of_boat_bot--;
					System.out.println("Hai distrutto una nave");
					if(number_of_boat_bot==0) {
						System.out.println("-------HAI VINTO------");
						return;
					}
				}
				
				grigliaVisibile.gameBoard[9-firstValue+65][Integer.parseInt(secondValue)]="xxx";
			}else {
				grigliaVisibile.gameBoard[9-firstValue+65][Integer.parseInt(secondValue)]="zzz";
			}
			grigliaVisibile.getGameBoard();
			
			//turno bot
			Random rand = new Random();
			int row = rand.nextInt(10);
			int col = rand.nextInt(10);
			nave_colpita = player.checkNaveColpita(row, col);
			if(nave_colpita) {
				int elem = botNav.get(boat);
				elem--;
				playerNav.put(boat, elem);
				
				if(playerNav.get(boat)==0) {
					number_of_boat_player--;
					System.out.println("Il bot ha distrutto una nave");
					if(number_of_boat_player==0) {
						System.out.println("-------IL BOT HA VINTO------");
						return;
					}
				}
			}

			player.getGameBoard(playerGameBoard);

		}
	}

}


