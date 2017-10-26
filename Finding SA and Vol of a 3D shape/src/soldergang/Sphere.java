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
public class Sphere extends Shape3D {
    
     public double radius;
    
    
    
    
    public Sphere (double radius)
    {
    this.radius = radius;
        }

    public double getVolume()
    {
        return 4/3*Math.PI*Math.pow(radius, 3);
    }

    
    public double getSurfaceArea()
    {
        return 4*Math.PI*Math.pow(radius, 2);   
    } 
    
    
}
