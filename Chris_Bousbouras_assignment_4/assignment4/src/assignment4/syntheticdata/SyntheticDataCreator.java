/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4.syntheticdata;



import assignment4.enums.ColorEnum;
import assignment4.enums.FabricEnum;
import assignment4.enums.SizeEnum;
import assignment4.model.TShirt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PSO
 */
public class SyntheticDataCreator {

    /**
     * 
     * @param numberOfTShirts
     * @return 
     */
    
    public static List<TShirt> getRandomNumberOfTshirts(int numberOfTShirts) {

        List<TShirt> listToReturn = new ArrayList<>();
        Random random = new Random();
        ColorEnum[] colors = ColorEnum.values();
        SizeEnum[] sizes = SizeEnum.values();
        FabricEnum[] fabrics = FabricEnum.values();

        for (int i = 0; i < numberOfTShirts; i++) {

            int length = ColorEnum.values().length;

            int randomNumber = random.nextInt(length);

            ColorEnum randomColor = colors[randomNumber];
            SizeEnum randomSize = sizes[random.nextInt(sizes.length)];
            FabricEnum randomFabric = fabrics[random.nextInt(fabrics.length)];
            // randomColor=colors[random.nextInt(colors.length)];    

            listToReturn.add(new TShirt(randomColor, randomSize, randomFabric));
        }

        return listToReturn;

    }

}
