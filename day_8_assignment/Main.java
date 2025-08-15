package day_8_assignment;

import java.util.LinkedList;
class Book
{
	int id;
	String title;
	String author;
	Book(int id, String title, String author)
	{
		this.id = id;
		this.title = title;
		this.author = author;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		LinkedList<Book> books = new LinkedList<>();
		books.add(new Book(1, "Java", "James"));
		books.add(new Book(2, "Python", "Guido"));
		books.add(new Book(3, "C++", "Bjarne"));
		for (Book b : books) {
			System.out.println(b.id + " " + b.title + " " + b.author);
		}
	}
}