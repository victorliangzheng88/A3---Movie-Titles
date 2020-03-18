/* Class: CISC 3130
 * Section: TY9
 * EmplId: 23731694
 * Name: Victor Liang Zheng
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3 {
	static TreeNode root;
	public static void main(String[] args) throws Exception{
		//Read in the file
		FileReader fr = new FileReader("movies.csv");
		BufferedReader reader = new BufferedReader(fr);
		LinkedList<String> idList = new LinkedList<String>();
		LinkedList<String> titleList = new LinkedList<String>();
		LinkedList<String> genresList = new LinkedList<String>();
		LinkedList<String> releaseYearList = new LinkedList<String>();
		String row;
		//Inserting the data into the list created above
		while((row = reader.readLine()) != null) {
			String[] data = row.split(",");
			String movieId = data[0];
			idList.add(movieId);
			String title = data[1];
			titleList.add(title);
			String genres = data[2];
			genresList.add(genres);
			}
		reader.close();
		
		//For loop to extract the releaseYear from the title and save it into the releaseYearList
		for (int i = 0; i < titleList.size(); i++) {
			String temp = titleList.get(i);
	        Matcher m = Pattern.compile("\\d+").matcher(temp);
		     while(m.find()) {
			releaseYearList.add(m.group(0));
		     }
		}

		Tree tree = new Tree();
		
		//For loop to insert titles from the titleList into the tree
		for (int i = 0; i < titleList.size(); i++){
			tree.insert(titleList.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		//Asking user for the movie titles
		System.out.println("Please Enter the First Movie Title with Year:");
		String firstM = sc.nextLine();
		System.out.println("Please Enter the Second Movie Title with Year:");
		String secondM = sc.nextLine();
		
		//calling the method searchRange and save it into list
		ArrayList<String> list = searchRange(tree.root, firstM, secondM);
		System.out.println("\n" + "List of Movie Titles in the Range:\n");
		//Print the list of movies between the range
		printList(list);
		sc.close();
		
		
	}
	
	public static void printList(ArrayList<String> list){
	    for(String element : list){
	        System.out.println(element);
	    }
	}
	
	//A method to search movies between the range of two movies
	public static ArrayList<String> searchRange(TreeNode root, String k1, String k2) {
		ArrayList<String> result = new ArrayList<String>();
		if (root == null) {
			return result;
			}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
				}
			else {
				node = stack.pop();
				if (node.data.compareTo(k1) > 0 && node.data.compareTo(k2) < 0) {
					result.add(node.data);
					} 
				else if (node.data.compareTo(k2) > 0) {
					break;
					}
				node = node.right;
				}
			}
		return result;
		}

//Class for node in binary search tree
static class TreeNode {
	   private String data;  // data at each node
	   private TreeNode left, right;
	   
	   public TreeNode(String data) { // construct leaf node
	      this.data = data;
	      left = right = null;
	   }
	}

//Class for BST
static class Tree{
	   private TreeNode root; // hidden root node

	   // insert: if new entry, insert in tree
	   public void insert(String data) {
	      if (root == null) { // must handle case of empty tree first
	         root = new TreeNode(data);
	         return;
	      }
	      TreeNode loc = root; // start search downward at root
	      while (true) {
	         if (data.compareTo(loc.data) < 0) { // look left
	            if (loc.left != null) 
	            	loc = loc.left;
	            else { 
	            	loc.left = new TreeNode(data);
	            break;
	            }
	         }
	         else if (data.compareTo(loc.data) > 0) { // look right
	            if (loc.right != null) 
	            	loc = loc.right;
	            else {
	            	loc.right = new TreeNode(data); 
	            break; 
	            }
	         }
	         else break; // found! Don't insert
	      }
	   }

	   // inorderTraversal: need because root is hidden
	   public void inorderTraversal() {
		   inorderT(root); 
		   }

	   // inorderT: recursive function that print the tree
	   private void inorderT(TreeNode tree) {
	      if (tree != null) {
	         inorderT(tree.left);
	         System.out.print(tree.data + " ");
	         inorderT(tree.right);
	         }
	      }
	   }

}


