/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4.enums;

/**
 *
 * @author PSO
 */
public enum ColorEnum {
    
    RED(5.0),
    ORANGE(6.0),
    YELLOW(3.0),
    GREEN(4.0),
    BLUE(1.5),
    INDIGO(4.5),
    VIOLET(7.8);
    
    
    
    private double price;
    
    
    
    
    
    
    
    ColorEnum(double price){
        this.price=price;
       
    }
    
    
    
    public double getPrice(){
        return this.price;
    }
    
    
    
    
    
    
}
