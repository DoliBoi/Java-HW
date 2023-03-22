/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.pjv;

/**
 *
 * @author Standard
 */
public class NodeImpl implements Node{

     int value; 
     NodeImpl left, right; 
  
    public NodeImpl(int num) { 
        value = num; 
        left = null;
        right = null; 
    }  

    
    @Override
    public Node getLeft() {
        return this.left; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node getRight() {
        return this.right; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValue() {
        return this.value; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
