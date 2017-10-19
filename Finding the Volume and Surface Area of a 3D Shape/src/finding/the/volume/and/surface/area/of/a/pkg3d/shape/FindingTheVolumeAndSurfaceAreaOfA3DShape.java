/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding.the.volume.and.surface.area.of.a.pkg3d.shape;
import java.util.Scanner;
//import java.util.InputMismatchException;
/**
 *
 * @author Ben
 */
public class FindingTheVolumeAndSurfaceAreaOfA3DShape {

static Scanner input = new Scanner(System.in);
static Scanner side_1 = new Scanner(System.in);

    public static double cubevol(float side){
      double volume = Math.pow (side, 3);
        return volume;
    }
        
    public static double cubeSA(float side){
      double SA = side*side*6;
        return SA;
    }


    public static void main(String[] args) {
        boolean again = true;
        System.out.println("Welcome to the volume and surface area calculator!");
        while (again == true){
            System.out.println("What is the shape you would like to use?");
            while(!input.hasNext()){
            input.next();
            System.out.println("Invalid input try again.");
            }
            String shape = input.next();
            
            
            switch(shape){
                
                case "cube" :
                    System.out.println("Since all sides of a cube are equal give me your 1 side length in cm please. ");
                    while(!side_1.hasNextFloat()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    float cubeside = side_1.nextFloat();
                    System.out.printf("The volume of your cube is: " + "%.2f", cubevol(cubeside));
                    System.out.printf("%n"+"The Surface area of your cube is: "+ "%.2f", cubeSA(cubeside));
                    System.out.printf("%n"+"would you like to run this again? ");
                    again = false;
                    break;
                    
                    default:
                    System.out.println("Invalid Input");
                     }
                    
            
        }
        
        
        }
    }
