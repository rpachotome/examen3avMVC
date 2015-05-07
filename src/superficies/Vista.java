/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author rpachotome
 */
public class Vista {
    
    public void verCuadrado(Modelo mod){
        System.out.println("Si el lado es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }
    public void verRectangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }
    public void verTriangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }
    public void verCirculo(Modelo mod){
        System.out.println("Si el radio es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }
}
