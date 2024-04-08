package getterAndSetter;

public class Car {

	private int cost;
	private String color;
	private String model;
	
	//Setter methods
	
	public void setCost(int cost) {
		
		this.cost = cost;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	//Getter methods
	
	public int getCost() {
		
		return this.cost;
		
	}
	
	public String getColor() {
		
		return this.color;
		
	}

	public String getModel() {
		
		return this.model;
		
	}
	
	
}
