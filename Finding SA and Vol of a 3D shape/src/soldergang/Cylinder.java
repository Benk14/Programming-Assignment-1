/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldergang;

/**
 *
 * @author Ben
 */
public class Cylinder {
     
    public double radius;
    public double height;
    
    
    
    public Cylinder ()
    {
    
    }

    public double getVolume()
    {
        return Math.pow(radius, 2) * height * Math.PI;
    }

    
    public double getSurfaceArea()
    {
        return radius*height *Math.PI*2 + 2*Math.PI*Math.pow(radius, 2);   
        
       
    } 
}
