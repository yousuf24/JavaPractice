package com.infy.pp3;

import java.util.*;

public class BfsAndDfs {
	
	public static class Node{
		private int id;
		LinkedList<Node> adj=new LinkedList<>();
		private Node(int id){
			this.id=id;
		}
		
	}
	
	private Node getNode(int id) {
		Node n=new Node(id);
		return n;
	}
	
	public void addEdge(int src,int dest) {
		Node source=new Node(src);
		Node destination=new Node(dest);
		source.adj.add(destination);
	}

	public boolean hasPathDFS(int src,int dest) {
		Node s=getNode(src);
		Node d=getNode(dest);
		HashSet<Integer> visited=new HashSet<>();
		return hasPathDFS(s,d,visited);
	}
	
	public boolean hasPathDFS(Node s,Node d,HashSet<Integer> hs) {
		if(hs.contains(s.id))return false;
		hs.add(s.id);
		if(s==d)return true;
		for(Node each:s.adj) {
			if(hasPathDFS(each,d,hs))return true;
		}
		return false;
		
	}
	
	public boolean hasPathBFS(int s,int d) {  //polymorphism using same method name but diff params
		return hasPathBFS(getNode(s),getNode(d));
	}
	
	private boolean hasPathBFS(Node s,Node d) {  //make this private to improve loose coupling
		LinkedList<Node> nextToVisit=new LinkedList<Node>();
		HashSet<Integer> visited=new HashSet<>();
		nextToVisit.add(s);
		
		while(!nextToVisit.isEmpty()) {
			Node node=nextToVisit.remove();
			
			if(node==d) return true;
			
			if(visited.contains(node.id)){continue;}
			
			visited.add(node.id);
			
			for(Node child:node.adj) {
				nextToVisit.add(child);
			}
			
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		

	}

}


