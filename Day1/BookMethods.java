package core.day1;
// for problem statement 1
public class BookMethods {
	
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
