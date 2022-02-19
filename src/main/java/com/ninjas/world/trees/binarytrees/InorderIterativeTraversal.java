package com.ninjas.world.trees.binarytrees;

import java.util.Stack;

public class InorderIterativeTraversal {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = BinaryTreeUtils.takeInputLevelOrer();
        printInorderIterative(binaryTreeNode);
    }

    private static void printInorderIterative(BinaryTreeNode binaryTreeNode) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode currentNode = binaryTreeNode;
        stack.add(currentNode);
        while (null != currentNode || stack.size()>0){
            while (currentNode!= null) {
                stack.add(currentNode);
                currentNode = currentNode.leftNode;
            }
            currentNode = stack.pop();
            System.out.println(currentNode);
            stack.push(currentNode.rightNode);
        }
    }
}
