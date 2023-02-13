package SeminarJava;

import java.util.Scanner;
/*
 * Задание 1: Вычислить n-ое треугольное число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n) * 
 * 
 */

// Первый вариант (общий метод)
// public class JavaHomework1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите число n: ");
        
//         int n = scanner.nextInt();
//         int sumN = 0;
//         int factorial = 1;

//         for (int i = 1; i <= n; i++){
//             sumN = sumN + i;
//             factorial = factorial * i;
//         }
//         scanner.close();
//         System.out.printf("Сумма первых %d натуральных чисел: " + sumN, n);
//         System.out.println();
//         System.out.printf("Факториал первых %d натуральных чисел: " + factorial, n);
//     }
// }


// Второй вариант с разбиением на методы

/**
 * JavaHomework1
 */
public class JavaHomework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.printf("Наше треугольное число: %d ", n);
        System.out.println();

        sumN(n);
        factorial(n);
        scanner.close();
        
    }

    public static void sumN(int n){
        int sumN = 0;
        for (int i = 1; i <= n; i++){
            sumN = sumN + i;
        }
        System.out.printf("Сумма первых %d натуральных чисел: " + sumN, n);
        System.out.println();
    }

    public static void factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.printf("Факториал первых %d натуральных чисел: " + factorial, n);

    }
}

