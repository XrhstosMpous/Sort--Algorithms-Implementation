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
public class BubbleSort {
    
    
     public void bubbleSortAllAscending(List<TShirt> tShirtsToSort) {
        int n = tShirtsToSort.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (tShirtsToSort.get(j).getSize().ordinal() > tShirtsToSort.get(j + 1).getSize().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tShirtsToSort.get(j);
                    tShirtsToSort.set(j, tShirtsToSort.get(j + 1));
                    tShirtsToSort.set(j + 1, temp);
                } else if (tShirtsToSort.get(j).getSize().ordinal() == tShirtsToSort.get(j + 1).getSize().ordinal()) {
                    if (tShirtsToSort.get(j).getColor().ordinal() > tShirtsToSort.get(j + 1).getColor().ordinal()) {
                        TShirt temp = tShirtsToSort.get(j);
                        tShirtsToSort.set(j, tShirtsToSort.get(j + 1));
                        tShirtsToSort.set(j + 1, temp);
                    } else if (tShirtsToSort.get(j).getColor().ordinal() == tShirtsToSort.get(j + 1).getColor().ordinal()) {
                        if (tShirtsToSort.get(j).getFabric().ordinal() > tShirtsToSort.get(j + 1).getFabric().ordinal()) {
                            TShirt temp = tShirtsToSort.get(j);
                            tShirtsToSort.set(j, tShirtsToSort.get(j + 1));
                            tShirtsToSort.set(j + 1, temp);
                        }
                    }
                }
            }
        }
    }

    public void bubbleSortSizeAscending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (tshirtsToSortList.get(j).getSize().ordinal() > tshirtsToSortList.get(j + 1).getSize().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortSizeDescending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getSize().ordinal() < tshirtsToSortList.get(j + 1).getSize().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortColorAscending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getColor().ordinal() > tshirtsToSortList.get(j + 1).getColor().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortColorDescending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getColor().ordinal() < tshirtsToSortList.get(j + 1).getColor().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

}
