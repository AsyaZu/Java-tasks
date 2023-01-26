//Реализуйте алгоритм сортировки пузырьком для сортировки массива


public class second {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*51);
            System.out.printf("%d ", arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int m = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = m;
            }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
