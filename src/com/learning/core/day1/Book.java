package com.learning.core.day1;
// for problem number 1
public class Book {
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
