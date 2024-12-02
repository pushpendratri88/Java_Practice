package com.brainstrom.datastructure.binarytree.preorderTraversal;

public class BinaryTreeLL {
    BinaryNode root;

    BinaryTreeLL(){
        this.root = null;
    }
    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

