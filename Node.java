package com.greatlearning.services;

public class Node {

	// Binary tree node
	public static class TreeNode
	{
		public TreeNode left;
		public TreeNode right;
		int data;
	};

	// Function to create a new Binary node
	public static TreeNode newNode(int data)
	{
		TreeNode temp = new TreeNode();

		temp.data = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}
}
