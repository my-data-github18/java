package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<>();
		Book bl;
		ListIterator<Book> itr;
		int choice;
		do {
			System.out.print("\n1. Add Book\n2. Display All Forward sequence\n3. Search a book with given isbn\n4. Delete a book of a particular index \n5. Delete a book with given isbn\n6. Reverse the list\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: // Add
				bl = new Book();
				bl.accept(sc);
				if (list.contains(bl)) {
					int index = list.indexOf(bl);
					Book bk = list.get(index);
					bk.setQuantity(bk.getQuantity() + 1);
				}
				else {
					list.add(bl);
				}
				break;
			case 2: 
				System.out.println("Display all books");
				for(int i=0; i<list.size();i++) {
					Book b = list.get(i);
					System.out.println(b);
				}
				break;
			case 3: // Search
				System.out.println("Enter isbn to find book: ");
				String isbn = sc.next();
				// to search in list of Albums, pass Album object "key".
				// as equals() is based on "id", the "key" should be initialized with the id.
				Book key = new Book();
				key.setIsbn(isbn);
				int index = list.indexOf(key);
				if(index == -1)
					System.out.println("Book not found.");
				else {
					System.out.println("Book Found at Index: " + index);
					bl = list.get(index);
					System.out.println(bl);
				}
				break;
			case 4: //Delete a book at given index
				System.out.println("Enter index number to delete book: ");
				int indNo = sc.nextInt();
				Book b1 = list.get(indNo);
				list.remove(indNo);
				System.out.println(b1 + "Book deleted" + indNo);
				break;
				
			case 5:
				System.out.println("Enter isbn to delete the book: ");
				isbn = sc.next();
				 key = new Book();
				key.setIsbn(isbn);
				index=list.indexOf(key);
				b1 = list.get(index);
				System.out.println("deleted");
				break;
			case 6:
				Collections.reverse(list);
				System.out.println("Reveresed List: " + list);
				
			}
		}while(choice != 0);
	}
}













