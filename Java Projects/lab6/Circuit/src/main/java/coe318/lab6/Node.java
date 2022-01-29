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
public class Node {
    //These variables are instance variables which are used in this class
    private int nodeId;
    private static int node_count = 0; 
    
    // Contructor has no arguments but sets and increment node_count variable
    public Node(){
       this.nodeId = node_count;
       node_count++;
    }
    
    /* 
    The toString method below returns nodeIs but in string format
    */
    @Override
    public String toString(){
        
        return("" + this.nodeId);
    }
    
    } 



