package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * 회원 대여 정보 테이블 
 */
public class rentalTable { 

	private SimpleStringProperty title;
	private SimpleStringProperty publisher;
	private SimpleStringProperty author;
	private SimpleStringProperty genre;
	private SimpleStringProperty rental_day;
	private SimpleStringProperty return_day;	
	private SimpleStringProperty rental_state;
	
	public rentalTable(String title, String publisher, String author,
			String genre, String rental_day, String return_day, String rental_state) {
		
		this.title = new SimpleStringProperty(title);
		this.publisher = new SimpleStringProperty(publisher);
		this.author = new SimpleStringProperty(author);
		this.genre = new SimpleStringProperty(genre);
		this.rental_day = new SimpleStringProperty(rental_day);
		this.return_day = new SimpleStringProperty(return_day);
		this.rental_state = new SimpleStringProperty(rental_state);
		
	}


	public String getTitle() {
		return title.get();
	}

	public void setTitle(String title) {
		this.title.set(title);
	}

	public String getPublisher() {
		return publisher.get();
	}

	public void setPublisher(String publisher) {
		this.publisher.set(publisher);
	}

	public String getAuthor() {
		return author.get();
	}

	public void setAuthor(String author) {
		this.author.set(author);
	}

	public String getGenre() {
		return genre.get();
	}

	public void setGenre(String genre) {
		this.genre.set(genre);
	}

	public void setRental_state(String rental_state) {
		this.rental_state.set(rental_state);
	}	
	

	
}
