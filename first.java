/**  Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300]
**/
import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr = new int [15];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*301);
            System.out.printf("%d ", arr[i]);
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.printf("Максимальное значение: %d", arr[arr.length - 1]);

        System.out.println();
        System.out.printf("Минимальное значение: %d", arr[0]);

        System.out.println();
        System.out.printf("Средние значение: %.3f", sum/arr.length);
    }
}
 