/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4.sorting;

import assignment4.model.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSO
 */
public class BucketSort {
    
    
       public void bucketSortAllAscending(List<TShirt> tshirtsToSort, int maxVal) {
        this.bucketSortSizeAscendingCascade(tshirtsToSort, maxVal);
    }

    public void bucketSortSizeAscendingCascade(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            this.bucketSortColorAscendingCascade(bucket.get(i), maxVal);
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortSizeAscending(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortSizeDescending(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortColorAscending(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortColorAscendingCascade(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            this.bucketSortFabricAscending(bucket.get(i), maxVal);
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortFabricAscending(List<TShirt> tshirtsToSort, int maxVal) {
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTShirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTShirt.getFabric().ordinal();
            bucket.get(currentOrdinal).add(currentTShirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

}
