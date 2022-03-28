package com.ninjas.world.linkedlist.singly.polynomial;

/**
 * @author Sonu Kumar
 */
public class PolynomialNode {
    Double coeficient;
    int exponent;
    public PolynomialNode next;

    public PolynomialNode(double coeficient, int exponent){
        this.coeficient = coeficient;
        this.exponent = exponent;
        this.next = null;
    }
}
