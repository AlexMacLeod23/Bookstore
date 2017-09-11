package bookStore.service;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import bookStore.model.Book;
import tools.JSONconvert;


@ApplicationScoped
@Alternative
public class BookServiceImpl {

	private static final Logger LOGGER = Logger.getLogger(BookServiceImpl.class);
	private Map<Integer, Book> bookMap;
	private int id;
	
	@Inject
	private JSONconvert jsonMapper;
	
	public BookServiceImpl() {
		this.bookMap = new HashMap<Integer, Book>();
		initBookStore();
	}

	public void initBookStore() {
		LOGGER.info("Initialising Map");
		Book aBook = new Book("James Herbert", "Rats", "Horror", "1988");
		Book anotherBook = new Book("Jim Bert", "Cats", "Comedy", "1899");
		LOGGER.info("Adding initial books");
		bookMap.put(1, aBook);
		bookMap.put(2, anotherBook);
		LOGGER.info("Added initial books successfully");
		id = 2;
	}
	
	public String addBook(String jsonString) {
		id++;
		LOGGER.info("Adding new book");
		Book newBook = jsonMapper.readJSON(jsonString, Book.class);
		bookMap.put(id, newBook);
		LOGGER.info("Added book: " + bookMap.get(id).getTitle());
		return jsonString;
	}

	public String readBooks() {
		LOGGER.info("Reading books into JSON string");
		return jsonMapper.writeJSON(bookMap.values());
	}

	public String updateBook(Integer bookID, String updatedJsonString) {
		LOGGER.info("Updating book: " + bookMap.get(bookID).getTitle());
		Book updatedBook = jsonMapper.readJSON(updatedJsonString, Book.class);
		bookMap.put(bookID, updatedBook);
		LOGGER.info("Updated book: " + bookMap.get(bookID).getTitle());
		return updatedJsonString;
	}

	public String removeBook(Integer bookID) {
		LOGGER.info("About to remove book: " + bookMap.get(bookID).getTitle());
		bookMap.remove(bookID);
		LOGGER.info("Book removed");
		return "{\"Message\": \"Book sucessfully removed\"}";
	}

}