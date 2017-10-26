/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldergang;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Shapesin3D{

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner run= new Scanner(System.in);
        boolean Cont=true;
        do
        {
            System.out.println("Welcome to the volume and surface area calculator!");
            Scanner input = new Scanner(System.in);
            System.out.printf("What is the shape you would like to use? "+ "%n" + "1. Cube"+ "%n" + "2. Square Based Prism"+ "%n" +"3. Sphere"+ "%n" +"4. Cylinder" + "%n");
            while(!input.hasNextInt()){
            input.next();
            System.out.println("Invalid input try again.");
            }
            int shape = input.nextInt();
            Scanner side_1 = new Scanner(System.in);
            switch(shape){
                
                case 1 :
                   
                    System.out.println("Since all sides of a cube are equal give me your 1 side length in cm please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    Cube cubething = new Cube(side_1.nextDouble());
                    System.out.printf("The Surface area of your cube is: " + "%.2f", cubething.getSurfaceArea());
                    System.out.printf("%n"+"The Volume of your cube is: "+ "%.2f", cubething.getVolume());
                    
                    
                    
                    System.out.printf("%n"+"would you like to run this again? "+ "%n" + " Yes"+ "%n" + " No"+ "%n");
                    while(!run.hasNext()){
                    run.next();
                    System.out.println("Invalid input try again.");
                    }
                    String yesorno = run.next();
                    if ("yes".equals(yesorno)){
                        Cont = true;
                    }
                    else if ("no".equals(yesorno)){
                        Cont = false;
                    }
                case 2:
                    SquarePrism  prismthing = new SquarePrism ();
                    System.out.println("Give me the Long Side of your square please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    prismthing.longlength = side_1.nextDouble();
                    
                    System.out.println("Give me the Short Side of your square please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    prismthing.length = side_1.nextDouble();
                    System.out.printf("The Surface area of your cube is: " + "%.2f", prismthing.getSurfaceArea());
                    System.out.printf("%n"+"The Volume of your cube is: "+ "%.2f", prismthing.getVolume());
                    
                    
                    System.out.printf("%n"+"would you like to run this again? "+ "%n" + " Yes"+ "%n" + " No"+ "%n");
                    while(!run.hasNext()){
                    run.next();
                    System.out.println("Invalid input try again.");
                    }
                    yesorno = run.next();
                    if ("yes".equals(yesorno)){
                        Cont = true;
                    }
                    else if ("no".equals(yesorno)){
                        Cont = false;
                    }
                    
                case 3: 
                    
                    System.out.println("Give me the radius of your sphere please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    Sphere  Spherething = new Sphere (side_1.nextDouble());
                    System.out.printf("The Surface area of your cube is: " + "%.2f", Spherething.getSurfaceArea());
                    System.out.printf("%n"+"The Volume of your cube is: "+ "%.2f", Spherething.getVolume());
                    
                    
                    System.out.printf("%n"+"would you like to run this again? "+ "%n" + " Yes"+ "%n" + " No"+ "%n");
                    while(!run.hasNext()){
                    run.next();
                    System.out.println("Invalid input try again.");
                    }
                    yesorno = run.next();
                    if ("yes".equals(yesorno)){
                        Cont = true;
                    }
                    else if ("no".equals(yesorno)){
                        Cont = false;
                    }
                    
                case 4:
                    Cylinder  Cylthing = new Cylinder ();
                    System.out.println("Give me the radius of your base please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    Cylthing.radius = side_1.nextDouble();
                    
                    System.out.println("Give me the height of your cylinder please. ");
                    while(!side_1.hasNextDouble()){
                    side_1.next();
                    System.out.println("Invalid input try again. ");
                   }
                    Cylthing.height = side_1.nextDouble();
                    System.out.printf("The Surface area of your cube is: " + "%.2f", Cylthing.getSurfaceArea());
                    System.out.printf("%n"+"The Volume of your cube is: "+ "%.2f", Cylthing.getVolume());
                    
                    
                    System.out.printf("%n"+"would you like to run this again? "+ "%n" + " Yes"+ "%n" + " No"+ "%n");
                    while(!run.hasNext()){
                    run.next();
                    System.out.println("Invalid input try again.");
                    }
                    yesorno = run.next();
                    if ("yes".equals(yesorno)){
                        Cont = true;
                    }
                    else if ("no".equals(yesorno)){
                        Cont = false;
                    }
                    
            }

        
        
        
        
        
        
        
        
        }while(Cont);
        System.out.println("Thanks for using the surface area and volume calculator!");
    }
        
}
