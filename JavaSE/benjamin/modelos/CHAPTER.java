package benjamin.modelos;

public class CHAPTER {
	
	private int id;
	private String title;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;
	public CHAPTER(String title, int duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
	}
	public int getId() {
		return id;
	}

	
}
