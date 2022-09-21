/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4.sorting;

import assignment4.model.TShirt;
import java.util.List;

/**
 *
 * @author PSO
 */
public class QuickSort {
    
    
    public void quickSortAllAscending(List<TShirt> tShirtsToSort, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {

            // This is the partitioning index, arr[p]
            // is now at right place 
            int partitionIndex = partitionAscendingAll(tShirtsToSort, startingIndex, endingIndex);

            // Separately sort elements before
            // partition and after partition
            quickSortSizeAscendingAll(tShirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeAscendingAll(tShirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionAscendingAll(List<TShirt> tShirtsToSort, int low, int high) {

        // pivot
        TShirt pivot = tShirtsToSort.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller 
            // than the pivot
            if (this.checkIfSmaller(tShirtsToSort.get(j), pivot)) {

                // Increment index of 
                // smaller element
                currentLowerNumberCounter++;
                swap(tShirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tShirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    public void quickSortSizeAscending(List<TShirt> tShirtsToSort, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {

            // This is the partitioning index, arr[p]
            // is now at right place 
            int partitionIndex = partitionAscending(tShirtsToSort, startingIndex, endingIndex);

            // Separately sort elements before
            // partition and after partition
            quickSortSizeAscending(tShirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeAscending(tShirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    public void quickSortSizeAscendingAll(List<TShirt> tShirtsToSort, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {

            // This is the partitioning index, arr[p]
            // is now at right place 
            int partitionIndex = partitionAscendingAll(tShirtsToSort, startingIndex, endingIndex);

            // Separately sort elements before
            // partition and after partition
            quickSortSizeAscendingAll(tShirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeAscendingAll(tShirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionAscending(List<TShirt> tShirtsToSort, int low, int high) {

        // pivot
        TShirt pivot = tShirtsToSort.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller 
            // than the pivot
            if (tShirtsToSort.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {

                // Increment index of 
                // smaller element
                currentLowerNumberCounter++;
                swap(tShirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tShirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    /**
     * Checks if tshirt1 < tshirt2 @
     *
     *
     * param tshirt1 @param tshirt2 @return
     */
    private boolean checkIfSmaller(TShirt tshirt1, TShirt tshirt2) {
        boolean isSmaller = false;

        //check for size
        if (tshirt1.getSize().ordinal() < tshirt2.getSize().ordinal()) {
            isSmaller = true;
        } else if (tshirt1.getSize().ordinal() == tshirt2.getSize().ordinal()) {
            // check for color
            if (tshirt1.getColor().ordinal() < tshirt2.getColor().ordinal()) {
                isSmaller = true;
            } else if (tshirt1.getColor().ordinal() == tshirt2.getColor().ordinal()) {
                //check for fabric
                if (tshirt1.getFabric().ordinal() < tshirt2.getFabric().ordinal()) {
                    isSmaller = true;
                }
            }
        }
        return isSmaller;

    }

    private void swap(List<TShirt> tShirtToSort, int i, int j) {
        TShirt temp = tShirtToSort.get(i);
        tShirtToSort.set(i, tShirtToSort.get(j));
        tShirtToSort.set(j, temp);
    }

    public void quickSortSizeDescending(List<TShirt> tShirtsToSort, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {

            // This is the partitioning index, arr[p]
            // is now at right place 
            int partitionIndex = partitionDescending(tShirtsToSort, startingIndex, endingIndex);

            // Separately sort elements before
            // partition and after partition
            quickSortSizeDescending(tShirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeDescending(tShirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionDescending(List<TShirt> tShirtsToSort, int low, int high) {

        // pivot
        TShirt pivot = tShirtsToSort.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller 
            // than the pivot
            if (tShirtsToSort.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {

                // Increment index of 
                // smaller element
                currentLowerNumberCounter++;
                swap(tShirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tShirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

}
