package tests;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import bookStore.model.Book;
import bookStore.service.BookServiceImpl;

public class TestBookService {

	//BookServiceImpl testBookService = new BookServiceImpl();
	//Book testBook;
	//Map<Integer, Book> testMap;
	
	@Test
	public void testInitBookstore() {
		//testBookService.initBookStore();
		//assertNotNull("Map not initialised", testBookService.bookMap);
		//assertEquals("Book 1 not added", testBookService.bookMap.get(1).getAuthor(), "James Herbert");
		//assertEquals("Book 2 not added", testBookService.bookMap.get(2).getAuthor(), "Jim Bert");
	}
	
	@Test
	public void testCreateBook() {
		//String testJSONString = "";
		//testBookService.id=7;
		//testBookService.addBook(testJSONString);
		//assertNotNull("ID not changed", testBookService.bookMap.get(testBookService.id).getGenre());
		//assertEquals("",testMap.get(testBookService.id).getAuthor(),"");
	}
	
	@Test
	public void testUpdateBook() {
		//String updatedTestJSONString = "";
		//testBookService.id = 2;
		//testBookService.updateBook(testBookService.id,updatedTestJSONString);
		//assertNotNull("Book not replaced", testBookService.bookMap.get(testBookService.id).getGenre());
		//assertEquals("",testMap.get(testBookService.id).getAuthor(),"");
	}
	
	@Test
	public void testRemoveBook() {
		//testBookService.id=1;
		//String testJSONString = "";
		//testBookService.addBook(testJSONString);
		//testBookService.removeBook(testBookService.id-1);
	}
	
}
