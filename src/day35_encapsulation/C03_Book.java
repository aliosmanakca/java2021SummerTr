package day35_encapsulation;

/*
 
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

    "Book name is BOOKNAME and Author is AUTHORNAME"
 */

public class C03_Book { 
	
	private String bookName;
	private String authorName;
	
	
	public String getBookName() {
		return bookName; 
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
