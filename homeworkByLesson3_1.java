// Импортируем необходимые классы
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * Задание 1: Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */
public class homeworkByLesson3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();   // Создаем список ArrayList

        Random random = new Random();

        for (int i = 0; i < 5; i++){
            list.add(random.nextInt(0,100));
        }
        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(val -> val).average().getAsDouble();

        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
    
}

