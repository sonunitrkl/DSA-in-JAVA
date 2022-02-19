package com.ninjas.world.trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUtils {
    public static BinaryTreeNode buildTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter data");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(data);
        binaryTreeNode.leftNode = buildTree();
        binaryTreeNode.rightNode = buildTree();
        return binaryTreeNode;
    }

    public static void printTreePreOrder(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        System.out.print(binaryTreeNode.data + " ");
        printTreePreOrder(binaryTreeNode.leftNode);
        printTreePreOrder(binaryTreeNode.rightNode);
    }

    public static void printTreePostOrder(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        printTreePostOrder(binaryTreeNode.leftNode);
        printTreePostOrder(binaryTreeNode.rightNode);
        System.out.print(binaryTreeNode.data + " ");
    }

    public static void printTreeInorder(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        printTreeInorder(binaryTreeNode.leftNode);
        System.out.print(binaryTreeNode.data + " ");
        printTreeInorder(binaryTreeNode.rightNode);
    }

    public static void printTreeLevelOrder(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        Queue<BinaryTreeNode> pendingNode = new LinkedList<>();
        pendingNode.add(binaryTreeNode);
        while (!pendingNode.isEmpty()) {
            BinaryTreeNode treeNode = pendingNode.peek();
            pendingNode.remove();
            System.out.print(treeNode.data + " ");
            if (treeNode.leftNode != null) pendingNode.add(treeNode.leftNode);
            if (treeNode.rightNode != null) pendingNode.add(treeNode.rightNode);
        }
    }

    public static int heightBinaryTree(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return 0;
        }
        return 1 + Math.max(heightBinaryTree(binaryTreeNode.leftNode), heightBinaryTree(binaryTreeNode.rightNode));
    }

    public static void printLevelK(BinaryTreeNode binaryTreeNode, int level) {
        if (binaryTreeNode == null) {
            return;
        }
        if (level == 0) {
            System.out.print(binaryTreeNode.data + " ");
            return;
        }
        printLevelK(binaryTreeNode.leftNode, level - 1);
        printLevelK(binaryTreeNode.rightNode, level - 1);
    }

    public static BinaryTreeNode takeInputLevelOrer() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if (data == -1) return null;
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(data);
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.add(binaryTreeNode);
        while (!binaryTreeNodeQueue.isEmpty()) {
            BinaryTreeNode frontNode = binaryTreeNodeQueue.peek();
            binaryTreeNodeQueue.remove();
            data = scanner.nextInt();
            if (data != -1) {
                BinaryTreeNode leftchild =new BinaryTreeNode(data);
                frontNode.leftNode = leftchild;
                binaryTreeNodeQueue.add(leftchild);
            }
            data = scanner.nextInt();
            if (data != -1) {
                BinaryTreeNode rightChild =new BinaryTreeNode(data);
                frontNode.rightNode = rightChild;
                binaryTreeNodeQueue.add(rightChild);
            }
        }
        return binaryTreeNode;
    }

    public static void main(String[] args) {
//        BinaryTreeNode binaryTreeNode = buildTree();
//        printTreeInorder(binaryTreeNode);
//        System.out.println();
        BinaryTreeNode binaryTreeNodeLevelWise = takeInputLevelOrer();
        printTreeLevelOrder(binaryTreeNodeLevelWise);
//        System.out.println();
//        printTreeLevelOrder(binaryTreeNodeLevelWise);
    }
}
