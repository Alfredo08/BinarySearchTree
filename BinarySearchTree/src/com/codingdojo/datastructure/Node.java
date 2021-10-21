package com.codingdojo.datastructure;

public class Node {
	private int value;
	private Node left;
	private Node right;
	
	public Node( int val ) {
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public void setValue( int val ) {
		this.value = val;
	}
	
	public void setLeft( Node left ) {
		this.left = left;
	}
	
	public void setRight( Node right ) {
		this.right = right;
	}
	
}
