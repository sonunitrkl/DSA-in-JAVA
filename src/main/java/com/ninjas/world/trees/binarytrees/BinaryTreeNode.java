package com.ninjas.world.trees.binarytrees;

public class BinaryTreeNode {
   public BinaryTreeNode leftNode;
   public BinaryTreeNode rightNode;
   int data;

   BinaryTreeNode (int data){
       this.data=data;
       leftNode= null;
       rightNode = null;
   }
}
