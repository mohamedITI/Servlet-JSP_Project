package POJO;

// Generated Mar 22, 2014 10:38:48 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Books generated by hbm2java
 */
public class Books implements java.io.Serializable {

	private String isbn;
	private Categories categories;
	private String bookName;
	private String bookAuthor;
	private Date bookPublishedDate;
	private String bookType;
	private Date bookAddedDate;
	private String bookImage;
	private double bookPrice;
	private String bookDescription;
	private int bookNumOfSales;

	public Books() {
	}

	public Books(String isbn, Categories categories, String bookName,
			String bookAuthor, Date bookPublishedDate, String bookType,
			Date bookAddedDate, String bookImage, double bookPrice,
			String bookDescription, int bookNumOfSales) {
		this.isbn = isbn;
		this.categories = categories;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublishedDate = bookPublishedDate;
		this.bookType = bookType;
		this.bookAddedDate = bookAddedDate;
		this.bookImage = bookImage;
		this.bookPrice = bookPrice;
		this.bookDescription = bookDescription;
		this.bookNumOfSales = bookNumOfSales;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Date getBookPublishedDate() {
		return this.bookPublishedDate;
	}

	public void setBookPublishedDate(Date bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}

	public String getBookType() {
		return this.bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public Date getBookAddedDate() {
		return this.bookAddedDate;
	}

	public void setBookAddedDate(Date bookAddedDate) {
		this.bookAddedDate = bookAddedDate;
	}

	public String getBookImage() {
		return this.bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public double getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDescription() {
		return this.bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public int getBookNumOfSales() {
		return this.bookNumOfSales;
	}

	public void setBookNumOfSales(int bookNumOfSales) {
		this.bookNumOfSales = bookNumOfSales;
	}

}