package com.infy.pp3;



public class Node {
	Node left,right;
	int data;
	
	public Node(int id){
		this.data=id;
	}
	
	public void insert(int value) {
		if(value<=data) {
			if(left==null)left=new Node(value);
			else {
				left.insert(value);
			}
		}
		else {
			if(right==null)right=new Node(value);
			else right.insert(value);
		}
	}
	

	public boolean contains(int value) {
		if(data==value)return true;
		else if(data<value) {if(left==null)return false; else{  return left.contains(value);}}
		else {if(right==null)return false; else{return right.contains(value);}}
	}

	public void Inorder() {
		if(left!=null)left.Inorder();
		System.out.println(data);
		if(right!=null)right.Inorder();
	}
	
	public void Preorder() {
		
		System.out.println(data);
		if(left!=null)left.Preorder();
		if(right!=null)right.Preorder();
	}
	
	public void PostOrder() {
		
		
		if(left!=null)left.PostOrder();
		if(right!=null)right.PostOrder();
		System.out.println(data);
	}
}
