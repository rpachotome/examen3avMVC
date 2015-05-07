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
     * En el main se piden los datos y se realizan las operaciones, este funciona como controlador
     */
    public static void main(String[] args) {
        String shapeType;
        Modelo mod=new Modelo();
        Vista vis=new Vista();

        sc = new Scanner(System.in);

        System.out.println("¿De que figura quiere calcular el area? (cuadrado, circulo, triangulo, rectangulo):");
        shapeType = sc.nextLine();
        System.out.println("Ha dicho: " + shapeType);

        if (shapeType.equals("cuadrado")) {
            //add area calculations for square
            

            System.out.println("¿Cual es el tamaño del lado?");
            mod.setLength(sc.nextFloat()); 
            mod.setArea(mod.getLength() * mod.getLength());
            vis.verCuadrado(mod);

        }
        if (shapeType.equals("rectangulo")) {
            //add area calculations for rectangle here
           

            System.out.println("¿Cual es la base del rectangulo?");
            mod.setLength(sc.nextFloat());
            System.out.println("¿Cual es la altura del rectangulo?");
            mod.setHeight(sc.nextFloat());
            mod.setArea(mod.getLength() * mod.getHeight()); 
            vis.verRectangulo(mod);

        }
        if (shapeType.equals("triangulo")) {
            //add area calculations for triangle here
        

            System.out.println("¿Cual es la base del triangulo?");
            mod.setLength(sc.nextFloat());
            System.out.println("¿Cual es la altura del triangulo?");
            mod.setHeight(sc.nextFloat()); 
            mod.setArea((float) (0.5 * mod.getLength() * mod.getHeight())); 
            vis.verTriangulo(mod);

        }
        if (shapeType.equals("circulo")) {
            //add area calculations for a circle here
        

            System.out.println("¿Cual es el radio del circulo?");
            mod.setLength(sc.nextFloat());
            mod.setArea(mod.getLength()*mod.getLength()); 
            mod.setArea((float) (3.14159265 * mod.getArea())); 
            vis.verCirculo(mod);

        }

    }
}
