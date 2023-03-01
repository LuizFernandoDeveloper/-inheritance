package model.circle;

import model.enums.color_enums.Color;
import model.shape.Shape;

public class Circle extends Shape  {
    
    private Double radius;
    
    public Circle(Color color, Double radius){
        super(color);
        this.radius = radius;
    }
    
    public Double getRadius(){
        return radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public final Double  area(){
        return Math.PI * (radius * radius);
    }

}
