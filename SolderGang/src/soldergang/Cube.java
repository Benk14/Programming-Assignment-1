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
public class Cube extends Shape3D
{
    public double length;
    
    
    
    public Cube(double length)
    {
        this.length = length;
    
    }
    
    public double getVolume()
    {
        return Math.pow(length, 3);
    }

    
    public double getSurfaceArea()
    {
        return length*length*6;   
    }
    
    
}
