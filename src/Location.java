
/*
 * A Location denotes a grid location.
 */
public class Location {
	private int row;		// store the row coordinate of the grid
	private int column;		// store the column coordinate of the grid
	private int from;	// store the direction of the previous location
	
	/**
	 * Default Constructor
	 * Initialize the row and column of the Location object
	 */
	public Location(){
		row = 0;
		column = 0;
		from = 0;
	}
	
	/**
	 * Constructor
	 * Initializes the row and column of the new Location
	 * @param row - The new row
	 * @param column - The new column
	 */
	public Location(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	/**
	 * Constructor
	 * Initialize the row and column of the new Location
	 */
	public Location(int row, int column, int from){
		this.row = row;
		this.column = column;
		this.from = from;
	}
	
	// -------------------------------------------- setters
	public void setRow(int row){
		this.row = row;
	}
	
	public void setColumn(int column){
		this.column = column;
	}
	
	public void setFrom(int directionFrom){
		this.from = directionFrom;
	}
	
	// -------------------------------------------- getters
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public int getFrom(){
		return from;
	}
	
	/**
	 * getNextLocation method will get the coordinates of the next location 
	 * @param direction - The direction to go for the next location
	 * @return - A new Location object
	 */
	public Location getNextLocation(int direction){
		if(direction == 0){	// go to the NORTH
			return new Location(row - 1, column, 0);
		}
		else if(direction == 1){	// go to the EAST
			return new Location(row, column + 1, 1);
		}
		else if( direction == 2){	// go to the SOUTH
			return new Location(row + 1, column, 2);
		}
		else if(direction == 3){	// go to the WEST
			return new Location(row, column - 1, 3);
		}
		else{
			throw new IllegalArgumentException("An error occurred. The direction given was not within the range of 0 - 3.");
		}
	}
	
	/**
	 * Compare a Location
	 */
	public boolean equals(Object obj){
		Location loc;
		
		if(obj instanceof Location){
			loc = (Location) obj;
			return (loc.row == row) && (loc.column == column);
		}
		else{
			return false;
		}
	}
	
	/**
	 * toString method to create a string for the field values
	 */
	public String toString(){
		return "x = " + row + "\ty =  " + column + "\tComing from direction: " + from;
	}
}
