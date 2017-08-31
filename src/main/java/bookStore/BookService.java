package bookStore;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tools.JSONconvert;

public class BookService {

	private Map<Integer, Book> bookMap;
	
	private int id;

	public void initBookStore() {
		this.bookMap = new HashMap<Integer, Book>();
		Book aBook = new Book("James Herbert", "Rats", "Horror", "1988");
		Book anotherBook = new Book("Jim Bert", "Cats", "Comedy", "1898");
		bookMap.put(1, aBook);
		bookMap.put(2, anotherBook);
		id = 2;
	}

	public void addBook(String author, String title, String genre, String yearPublished) {
		id++;
		Book newBook = new Book(author, title, genre, yearPublished);
		bookMap.put(id, newBook);
		System.out.println("Added book: " + bookMap.get(id).getTitle());
	}

	public void deleteBook(Integer bookId) {
		System.out.println("Removing book: " + bookMap.get(bookId).getTitle());
		bookMap.remove(bookId);
	}
	
	public void convertToJSON() {
		try {
			JSONconvert.mapper.writeValue(new File("C:\\Users\\Administrator\\Documents\\QAC\\Bookstore\\bookstore.json"), bookMap);
		} catch (JsonGenerationException e) {
			System.out.println("JSON Geneneration failed");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("JSON Mapping failed");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Failed to write file");
			e.printStackTrace();
		}
	}
	
	//public void addfromJSON() {
	//	try {
	//		JSONconvert.mapper.readValues(new File("C:\\Users\\Administrator\\Documents\\QAC\\Bookstore\\books.json"), bookMap);
	//	} catch (JsonGenerationException e) {
	//		System.out.println("JSON Geneneration failed");
	//		e.printStackTrace();
	//	} catch (JsonMappingException e) {
	//		System.out.println("JSON Mapping failed");
	//		e.printStackTrace();
	//	} catch (IOException e) {
	//		System.out.println("Failed to read file");
	//		e.printStackTrace();
	//	}
	//}
	
	public void output() {
		for (int key : bookMap.keySet()) {
		System.out.println("Book ID " + key + ": " + bookMap.get(key).getAuthor() + ", " +
				bookMap.get(key).getTitle() + ", " + bookMap.get(key).getGenre() + ", " + 
				bookMap.get(key).getYearPublished());
		}
	}
}