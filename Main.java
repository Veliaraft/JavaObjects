package com.company;

public class Main {

    public static void main(String[] args) {
        Square sqr = new Square(2);
        System.out.println("Диагональ созданного нами квадрата равна " + sqr.Diagonal());
        Rectangle rtg = new Rectangle(2, 4);
        System.out.println("Площадь созданного нами прямоугольника равна " + rtg.Rectangle_Area());
    }
}
