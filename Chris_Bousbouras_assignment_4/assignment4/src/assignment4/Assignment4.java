/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

import assignment4.model.TShirt;
import assignment4.sorting.BubbleSort;
import assignment4.sorting.BucketSort;
import assignment4.sorting.QuickSort;
import assignment4.syntheticdata.SyntheticDataCreator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSO
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<TShirt> randomTShirts = SyntheticDataCreator.getRandomNumberOfTshirts(4000);

        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        BucketSort bucketSort = new BucketSort();

        long startingTime = System.currentTimeMillis();
        quickSort.quickSortSizeAscending(getCopyOf(randomTShirts), 0, randomTShirts.size() - 1);
        long endingTime = System.currentTimeMillis();
        System.out.println("Quick sort for Size/Ascending took (in ms): " + (endingTime - startingTime));

        startingTime = System.currentTimeMillis();
        quickSort.quickSortSizeDescending(getCopyOf(randomTShirts), 0, randomTShirts.size() - 1);
        endingTime = System.currentTimeMillis();
        System.out.println("Quick sort for Size/Descending took (in ms): " + (endingTime - startingTime));

        /*
        
        Insert all other algorithms here.
        
         */
    }

    /**
     * We want to have a new instance of the random list every time we run each
     * sorting algorithm. Using this method, every time a new algorithm runs it
     * uses the same starting(random) data without caring about "pass by
     * reference" problems.
     *
     * @param initialList
     * @return
     */
    private static List<TShirt> getCopyOf(List<TShirt> initialList) {
        List<TShirt> listToReturn = new ArrayList<TShirt>();

        for (int i = 0; i < initialList.size(); i++) {

            TShirt currentTShirt = initialList.get(i);
            TShirt newTShirt = new TShirt(
                    currentTShirt.getColor(),
                    currentTShirt.getSize(),
                    currentTShirt.getFabric());
            listToReturn.add(i, newTShirt);
        }

        return listToReturn;
    }

}
