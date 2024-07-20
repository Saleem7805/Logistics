package com.example.libraryManagementCrud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryEntity {
	@Id
	private int lid;
	private String author;
	private String DateOfIssue;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDateOfIssue() {
		return DateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		DateOfIssue = dateOfIssue;
	}
	public LibraryEntity(int lid, String author, String dateOfIssue) {
		super();
		this.lid = lid;
		this.author = author;
		DateOfIssue = dateOfIssue;
	}
	public LibraryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LibraryEntity [lid=" + lid + ", author=" + author + ", DateOfIssue=" + DateOfIssue + "]";
	}
	
	
	

}
