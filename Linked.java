package com.capgCollection.linkedlist;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked();

	}
	
	public static void linked() {
		LinkedList l=new LinkedList();
		l.add(2);
		l.add(null);
		l.add(11);
		l.add(null);
		l.add(2);
		System.out.println(l);
		System.out.println("Size :"+l.size());
	}

}
