package com.xworkz.collections.list;

public class Library {
	private String section;
	private String bookName;
	private Double price;
	public Library(String section, String bookName, Double price) {
		super();
		this.section = section;
		this.bookName = bookName;
		this.price = price;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Library [section=" + section + ", bookName=" + bookName + ", price=" + price + "]";
	}

}
