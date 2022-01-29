/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 *@author Billy Rahaj 500898736
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        Circuit c1 = Circuit.getInstance();
        
        Node D = new Node();
        Node E = new Node();
        Node F = new Node();
        System.out.println(D.toString());
        System.out.println(E.toString());
        System.out.println(F.toString());

        Resistor rA = new Resistor(50.0, D, E);
        Resistor rB = new Resistor(70.0, E, F);
        System.out.println(rA.toString());
        System.out.println(rB.toString());
        
        System.out.println("\nCircuit");
        
        c1.add(rA);
        c1.add(rB);
        System.out.println(c1.toString());
    }
    
}

