package com.company;

public class Rectangle extends Square{
    public double Width;

    public Rectangle(double width, double height) {
        super(width);
        Edge = height;
        Width = width;
        center[0] = height / 2;
        center[1] = width / 2;
    }
    public double Rectangle_Area(){
        return Edge*Width;
    }
}
