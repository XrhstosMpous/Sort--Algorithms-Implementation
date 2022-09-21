/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package assignment4.enums;

/**
 *
 * @author PSO
 */
public enum FabricEnum {
    
    WOOL(7.0),
    COTTON(4.0),
    POLYESTER(2.0),
    RAYON(9.0),
    LINEN(6.5),
    CASHMERE(11.8),
    SILK(9.7);
    
    private double price;
    
    
    FabricEnum(double price){
        this.price=price;
    }
    
    
    public double getPrice(){
        return this.price;
    }
    
}
