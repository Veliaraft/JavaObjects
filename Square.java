package com.company;

public class Square{
    public double Edge;
    public double[] center = new double[2];

    public Square(double edge){
        Edge = edge; center[0] = center[1] = edge/2;
    }

    public double Diagonal(){ return Math.sqrt(Edge*Edge + Edge*Edge); }
}

