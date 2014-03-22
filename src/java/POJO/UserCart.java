package POJO;

// Generated Mar 22, 2014 10:38:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * UserCart generated by hbm2java
 */
public class UserCart implements java.io.Serializable {

	private String bookImage;
	private Userinfo userinfo;
	private String bookName;
	private short quantity;
	private double bookUnitprice;
	private double totalprice;

	public UserCart() {
	}

	public UserCart(String bookImage, Userinfo userinfo, String bookName,
			short quantity, double bookUnitprice, double totalprice) {
		this.bookImage = bookImage;
		this.userinfo = userinfo;
		this.bookName = bookName;
		this.quantity = quantity;
		this.bookUnitprice = bookUnitprice;
		this.totalprice = totalprice;
	}

	public String getBookImage() {
		return this.bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public double getBookUnitprice() {
		return this.bookUnitprice;
	}

	public void setBookUnitprice(double bookUnitprice) {
		this.bookUnitprice = bookUnitprice;
	}

	public double getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

}
