package com.learning.core.day1;

class Book {
	private String book_title;
	private double book_price;
	
	public void setBook_title(String book_name)
	{
		this.book_title = book_name;
	}
	
	public String getBook_title()
	{
		return this.book_title;
	}
	
	public void setBook_price(double price)
	{
		this.book_price = price;
	}
	
	public double getBook_price()
	{
		return this.book_price;
	}
}

class BookMethods {
	
	Book b1 = new Book();
	public void createBooks()
	{
		b1.setBook_title("Java Programming");
		b1.setBook_price(350.00);
	}
	
	public void showBooks()
	{
		System.out.println(b1.getBook_title());
		System.out.printf("%.2f",b1.getBook_price());
	}
}


public class D01P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMethods bm = new BookMethods();
		bm.createBooks();
		bm.showBooks();
	}

}
