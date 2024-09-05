package com.maxi.assign1;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("Java","Yeso",200);
		Book book1 = new Book("Java","Yeso",600);

		book.checkBookType();
		book1.checkBookType();

	}
}
