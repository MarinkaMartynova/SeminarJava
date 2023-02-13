package SeminarJava;
import java.util.Scanner;
/*
 * Задание 3:  Реализовать простой калькулятор
 * 
 */
public class JavaHomework3 {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Арифметическое действие: ");
        char operation = scanner.next().charAt(0);
        scanner.close();
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }
        System.out.printf("Ответ: " + num1 + " " + operation + " " + num2 + " = " + result);
        
       
    }

}    