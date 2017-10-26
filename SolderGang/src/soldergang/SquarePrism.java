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
public class SquarePrism extends Shape3D{
    
    
    public double length;
    public double longlength;
    
    
    
    public SquarePrism ()
    {
    
    }

    public double getVolume()
    {
        return Math.pow(length, 2) * longlength;
    }

    
    public double getSurfaceArea()
    {
        return length*length*2 + longlength*4;   
    } 
}
