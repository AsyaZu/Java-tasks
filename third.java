/** Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

public class third {
    public static void main(String[] args) {
        boolean b = true;
        for (int num = 2; num <= 100; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.printf("%d ", num);
            else b = true;
        }
    } 
}

