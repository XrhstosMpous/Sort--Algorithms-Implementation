/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package assignment4.enums;

/**
 *
 * @author PSO
 */
public enum SizeEnum {
    
    XS(3.0),
    S(4.0),
    M(5.0),
    L(6.0),
    XL(7.0),
    XXL(8.0),
    XXXL(9.0);
    
    private double price;
    
    SizeEnum(double price){
        this.price=price;
    }
    
    public double getPrice(){
    
        return this.price;
    }
    
}
