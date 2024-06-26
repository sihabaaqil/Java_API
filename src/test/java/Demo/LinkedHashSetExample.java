package Demo;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static void main(String[] args) {
		LinkedHashSet<Book_LinkedHashset> hs = new LinkedHashSet<Book_LinkedHashset>();
		// Creating Books
		Book_LinkedHashset b1 = new Book_LinkedHashset(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book_LinkedHashset b2 = new Book_LinkedHashset(102, "Data Communications & Networking", "Forouzan",
				"Mc Graw Hill", 4);
		Book_LinkedHashset b3 = new Book_LinkedHashset(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to hash table
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		// Traversing hash table
		for (Book_LinkedHashset b : hs) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
