package com.maxi.assign1;

public class Book {
	String title;
	String author;
	int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void checkBookType() {

		if (price > 500) {
			System.out.println("Premium book");
		} else {
			System.out.println("Standard book");
		}

	}
}
