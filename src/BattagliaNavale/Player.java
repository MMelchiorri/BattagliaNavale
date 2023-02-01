package BattagliaNavale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

    private GameBoard gameBoard;


    private boolean bot; // if true player is a human else a bot
    public enum Navi {
        PO,
        CO,
        CR,
        SO,
        NA
    };

    //Ship Size
    public static int size_of_portaerei = 5;
    public static int size_of_corazzate = 4;
    public static int size_of_crociere = 3;
    public static int size_of_sottomarini = 3;
    public static int size_of_assalto = 2;

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


    public List < List < Integer >> listOfAvailableCells(int number_of_cell, String direction) {


        List < List < Integer >> available_cell = new ArrayList < > ();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int temp = 0;
                for (int n = 0; n < number_of_cell; n++) {
                    try {
                        if (direction == "O") {
                            if (this.gameBoard.gameBoard[i][j + n] != "~~") {
                                break;
                            } else {
                                temp++;
                            }
                        } else {
                            if (this.gameBoard.gameBoard[i + n][j] != "~~") {
                                break;
                            } else {
                                temp++;
                            }
                        }
                    } catch (Exception e) {

                    }


                }
                if (temp == number_of_cell) {

                    available_cell.add(Arrays.asList(i, j));

                }

            }
        }
        return available_cell;
    }




    public void setGameBoard(GameBoard gameBoard) {
        Random rand = new Random();
        if (!this.bot) {
            // player is a bot
            System.out.println("sono in bot");
            ArrayList < String > directionList = new ArrayList();
            directionList.add("O");
            directionList.add("V");
            for (Navi boat: Navi.values()) {
                if (boat.name().equals("PO")) {

                    for (int number_of_boats = 0; number_of_boats < number_of_portaerei; number_of_boats++) {
                        String direction = directionList.get(rand.nextInt(directionList.size()));
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_portaerei, direction);
                        //System.out.println(available_cell);
                        if (direction.equals("O")) {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_portaerei; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0), list_of_cell.get(1) + size_of_boat, boat.name());

                            }

                        } else {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;
                            System.out.println(list_of_cell);
                            for (int size_of_boat = 0; size_of_boat < size_of_portaerei; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0) + size_of_boat, list_of_cell.get(1), boat.name());

                            }
                        }

                    }
                }
                if (boat.name().equals("CO")) {

                    for (int number_of_boats = 0; number_of_boats < number_of_corazzate; number_of_boats++) {

                        String direction = directionList.get(rand.nextInt(directionList.size()));
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_corazzate, direction);
                        if (direction.equals("O")) {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;
                            for (int size_of_boat = 0; size_of_boat < size_of_corazzate; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0), list_of_cell.get(1) + size_of_boat, boat.name());

                            }

                        } else {
                            int row = rand.nextInt(10 - size_of_corazzate);
                            int column = rand.nextInt(10);
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;
                            for (int size_of_boat = 0; size_of_boat < size_of_corazzate; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0) + size_of_boat, list_of_cell.get(1), boat.name());
                            }
                        }

                    }
                }
                if (boat.name().equals("CR")) {

                    for (int number_of_boats = 0; number_of_boats < number_of_crociere; number_of_boats++) {

                        String direction = directionList.get(rand.nextInt(directionList.size()));;
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_crociere, direction);
                        if (direction.equals("O")) {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_crociere; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0), list_of_cell.get(1) + size_of_boat, boat.name());

                            }

                        } else {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_crociere; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0) + size_of_boat, list_of_cell.get(1), boat.name());

                            }
                        }

                    }
                }
                if (boat.name().equals("SO")) {
                    for (int number_of_boats = 0; number_of_boats < number_of_sottomarini; number_of_boats++) {

                        String direction = directionList.get(rand.nextInt(directionList.size()));
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_sottomarini, direction);

                        if (direction.equals("O")) {
                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_sottomarini; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0), list_of_cell.get(1) + size_of_boat, boat.name());

                            }

                        } else {

                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_sottomarini; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0) + size_of_boat, list_of_cell.get(1), boat.name());



                            }
                        }

                    }

                }
                if (boat.name().equals("NA")) {
                    for (int number_of_boats = 0; number_of_boats < number_of_assalto; number_of_boats++) {


                        String direction = directionList.get(rand.nextInt(directionList.size()));;
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_assalto, direction);

                        if (direction.equals("O")) {

                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_assalto; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0), list_of_cell.get(1) + size_of_boat, boat.name());

                            }

                        } else {

                            List < Integer > list_of_cell = available_cell.get(rand.nextInt(available_cell.size()));;

                            for (int size_of_boat = 0; size_of_boat < size_of_assalto; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(list_of_cell.get(0) + size_of_boat, list_of_cell.get(1), boat.name());

                            }
                        }

                    }

                }
            }
        } else {

            //player
            ArrayList < String > directionList = new ArrayList();
            directionList.add("O");
            directionList.add("V");

            for (Navi boat: Navi.values()) {

                Scanner in = new Scanner(System.in);



                System.out.println("Inserisci una " + boat.name());
                String nave = in .nextLine();

                if (nave.equals("PO")) {

                    for (int number_of_boat = 0; number_of_boat < number_of_portaerei; number_of_boat++) {
                        System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");

                        String direction = in .nextLine();
                        while (!directionList.contains(direction)) {
                            System.out.println("Inserisci un valore valido");
                            direction = in .nextLine();

                        }
                        System.out.println("Inserisci le coordinate");
                        String coord = in.nextLine();
                        System.out.println(coord);
                        int firstValue = (int) coord.charAt(0);
                        String secondValue = coord.substring(1, coord.length());
          
                        List < List < Integer >> available_cell = this.listOfAvailableCells(size_of_portaerei, direction);
                        while(!available_cell.contains(Arrays.asList(9 - firstValue + 65,secondValue))) {
                        	System.out.println("sono in false");
                            System.out.println("Inserisci le coordinate");
                            coord = in.nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());
                        }
                        while ((firstValue < 65 || firstValue > 74) && (Integer.parseInt(secondValue) > 10)) {
                            System.out.println("Inserisci un valore valido");
                            coord = in .nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());
                            System.out.println(Arrays.asList(9 - firstValue + 65,secondValue));


                        }
                        if (direction.equals("O")) {
                            for (int size_of_boat = 0; size_of_boat < size_of_portaerei; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65, Integer.parseInt(secondValue) + size_of_boat, boat.name());
                                this.gameBoard.getGameBoard();


                            }
                        } else {
                            for (int size_of_boat = 0; size_of_boat < size_of_portaerei; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65 + size_of_boat, Integer.parseInt(secondValue), boat.name());
                                this.gameBoard.getGameBoard();

                            }

                        }

                    }


                }
                if (nave.equals("CO")) {
                    System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");
                    for (int number_of_boat = 0; number_of_boat < number_of_corazzate; number_of_boat++) {
                        System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");

                        String direction = in .nextLine();
                        while (!directionList.contains(direction)) {
                            System.out.println("Inserisci un valore valido");
                            direction = in .nextLine();

                        }
                        System.out.println("Inserisci le coordinate");
                        String coord = in .nextLine();
                        System.out.println(coord);
                        int firstValue = (int) coord.charAt(0);
                        String secondValue = coord.substring(1, coord.length());
                        System.out.println(firstValue);
                        System.out.println(secondValue);
                        while ((firstValue < 65 || firstValue > 74) && (Integer.parseInt(secondValue) > 10)) {
                            System.out.println("Inserisci un valore valido");
                            coord = in .nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());

                        }
                        if (direction.equals("O")) {
                            for (int size_of_boat = 0; size_of_boat < size_of_corazzate; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65, Integer.parseInt(secondValue) + size_of_boat, boat.name());
                                this.gameBoard.getGameBoard();


                            }
                        } else {
                            for (int size_of_boat = 0; size_of_boat < size_of_corazzate; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65 + size_of_boat, Integer.parseInt(secondValue), boat.name());
                                this.gameBoard.getGameBoard();

                            }

                        }

                    }
                }

                if (nave.equals("CR")) {
    
                    for (int number_of_boat = 0; number_of_boat < number_of_crociere; number_of_boat++) {
                        System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");

                        String direction = in .nextLine();
                        while (!directionList.contains(direction)) {
                            System.out.println("Inserisci un valore valido");
                            direction = in .nextLine();

                        }
                        System.out.println("Inserisci le coordinate");
                        String coord = in .nextLine();
                        System.out.println(coord);
                        int firstValue = (int) coord.charAt(0);
                        String secondValue = coord.substring(1, coord.length());
                        System.out.println(firstValue);
                        System.out.println(secondValue);
                        while ((firstValue < 65 || firstValue > 74) && (Integer.parseInt(secondValue) > 10)) {
                            System.out.println("Inserisci un valore valido");
                            coord = in .nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());

                        }
                        if (direction.equals("O")) {
                            for (int size_of_boat = 0; size_of_boat < size_of_crociere; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65, Integer.parseInt(secondValue) + size_of_boat, boat.name());
                                this.gameBoard.getGameBoard();


                            }
                        } else {
                            for (int size_of_boat = 0; size_of_boat < size_of_crociere; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65 + size_of_boat, Integer.parseInt(secondValue), boat.name());
                                this.gameBoard.getGameBoard();

                            }

                        }

                    }


                }



                if (nave.equals("SO")) {
       
                    for (int number_of_boat = 0; number_of_boat < number_of_sottomarini; number_of_boat++) {
                        System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");

                        String direction = in .nextLine();
                        while (!directionList.contains(direction)) {
                            System.out.println("Inserisci un valore valido");
                            direction = in .nextLine();

                        }
                        System.out.println("Inserisci le coordinate");
                        String coord = in .nextLine();
                        System.out.println(coord);
                        int firstValue = (int) coord.charAt(0);
                        String secondValue = coord.substring(1, coord.length());
                        System.out.println(firstValue);
                        System.out.println(secondValue);
                        while ((firstValue < 65 || firstValue > 74) && (Integer.parseInt(secondValue) > 10)) {
                            System.out.println("Inserisci un valore valido");
                            coord = in .nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());

                        }
                        if (direction.equals("O")) {
                            for (int size_of_boat = 0; size_of_boat < size_of_sottomarini; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65, Integer.parseInt(secondValue) + size_of_boat, boat.name());
                                this.gameBoard.getGameBoard();


                            }
                        } else {
                            for (int size_of_boat = 0; size_of_boat < size_of_sottomarini; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65 + size_of_boat, Integer.parseInt(secondValue), boat.name());
                                this.gameBoard.getGameBoard();

                            }

                        }

                    }


                }

                if (nave.equals("NA")) {

                    for (int number_of_boat = 0; number_of_boat < number_of_assalto; number_of_boat++) {
                        System.out.println("Inserisci la direzione in cui vuoi inserire tra Orizzonatel(O) o Verticale (V)");

                        String direction = in .nextLine();
                        while (!directionList.contains(direction)) {
                            System.out.println("Inserisci un valore valido");
                            direction = in .nextLine();

                        }
                        System.out.println("Inserisci le coordinate");
                        String coord = in .nextLine();
                        System.out.println(coord);
                        int firstValue = (int) coord.charAt(0);
                        String secondValue = coord.substring(1, coord.length());
                        System.out.println(firstValue);
                        System.out.println(secondValue);
                        while ((firstValue < 65 || firstValue > 74) && (Integer.parseInt(secondValue) > 10)) {
                            System.out.println("Inserisci un valore valido");
                            coord = in .nextLine();
                            System.out.println(coord);
                            firstValue = (int) coord.charAt(0);
                            secondValue = coord.substring(1, coord.length());

                        }
                        if (direction.equals("O")) {
                            for (int size_of_boat = 0; size_of_boat < size_of_assalto; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65, Integer.parseInt(secondValue) + size_of_boat, boat.name());
                                this.gameBoard.getGameBoard();


                            }
                        } else {
                            for (int size_of_boat = 0; size_of_boat < size_of_assalto; size_of_boat++) {
                                this.gameBoard.setElementGameBoard(9 - firstValue + 65 + size_of_boat, Integer.parseInt(secondValue), boat.name());
                                this.gameBoard.getGameBoard();

                            }

                        }

                    }


                }

            }
        }

    }
}
    
