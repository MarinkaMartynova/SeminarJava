
import java.util.Scanner;

/*
 * Задание 2: Вывести все простые числа от 1 до 1000
 * 
 */

//Вариант, где интервал определяет пользователь

public class JavaHomework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("До какого числа n будем выводить простые числа: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.printf("А вот и все простые числа до %d", n);
        System.out.println(); 
        getOfPrime(n);      
    }
    
    public static void getOfPrime(int n) {
        for(int i = 1; i <= n; i++){
            boolean isPrime = true;  
            for(int j = 2; j <= Math.floor(Math.sqrt(i)); j++)
            if ((i % j) == 0){
                isPrime = false;
                break;
            }
            if(isPrime){
                System.out.print(i + " "); 
            }
        }
        
    }

}
