package com.pranil.academy.trees.binarytrees;

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
