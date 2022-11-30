package com.infy.pp0;
import java.util.*;
class Node{
	public static List<Integer> dpre=new ArrayList<>();
	public static List<Integer> din=new ArrayList<>();
	public static List<Integer> dpost=new ArrayList<>();
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
		this.left=null;
		right=null;
	}
	public void insert(int value) {
		if(value<=this.data) {
			if(left==null)left=new Node(value);
			else this.insert(value);
		}
		else {
			if(right==null)right=new Node(value);
			else this.insert(value);
		}
	}
	
	public boolean deleteNode(int data) {
		for(int i=0;i<dpre.size();i++) {
			if(dpre.get(i)==data) {
				if(left==null && right==null) {dpre.set(i, null);return true;}
				else if(left!=null && right==null) {dpre.remove(i);return true;}
				else if(left==null && right!=null){dpre.remove(i);return true;}
				else {
					dpre.remove(i);
					dpre.set(i, dpre.get(i+1));// when u remove current node MID LEFT RIGHT becomes LEFT RIGHT but it should be RIGHT LEFT so interchange
					dpre.set(i+1, dpre.get(i));
				}
			}
			
		}return false;
	}
}




public class Tester {

	public static void main(String[] args) {
		

	}

}
