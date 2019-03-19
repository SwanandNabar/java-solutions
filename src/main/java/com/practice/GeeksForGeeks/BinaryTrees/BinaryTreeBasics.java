package com.practice.GeeksForGeeks.BinaryTrees;

public class BinaryTreeBasics {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }


    Node root;

    BinaryTreeBasics(int key) {
        root = new Node(key);
    }

    BinaryTreeBasics() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTreeBasics binaryTreeBasics = new BinaryTreeBasics();

//        create root
        binaryTreeBasics.root = new Node(1);

//        create children and leaves
        binaryTreeBasics.root.left = new Node(2);
        binaryTreeBasics.root.right = new Node(3);
        binaryTreeBasics.root.left.left = new Node(4);
    }
}
