package benjamin.modelos;

public class MOVIES extends Film {

	//Initializing local variables 
	private int timeViewed;
	private int id;
	
	// TODO Auto-generated constructor stub
	public MOVIES(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
		this.timeViewed = timeViewed;

	

	
	}
	
	public void showData () {
		//System.out.println("Title	" + title);
		//System.out.println("Genre	" + genre);
		//System.out.println("Year	" + year);
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	
	
}
