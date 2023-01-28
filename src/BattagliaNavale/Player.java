package BattagliaNavale;

import java.util.Random;

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

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_portaerei, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "PO");
                                        rand_column++;
                                    }
                                    this.gameBoard.getGameBoard();

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
                                    this.gameBoard.getGameBoard();
                                }
                            }
                        }
                        break;

                    }

                case CO:
                    size = size_of_corazzate;
                    for (int j = 0; j <= number_of_corazzate; j++) {

                        if (bot) {

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_corazzate, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CO");
                                        rand_column++;
                                    }
                                    this.gameBoard.getGameBoard();

                                }

                            } else {
                                int rand_row = new Random().nextInt(9 - size);
                                int rand_column = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_corazzate, 'V')) {
                                	break;
                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "CO");
                                        rand_row++;
                                    }
                                    this.gameBoard.getGameBoard();
                                }

                            }
                        }
                        break;
                    }
                case CR:
                    size = size_of_crociere;
                    for (int j = 0; j < number_of_crociere; j++) {

                        if (bot) {

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
                                    this.gameBoard.getGameBoard();
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
                                    this.gameBoard.getGameBoard();
                                }


                            }
                        }
                        break;
                    }
                case SO:
                    size = size_of_sottomarini;
                    for (int j = 0; j < number_of_sottomarini; j++) {

                        if (bot) {

                            if (value) {
                                int rand_column = new Random().nextInt(9 - size);
                                int rand_row = new Random().nextInt(9);
                                if (!checkAvailability(rand_row, rand_column, size_of_sottomarini, 'H')) {

                                } else {
                                    for (int i = 0; i < size; i++) {
                                        gameBoard.setElementGameBoard(rand_row, rand_column, "SO");
                                        rand_column++;
                                    }
                                    this.gameBoard.getGameBoard();
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
                                    this.gameBoard.getGameBoard();
                                }
                            }
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
                                    this.gameBoard.getGameBoard();
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
                                    this.gameBoard.getGameBoard();
                                }
                            }
                        }
                        break;
                    }
                default:
            }
        }
    }
}