package assignment4.model;
import assignment4.enums.ColorEnum;
import assignment4.enums.FabricEnum;
import assignment4.enums.SizeEnum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author PSO
 */
public class TShirt {
    
    private ColorEnum color;
    private SizeEnum size;
    private FabricEnum fabric;
    private double price;
    
    
    //this is the only cons because we absolutely need
    //fabric,size and color to create TShirt instance
    
    public TShirt(ColorEnum color,SizeEnum size,FabricEnum fabric){
           this.color=color;
           this.size=size;
           this.fabric=fabric;
      
    }
    
    /**
     * 
     * @param color 
     */
    public void setColor(ColorEnum color){
        this.color=color;
    }
    
    
    /**
     * 
     * @return 
     */
    
    public ColorEnum getColor(){
        return this.color;
    }
    
    public void setFabric(FabricEnum fabric){
        this.fabric=fabric;
    }
    
    /**
     * 
     * @param fabric
     * @return 
     */
    
    
    public FabricEnum getFabric(){
        return fabric;
    }
    
    public void setSize(SizeEnum size){
        this.size=size;
    }
    
    public SizeEnum getSize(){
        return size;
    }
   
    
    /**
     * we put this method to have instead of a separate class
     * just to minimize complexity
     * @return 
     */
    
    public double getPrice(){
      return  this.color.getPrice() 
                +
        this.size.getPrice()
              +
        this.fabric.getPrice();
    
    }
    
    @Override
    public String toString(){
        return color.name()+ " - " + size.name() + "- "+ fabric.name() + " - " + getPrice();
    }
    
    
}
