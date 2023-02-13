package SeminarJava;

import java.text.Format;
import java.util.Arrays;

// import java.time.LocalDateTime;

// /**
//  * lesson1
//  */
// public class lesson1 {

//     public static void main(String[] args) {  //входбная точка в программму
//         System.out.println("Hello world");      //вывести на экран строку
//         System.out.println(LocalDateTime.now());  //вывести на экран время
//     }
// }



/**
 * Задание 1: Написать программу, которая запросит
 * пользователя ввести <Имя> в консоли.
 * Получит введенную строку и выведет в консоли сообщение
 * "Привет, <Имя>!"
 */
// import java.util.Scanner;
// public class lesson1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//             System.out.printf("name: ");
//             String name = iScanner.nextLine();
//             System.out.printf("Привет, %s!", name);
//             iScanner.close(); 
//     }
// }



/**
 * Задание 2: Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 * вывести максимальное количество подряд идущих 1.
 */
// public class lesson1 {

//     public static void main(String[] args) {
//         int[] arr = new int[] {1,1,0,0,0,1};
//         System.out.println(arr.length);
        
//         int max = 0; 
//         int count = 0;

//         for (int i : arr) {
//             if (i == 1) {
//                 count++; 
//                 if (count > max){
//                     max = count;
//                 }                                    
//             }
//             else{                
//                 count = 0;
//             }
//         }
//         System.out.printf("Максимальное количествоподряд идущих единиц: %d", max);
      
//     }
// }


/**
 * Задание 3: Дан массив nums = [3,2,2,3] и число val = 3. 
 *Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
 *Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
 *а остальные - равны ему.
 */
// public class lesson1 {

//     public static void main(String[] args) {
//         int[] arr = new int[] {3,2,2,3,3,3,2,2,2};
//         System.out.println(Arrays.toString(arr));
        
//         int val = 3;
//         int j = 0;
//         int temp = 0;
//         for (int i = 0; i < arr.length; i++){
//             if (arr[i] != val){
//                 temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//                 j++;
//             }
//         }
        
//         System.out.println(Arrays.toString(arr));
//     }
// }

/**
 * Задание 4: Напишите метод, который находит самую длинную строку общего
 * префикса(одинаковое начало) среди массива строк
 * Если общего префикса нет, вернуть пустую строку "".
 */
// public class lesson1 {

//     public static void main(String[] args) {
//         String[] strings = {"котик", "кошка", "кот"};
//         String maxPrefix;
//         for(String word : strings){
//             //find min word.length()



//         }
//         for (String word : strings){
//             if(!word.contains(maxPrefix)){

//             }
//         }
//     }
// }