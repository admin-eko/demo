package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int SIZE_X = 5;
    static int SIZE_Y = 5;

    static char[][] field = new char[SIZE_Y][SIZE_X];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static void initField () {
            for (int i = 0; i < SIZE_Y; i++) {
                for (int j = 0; j < SIZE_X; j++) {
                    field[i][j] = EMPTY_DOT;
                }
            }
        }

        static void printField () {
            System.out.println("-------");
            for (int i = 0; i < SIZE_Y; i++) {
                System.out.print("|");
                for (int j = 0; j < SIZE_X; j++) {
                    System.out.print(field[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("-------");
        }

        static boolean isCellValid ( int y, int x){
            if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
                return false;
            }
            return field[y][x] != EMPTY_DOT;
        }

        static boolean isFieldFull () {
            for (int i = 0; i < SIZE_Y; i++) {
                for (int j = 0; j < SIZE_X; j++) {
                    if (field[i][j] == EMPTY_DOT) {
                        return false;
                    }
                }
            }
            return true;
        }

        static void setSym ( int y, int x, char sym){
            field[y][x] = sym;
        }

        static void playerStep () {
            int x, y;
            do {
                System.out.println("Введите координаты: X Y (1-5)");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (isCellValid(y, x));
            setSym(y, x, PLAYER_DOT);
        }

        static void aiStep () {
            int x, y;
            do {
                System.out.println("Ходит SkyNet");
                x = random.nextInt(SIZE_X);
                y = random.nextInt(SIZE_Y);
            } while (isCellValid(y, x));
            setSym(y, x, AI_DOT);
        }
                    // AI
//        static int AI_X(int SIZE_X) {
//            int[] mass_X = {0, 1, 2, 3, 4};
//            for (int i = 0; i < mass_X.length; i++) {
//                for (int j = i + 1; j < mass_X.length; j++) {
//                    if (mass_X[i] == mass_X[j]) return mass_X[i];
//                }
//            }
//            return SIZE_X;
//        }
//        static int AI_Y(int SIZE_Y) {
//            int[] mass_Y = {0, 1, 2, 3, 4};
//            for (int j = 0; j < mass_Y.length; j++) {
//                for (int i = j + 1; i < mass_Y.length; i++) {
//                    if (mass_Y[i] == mass_Y[j]) return mass_Y[j];
//                }
//            }
//            return SIZE_Y;
//        }

        static int count(char sym, int i, int j, int dx, int dy) {
            int count = 0;
                 i += dy;
                 j += dx;
            while (i >= 0 && i < 5 && j >= 0 && j < 5 && field[i][j] == sym) {
            count++;
            i += dy;
            j += dx;
        }
             return count;
    }
           static boolean checkWin(char sym) {
        int y = 0;
        int x = 0;
        return count(sym, x, y, -1, 0) + 1 + count(sym, x, y, 1, 0) >= 4
                || count(sym, x, y, 0, -1) + 1 + count(sym, x, y, 0, 1) >= 4
                || count(sym, x, y, -1, -1) + 1 + count(sym, x, y, 1, 1) >= 4
                || count(sym, x, y, -1, 1) + 1 + count(sym, x, y, 1, -1) >= 4;
    }

        public static void main (String[] args){
            initField();
            printField();

            while (true) {
                playerStep();
                printField();
                if (checkWin(PLAYER_DOT)) {
                    System.out.println("Player WIN!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("DRAW");
                    break;
                }
                aiStep();
                printField();
                if (checkWin(AI_DOT)) {
                    System.out.println("WIN SkyNet");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("DRAW");
                    break;
                }
            }

        }
}



