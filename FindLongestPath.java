package com.greatlearning.services;
import java.util.ArrayList;

import com.greatlearning.services.Node.TreeNode;

public class FindLongestPath {

	// Function to find and return the longest path
	public static ArrayList<Integer> findLongestPath(TreeNode root)
	{
		// If root is null means there is no binary tree so return an empty ArrayList
		if(root == null)
		{
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		// Recursive call on root.right
		ArrayList<Integer> p1 = findLongestPath(root.right);

		// Recursive call on root.left
		ArrayList<Integer> p2 = findLongestPath(root.left);

		// Compare the size of the two ArrayList and insert current node accordingly
		if(p1.size() < p2.size())
			p2.add(root.data);
		else
			p1.add(root.data);

		// Return the appropriate ArrayList
		return (p2.size() > p1.size() ? p2 :p1);
	}
}
