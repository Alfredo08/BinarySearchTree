package com.codingdojo.datastructure;

public class BST {
	private Node root;
	
	public BST() {
		this.root = null;
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public void insert( int val ) {
		Node newNode = new Node( val );
		
		if( this.root == null ) {
			this.root = newNode;
		}
		else {
			Node current = this.root;
			Boolean flag = true;
			
			while( flag ) {
				if( current.getValue() > val ) {
					if( current.getLeft() != null ) {
						current = current.getLeft();
					}	
					else {
						current.setLeft( newNode );
						flag = false;
					}
				}
				else {
					if( current.getRight() != null ) {
						current = current.getRight();
					}
					else {
						current.setRight( newNode );
						flag = false;
					}
				}
			}
		}
	}
	
	public void inOrder( Node current ) {
		if( current.getLeft() != null ) {
			inOrder( current.getLeft() );
		}
		System.out.print( current.getValue() + " " );
		if( current.getRight() != null ) {
			inOrder( current.getRight() );
		}
	}
}
