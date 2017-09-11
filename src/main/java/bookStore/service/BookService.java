package bookStore.service;

public interface BookService {
	
	String readBooks();

	String addBook(String jsonString);

	String updateBook(Integer bookId, String updatedBook);

	String removeBook(Integer bookId);

}
