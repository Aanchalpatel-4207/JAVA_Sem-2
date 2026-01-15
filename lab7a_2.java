import java.util.Scanner;
class Book
{
	private String author_name;

	Book(String author_name)
	{
		this.author_name=author_name;
	}
	void display()
	{
		System.out.println("Author Name:"+author_name);
	}
}
class book_publication extends Book
{
	private String title;

	book_publication(String title)
	{
		this.title=title;
	}
	void displaypub()
	{
		System.out.println("Title"+title);
	}
}
class paper_publication extends Book
{
	private String title;

	paper_publication(String title)
	{
		this.title=title;
	}
	void displaypubpa()
	{
		System.out.println("Title"+title);
	}
}
public class lab7a_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Author Name:");
		String author_name=sc.next();
		System.out.println("Enter book title:");
		String title=sc.next();

		Book b=Book(author_name);
		book_publication bp=book_publication(title,author_name);
		paper_publication pp=paper_publication(title,author_name);

		System.out.println("Enter a book or paper:");
		String op=sc.next();

		if(op.equals("book"))
		{
			b=new book_publication(title,author_name);
			b.display();
		}
		else if(op.equals("paper"))
		{
			b=new paper_publication(title,author_name);
			b.display();
		}
		
		bp.displaypub();
		pp.displaypubpa();
	}	
}