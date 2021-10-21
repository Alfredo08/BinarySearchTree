package com.codingdojo.app;
import com.codingdojo.datastructure.BST;

public class MainApp {
	public static void main( String args[] ) {
		BST treeOfNums = new BST();
		
		treeOfNums.insert( 100 );
		treeOfNums.insert( 200 );
		treeOfNums.insert( 50 );
		treeOfNums.insert( 80 );
		treeOfNums.insert( 40 );
		
		treeOfNums.inOrder( treeOfNums.getRoot() );
		
	}
}
