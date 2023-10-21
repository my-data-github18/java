package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import java.util.Objects;
import java.util.Scanner;


public class Library {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
List<Book> list= new ArrayList<>();
ListIterator<Book> itr;
Book b1;
int choice=0;
do {
System.out.println("0.  Exit");
System.out.println("1. Add new book in list.");
System.out.println("2. Display all books in forward order using random access");
System.out.println("3. Search a book with given isbn");
System.out.println("4. Delete a book at given index.");
System.out.println("5. Delete a book with given isbn.");
System.out.println("6. Reverse the list");
System.out.println("7. To add data in file");
System.out.println("8. To display data from file");
System.out.print("Enter your choice - ");

choice = sc.nextInt();
System.out.println("----------------------------------------------------------------------");

switch(choice)
{         // Add book
case 1://If book not present, then add a new book (hint - contains())
  //If book is present, increment its quantity.
{
b1=new Book();
b1.accept(sc);
if(list.contains(b1))
{
int index =list.indexOf(b1);
        Book bk=list.get(index);
        bk.setQuantity(bk.getQuantity()+1);
}
else
list.add(b1);
}
break;

case 2: //Display all books in forward order
{
itr = list.listIterator();
while(itr.hasNext()) {
b1 = itr.next();
System.out.println(b1);
}
}
break;

case 3: // Search a book with given isbn
{
System.out.println("Enter The isbn ");
String isbn=sc.next();
Book key=new Book();
key.setIsbn(isbn);
System.out.println(key.getIsbn());
int index=list.indexOf(key);
if(index == -1)
System.out.println("Book not found.");
else {
System.out.println("Book Found at Index: " + index);
b1 = list.get(index);
System.out.println(b1);
}
}
break;
case 4://Delete a book at given index.");
{
System.out.print("Enter the index of the book to delete: ");
     int index = sc.nextInt();
     list.remove(index);
     System.out.println("Deleted");
}
break;
case 5: //  Delete a book with given isbn.
{
System.out.println("Enter The isbn ");
String isbn=sc.next();
Book key=new Book();
key.setIsbn(isbn);
int index=list.indexOf(key);
list.remove(index);
System.out.println("Deleted");

}
break;
case 6://Reverse the list
{
Collections.reverse(list);
for(int i=0;i<list.size();i++)
{
Book k=list.get(i);
System.out.println(k);
}
}

break;
case 7:
try(FileOutputStream fout = new FileOutputStream("movies.bin")) {
	try(DataOutputStream dout = new DataOutputStream(fout)) {
		for(Book m : list) {
			dout.writeUTF(m.getIsbn());
			dout.writeDouble(m.getPrice());
			dout.writeUTF(m.getAuthorName());
			dout.writeInt(m.getQuantity());
		}
	} 
} 
catch (Exception e) {
	e.printStackTrace();
}

System.out.println("Movies saved.");

break;

case 8:
	try(FileInputStream fin = new FileInputStream("movies.bin")) {
		try(DataInputStream din = new DataInputStream(fin)) {
			while(true) {
				Book m = new Book();
				m.setIsbn( din.readUTF() );
				m.setPrice( din.readDouble() );
				m.setAuthorName( din.readUTF() );
				m.setQuantity(din.readInt());
				System.out.println(m);
			}
		} 
	} 
	catch (EOFException e) {
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
break;
}
}while(choice !=0);



}//main

}