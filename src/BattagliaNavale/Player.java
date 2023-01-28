package BattagliaNavale;

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

        if (HIV == 'V') {
            for (int i = 0; i < size; i++) {
                if (this.gameBoard.gameBoard[row][column] != "~~") {
                    return false;
                }

                row++;
            }
            return true;
        } else {

            for (int i = 0; i < size; i++) {
                if (this.gameBoard.gameBoard[row][column] != "~~") {
                    return false;
                }
                column++;
            }

            return true;

        }
    }

    public void setGameBoard(GameBoard gameBoard, boolean bot) {
        int size;

        for (Navi boat: Navi.values()) {
            boolean value = new Random().nextBoolean(); // true Horizontal false Vertical
            switch (boat) {
                case PO:
                    for (int j = 0; j <= number_of_portaerei; j++) {
                        size = size_of_portaerei;
                        if (bot) {
                            System.out.println("SONO IN PO");

                            //bot player
                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_portaerei, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "PO");
                                        rand_column++;
                                    }
                                    //this.gameBoard.getGameBoard();

                                }

                            } else {
                                int rand_row = new Random().nextInt(9 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_portaerei, 'V')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "PO");
                                        rand_row++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }
                            }
                        } else {
                            // human player
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Insert H for Horizontal or V for Vertical");
                            String position = scanner.nextLine();
                            if (position.equals("V")) {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int i = 0; i < size_of_portaerei; i++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                            } else {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int j1 = 0; j1 < size_of_portaerei; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "PO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }


                            };
                        }
                        break;

                    }

                case CO:
                    size = size_of_corazzate;
                    for (int j = 0; j <= number_of_corazzate;) {

                        if (bot) {
                            System.out.println("SONO IN CO");

                            //bot player
                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_corazzate, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CO");
                                        rand_column++;
                                    }
                                    //this.gameBoard.getGameBoard();

                                }

                            } else {
                                int rand_row = new Random().nextInt(9 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_corazzate, 'V')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CO");
                                        rand_row++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }

                            }
                        } else {
                            //human player
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Insert H for Horizontal or V for Vertical");
                            String position = scanner.nextLine();
                            if (position.equals("V")) {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int i = 0; i < size_of_corazzate; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        row++;
                                    }
                                }
                            } else {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int j1 = 0; j1 < size_of_corazzate; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }


                            };
                        }
                        break;
                    }
                case CR:

                    size = size_of_crociere;
                    for (int j = 0; j < number_of_crociere; j++) {

                        if (bot) {
                            System.out.println("SONO IN CR");

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_crociere, 'H')) {
                                    break;
                                } else {
                                    for (int i = 0; i < size; i++) {

                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CR");
                                        rand_column++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }
                            } else {
                                int rand_row = new Random().nextInt(10 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_crociere, 'V')) {
                                    break;
                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CR");
                                        rand_row++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }
                            }
                        } else {
                            // human player
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Insert H for Horizontal or V for Vertical");
                            String position = scanner.nextLine();
                            if (position.equals("V")) {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int i = 0; i < size_of_crociere; i++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                            } else {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int j1 = 0; j1 < size_of_crociere; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "CR");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }


                            };
                        }
                        break;
                    }
                case SO:
                    size = size_of_sottomarini;
                    for (int j = 0; j < number_of_sottomarini; j++) {

                        if (bot) {
                            System.out.println("SONO IN SO");

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_sottomarini, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "SO");
                                        rand_column++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }

                            } else {
                                int rand_row = new Random().nextInt(9 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_sottomarini, 'V')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "SO");
                                        rand_row++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }
                            }
                        } else {
                            // human player
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Insert H for Horizontal or V for Vertical");
                            String position = scanner.nextLine();
                            if (position.equals("V")) {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int i = 0; i < size_of_sottomarini; i++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                            } else {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "SO");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                            };
                        }

                        break;
                    }

                case NA:
                    size = size_of_assalto;

                    for (int j = 0; j <= number_of_assalto; j++) {

                        if (bot) {

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_assalto, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "NA");
                                        rand_column++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }

                            } else {
                                int rand_row = new Random().nextInt(9 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_assalto, 'V')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "NA");
                                        rand_row++;
                                    }
                                    //this.gameBoard.getGameBoard();
                                }
                            }
                        } else {
                            //human player
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Insert H for Horizontal or V for Vertical");
                            String position = scanner.nextLine();
                            if (position.equals("V")) {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();


                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "N");
                                        row++;
                                    }
                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int i = 0; i < size_of_assalto; i++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                            } else {
                                System.out.println("Insert the number of row");
                                String letter = scanner.nextLine();
                                System.out.println("Insert the column");
                                int column = scanner.nextInt();
                                if (letter.equals("A")) {
                                    int row = 0;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("B")) {
                                    int row = 1;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("C")) {
                                    int row = 2;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("D")) {
                                    int row = 3;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("E")) {
                                    int row = 4;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("F")) {
                                    int row = 5;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("G")) {
                                    int row = 6;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("H")) {
                                    int row = 7;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }
                                if (letter.equals("I")) {
                                    int row = 8;
                                    for (int j1 = 0; j1 < size_of_assalto; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                                if (letter.equals("L")) {
                                    int row = 9;
                                    for (int j1 = 0; j1 < size_of_sottomarini; j1++) {
                                        gameBoard.setElementGameBoard(row, column, "NA");
                                        column++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }
                            };

                        }
                        break;
                    }
                default:
            }
        }
    }
}