import java.util.Arrays;
import java.util.Random;


/**
 * Задание 3: 3* Реализовать алгоритм сортировки слиянием
 */
public class homeworkByLesson3_3 {

    // Функция сортировки слиянием       
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            
            merge(array, left, right);
        }
    }

    // Функция для получения левой половины массива
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    // Функция для получения правой половины массива
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    // Функция слияния двух массивов
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;
    
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
    
    // Тестируем алгоритм
    public static void main(String[] args) {
        Random random = new Random();
            int[] array = new int[5];
    
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
    
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
        mergeSort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    } 
    
}
    