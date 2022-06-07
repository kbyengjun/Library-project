package application;


/**
 * 도서 정보를 다루는 클래스
 * 기능 : 도서 추가 / 도서 상태 변경
 * 
 * 사용 방법 :  
 *  BookList  books	= new BookList();	
 *  BookItem[] item = books.getCurrentAll();
 *  
 *  item[index].getState(); -> 도서 상태 반환
 *  item[index].setState(); -> 도서 상태 변경
 */
public class BookItem{

	private int idx;
	private String title;
	private String publisher;
	private String author;
	private String genre;
	private String rental_state;
	private String rental_day;
	private String return_day;
	private String content;
	private String userId; 
	
	public BookItem(int idx, String title, String publisher, String author, String genre, String rental_state,
			String rental_day, String return_day, String content, String userId) {
		this.idx = idx;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.genre = genre;
		this.rental_state = rental_state;
	
		this.rental_day = rental_day;
		this.return_day = return_day;
		this.content = content;
		this.userId  = userId;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRental_day() {
		return rental_day;
	}

	public void setRental_day(String rental_day) {
		this.rental_day = rental_day;
	}

	public String getReturn_day() {
		return return_day;
	}

	public void setReturn_day(String return_day) {
		this.return_day = return_day;
	}

	public String getRental_state() {
		return rental_state;
	}

	public void setRental_state(String rental_state) {
		this.rental_state = rental_state;
	}
	
	public String getuserId() {
		return userId;
	}
	
	public void setuserId(String userId) {
		this.userId = userId;
	}
}