package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String shapeType;
        Modelo mod=new Modelo();

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
            //add area calculations for square
            

            System.out.println("what is the side length?");
            mod.setLength(sc.nextFloat()); 
            mod.setArea(mod.getLength() * mod.getLength());
            

        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
           

            System.out.println("what is the rectangles width?");
            mod.setLength(sc.nextFloat());
            System.out.println("What is the rectangles height?");
            mod.setHeight(sc.nextFloat());
            mod.setArea(mod.getLength() * mod.getHeight()); 
            

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
        

            System.out.println("What is the base length of the triangle?");
            mod.setLength(sc.nextFloat());
            System.out.println("What is the height of the triangle?");
            mod.setHeight(sc.nextFloat()); 
            mod.setArea((float) (0.5 * mod.getLength() * mod.getHeight())); 
   

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            System.out.println("What is the radius of the circle?");
            mod.setLength(sc.nextFloat());
            mod.setArea(mod.getLength()*mod.getLength()); 
            mod.setArea((float) (3.14159265 * mod.getArea())); 
            

        }

    }
}
