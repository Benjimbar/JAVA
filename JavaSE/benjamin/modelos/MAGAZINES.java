package benjamin.modelos;

import java.util.Date;

public class MAGAZINES extends Publication {
	
	//variables
	private int id;
	
	//Constructor
	
	public MAGAZINES(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	
	
	
	
}
