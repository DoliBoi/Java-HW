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
public class TreeImpl implements Tree{
    NodeImpl root;

    @Override
    public void setTree(int[] values) {
        this.root = fillTree(values, root, 0, values.length-1);
    }
    
    public NodeImpl fillTree(int[] arr, NodeImpl root, 
                                                int head, int tail) 
    { 
        if (tail > head) { 
            NodeImpl temp = new NodeImpl(arr[head+(tail-head + 1)/2]); 
            root = temp; 

            root.left = fillTree(arr, root.left, 
                                             head, (head+(tail-head + 1)/2)-1); 
  
            root.right = fillTree(arr, root.right, 
                                               1 + (head+(tail-head + 1)/2), tail); 
        } else if (tail==head){
            NodeImpl temp = new NodeImpl(arr[tail]); 
            root = temp; 
        }
        return root; 
    } 

    @Override
    public Node getRoot() {
        return this.root; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return(printTree(root, 0));
    }
    
    public String printTree(Node root, int level) 
    { 
        if (root != null) { 
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < level; i++)
            string.append(" ");
            string.append("- " + root.getValue() + "\n"); 
            string.append(printTree(root.getLeft(), level + 1)); 

            string.append(printTree(root.getRight(), level + 1)); 

            return string.toString();
        } 
        
        return "";
    } 
    
    
}
