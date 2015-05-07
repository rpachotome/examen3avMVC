/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 * La clase vista sirve para la salida por pantalla tanto de los datos como del resultado
 * @author rpachotome
 */
public class Vista {
    
    /**
     * Salida por pantalla para el cuadrado
     * @param mod
     */
    public void verCuadrado(Modelo mod){
        System.out.println("Si el lado es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }

    /**
     * Salida por pantalla para el rectangulo
     * @param mod
     */
    public void verRectangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }

    /**
     * Salida por pantalla para el triangulo
     * @param mod
     */
    public void verTriangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }

    /**
     * Salida por pantalla para el circulo
     * @param mod
     */
    public void verCirculo(Modelo mod){
        System.out.println("Si el radio es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }
}
