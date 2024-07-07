//package com.example;

import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] ar) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
		//ht.put(null, "B");// key:null is not allow in HashTable
	}
}


 
