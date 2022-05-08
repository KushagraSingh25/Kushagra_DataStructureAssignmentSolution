package com.dsa.question2;

public class BST {
	//Node Class
	static class node
	{
	  int data;
	  node left;
	  node right;
	    
	  node(int data)
	  {
	    this.data = data;
	    left = null;
	    right = null;
	  }
	};
	  
	// Function to print skewed binary tree
	static void print(node parent)
	{
	  node curr = parent;
	  while (curr != null)
	  {
	    System.out.print(curr.data + " ");
	    curr = curr.right;
	  }
	}
	  
	static  node prev;
	    
	// Function to perform in-order traversal
	static void Inorder(node curr)
	{
	  if (curr == null)
	    return;
	  Inorder(curr.left);
	  prev.left = null;
	  prev.right = curr;
	  prev = curr;
	  Inorder(curr.right);
	}
	  
	static node Skewed(node parent)
	{
	  node temp = new node(-1);
	  
	  prev = temp;
	  
	
	  Inorder(parent);
	  
	  prev.left = null;
	  prev.right = null;
	  node ret = temp.right;
	  
	  return ret;
	}
	  
	// Driver code
	public static void main(String[] args)
	{
	  node root = new node(50);
	  root.left = new node(30);
	  root.right = new node(60);
	  root.left.left = new node(10);
	  root.right.left = new node(55);
	  
	  // Calling required function
	  print(Skewed(root));
	}

}

