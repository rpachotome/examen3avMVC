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
public class Modelo {
    public float height,length,area,radius;

    public Modelo(float length, float area) {
        this.length = length;
        this.area = area;
    }

    public Modelo(float height, float length, float area) {
        this.height = height;
        this.length = length;
        this.area = area;
    }

    public Modelo() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    

    
    
  

   
}
