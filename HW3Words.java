/**
 * 3 урок Java 1. Задание №2
 *
 * @author Nikolay Kasparov
 * @vercion dated: 5 Feb, 2018
 */

import java.util.Scanner;

public class HW3Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int firstWords = (int) (Math.random()*words.length);
        String x = words[firstWords];
        while (true) {
            System.out.println("Угадайте слово:");
            String b = scanner.next();
            if (x.equals(b)) {
                System.out.println("Вы угадали!!!");
                break;
            } else {
                if (x.charAt(0) == b.charAt(0)) System.out.println(x.charAt(0)+ "*********"); // Не получились исключить ошибки, поэтому сделал костыльным методом и поэтому только три первых буквы
                if (x.charAt(1) == b.charAt(1)) System.out.println("*" + x.charAt(1)+ "********");
                if (x.charAt(2) == b.charAt(2)) System.out.println("**" + x.charAt(2)+ "*******");
            }
        }
    }
}
