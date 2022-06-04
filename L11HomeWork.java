import java.util.*;

/**
 * Created by iurii on 04.06.2022
 */
public class L11HomeWork {

    public static void main(String[] args) {

        int[] array = {3, 2, 4, 7, 1999, 5, 9, 0, 50, 1, 11};

        List<Integer> list = new ArrayList<>();

        for(int i: array) {
            list.add(i);
        }

        System.out.println("Sort by Bubble");
        System.out.println("Array before sorting: " + Arrays.toString(array));
        Date startFirstSort = new Date();
        sortByBubble(array);
        Date endFirstSort = new Date();
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("Time to sort: " + (endFirstSort.getTime() - startFirstSort.getTime()) + " milliseconds.");


        System.out.println("Sort by Collections.sort");
        System.out.println("Collection before sorting: " + list);
        Date startSecondSort = new Date();
        Collections.sort(list);
        Date endSecondSort = new Date();
        System.out.println("Collection after sorting: " + list);
        System.out.println("Time to sort: " + (endSecondSort.getTime() - startSecondSort.getTime()) + " milliseconds.");
    }

    private static void sortByBubble (int[] a ) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    var temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

}
