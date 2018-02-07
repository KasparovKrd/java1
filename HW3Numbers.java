/**
 * My third home work
 *
 * @author Nikolay Kasparov
 * @version dated: Feb 05, 2018
 */

import java.util.Scanner;
import java.io.IOException;

public class HW3Numbers {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            throw java.io.IOException{
            int x = 9;
            int number = (int) (Math.random() * x);
            System.out.println("Угадайте число от 0 до " + x);
            for (int y = 0; y < 3; y++) {
                int input = scanner.nextInt();
                if (input == number) {
                    System.out.println("Вы угадали.");
                    break;
                } else if (input > number) {
                    System.out.println("Загаданое число меньше");
                } else if (input < number) {
                    System.out.println("Загадочное число больше");
                }
            }
            System.out.println("Игра окончена! Попробовать еще раз? 1 - да, 0 - нет");
            int s = scanner.nextInt();
            switch (s) {
                case 1:
                    continue;
                case 0:
                    break;
            }
        }
    }
}
