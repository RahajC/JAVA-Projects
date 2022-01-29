/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Billy Rahaj 500898736
 */
public class Resistor {
    
    // Instance variables
    public double resistance;
    public Node node1, node2;
    public int rId;
    private static int r_count = 1;
    
    // Constructor for variables and objects
    public Resistor(double resistance, Node node1, Node node2){
        
        // Code is used to handle errors
        
        if(resistance < 0){
            throw new IllegalArgumentException("Resitances cannot be negative.");}
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");}
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.rId = r_count; // Code is used to assign a different ID
        r_count++; // Code used to increment this ID
    }
    
    /*
    Method below in the getNodes() method, returns an array which are connected nodes
   
    */
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    /*
    The toString method is used to return values in string format, in this case it returns
    resistor in string format
    */
    @Override
    public String toString(){
        return("R"+rId + " " + node1 + " " + node2 + " " + resistance);
    }
    
}
