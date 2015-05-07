/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 * La clase Modelo funciona, como su nombre indica, de modelo; donde se crea el objeto
 * @author rpachotome
 */
public class Modelo {
    public float height,

    /**
     *
     */
    length,

    /**
     *
     */
    area;

   

    /**
     * Constructor tanto para circulo como para cuadrado ya que le length se puede usar para el radio
     * @param length
     * @param area
     */
    public Modelo(float length, float area) {
        this.length = length;
        this.area = area;
    }

    /**
     * Constructor para triangulo y rectangulo cuyas formas usan las mismas variables
     * @param height
     * @param length
     * @param area
     */
    public Modelo(float height, float length, float area) {
        this.height = height;
        this.length = length;
        this.area = area;
    }

    /**
     *
     */
    public Modelo() {
    }

    /**
     *
     * @return
     */
    public float getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public float getLength() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     *
     * @return
     */
    public float getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(float area) {
        this.area = area;
    }
  
}
