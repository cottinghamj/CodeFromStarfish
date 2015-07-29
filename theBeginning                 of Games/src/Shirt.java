
public class Shirt extends Item{
	private int goodness;
	
	public Shirt(){
		super("Shirt", 20, -1);
		goodness = 10;
	}
	
	public void messWith(){
		goodness = 20;
	}
	
}
