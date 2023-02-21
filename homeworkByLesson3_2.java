import java.util.ArrayList;
//import java.util.Collection;
import java.util.Random;
import java.util.*;

/**
 * Задание 2: Пусть дан произвольный список целых чисел,
 * удалить из него четные числа
 */
public class homeworkByLesson3_2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();   // Создаем список ArrayList

        Random random = new Random();

        for (int i = 0; i < 5; i++){
            list.add(random.nextInt(0,100));
        }
        System.out.println("Список: " + list);
        
        // Удаляем четные числа
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список без четных чисел: " + list);
    }
}