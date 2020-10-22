/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 11:03 AM
 */
public class SelectionSort {
    static double[] lists = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(lists);
        for (double element: lists) {
            System.out.println(element + " ");
        }
    }

    public static void selectionSort(double[] lists) {
        for (int i = 0; i < lists.length - 1; i++) {
            double currentMin = lists[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < lists.length; j++) {
                if (currentMin > lists[j]) {
                    currentMin = lists[j];
                    currentMinIndex = j;
                }
            }

            // swap
            if (currentMinIndex != i) {
                lists[currentMinIndex] = lists[i];
                lists[i] = currentMin;
            }
        }
    }

}
