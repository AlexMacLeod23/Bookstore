package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bookStore.Book;

public class TestBook {

	Book testBook;
	
	@Test
	public void testGetAuthor() {
		this.testBook = new Book("testAuthor", "t", "g", "y");
		assertEquals("Couldn't find correct author", testBook.getAuthor(), "testAuthor");
	}
	
	@Test
	public void testGetTitle() {
		this.testBook = new Book("a", "testTitle", "g", "y");
		assertEquals("Couldn't find correct title", testBook.getTitle(), "testTitle");
	}
	
	@Test
	public void testGetGenre() {
		this.testBook = new Book("a", "t", "testGenre", "y");
		assertEquals("Couldn't find correct genre", testBook.getGenre(), "testGenre");
	}
	
	@Test
	public void testGetPublished() {
		this.testBook = new Book("a", "t", "g", "testYear");
		assertEquals("Couldn't find correct year", testBook.getYearPublished(), "testYear");
	}
	
	@Test
	public void testSetAuthor() {
		this.testBook = new Book("a", "t", "g", "y");
		testBook.setAuthor("testAuthor");
		assertEquals("Author not set correctly", testBook.getAuthor(), "testAuthor");
	}
	
	@Test
	public void testSetTitle() {
		this.testBook = new Book("a", "t", "g", "y");
		testBook.setTitle("testTitle");
		assertEquals("Title not set correctly", testBook.getTitle(), "testTitle");
	}
	
	@Test
	public void testSetGenre() {
		this.testBook = new Book("a", "t", "g", "y");
		testBook.setGenre("testGenre");
		assertEquals("Genre not set correctly", testBook.getGenre(), "testGenre");
	}
	
	@Test
	public void testSetPublished() {
		this.testBook = new Book("a", "t", "g", "y");
		testBook.setYearPublished("testYear");
		assertEquals("Year Published not set correctly", testBook.getYearPublished(), "testYear");
	}

}
