package benjamin.modelos;

import java.util.Date;

public class BOOKS extends Publication {
	
	private int id;
	private String[] isbn;
	private boolean read;
	private int timeRead;
	
	
	// TODO Auto-generated constructor stub
	public BOOKS(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		this.read = read;
		this.timeRead = timeRead;
		

	}




	public int getId() {
		return id;
	}

	
	

}
