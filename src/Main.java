package java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];
    public static String initialS = "\nInitial matrix: \n";
    public static String rotatedS = "\nRotated: \n";

    public static void main(String[] args) {

        // Part 1. Demonstration
        // заполнение матрицы
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        print(colors, initialS);

        // поворот матрицы на 90 градусов
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[(SIZE - 1) - j][i];
            }
        }
        print(rotatedColors, rotatedS);

        //Part 2. User's choice
        // участие пользователя
        while (true) {
            System.out
                    .println("\nВведите угол поворота: 90, 180, или 270 градусов.\nДля завершения" +
                            " программы введите \"end\".");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            if (s.equals("end")) {
                System.out.println(">> Program was ended by user");
                break;
            }

            // поворот матрицы на 90 градусов
            if (s.equals("90")) {
                // поворот матрицы на 90 градусов
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[(SIZE - 1) - j][i];
                    }
                }
                print(colors, initialS);
                print(rotatedColors, rotatedS);
            }

            // поворот матрицы на 180 градусов
            if (s.equals("180")) {
                // поворот матрицы на 180 градусов
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[(SIZE - 1) - i][(SIZE - 1) - j];
                    }
                }
                print(colors, initialS);
                print(rotatedColors, rotatedS);
            }

            // поворот матрицы на 270 градусов
            if (s.equals("270")) {
                // поворот матрицы на 270 градусов
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][(SIZE - 1) - i];
                    }
                }
                print(colors, initialS);
                print(rotatedColors, rotatedS);
            }
        }


    }

    // вывод массива
    public static void print(int[][] arr, String s) {
        System.out.println(s);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

