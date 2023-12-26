package Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите арифметическое выражение (например, 2 + 3):");
        calc("");
    }

    public static String calc(String input) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] mas = s.split("\\s*(\\s|/|-|\\+|\\*)\\s*");
        sc.close();
        if (mas.length > 2) {
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (mas.length == 1) {
            throw new Exception("//т.к. строка не является математической операцией.");
        }
        int a = 0;
        int b;
        int result = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (mas[i].equals(Integer.toString(j + 1))) {
                    a++;
                }
            }
        }
        if (a == 1) {
            throw new Exception("//throws Exception ");
        }
        if (a == 2) {
            a = Integer.parseInt(mas[0]);
            b = Integer.parseInt(mas[1]);
        } else {
            throw new Exception("//не подходящее число.");
        }
        if (s.contains("-")) {
            result = a - b;
        } else if (s.contains("+")) {
            result = a + b;
        } else if (s.contains("*")) {
            result = a * b;
        } else if (s.contains("/")) {
            result = a / b;
        }
        System.out.println(result);
        return input;
    }
}
