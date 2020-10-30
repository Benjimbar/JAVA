package benjamin.modelos;

public class Series extends Film{


	private int id;
	private int sessionQuantity;
	private CHAPTER[] chapter;
	
	// TODO Auto-generated constructor stub
	public Series(String title, String genre, String creator, int duration) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;

	}
	

	public int getId() {
		return id;
	}
	
	
}
