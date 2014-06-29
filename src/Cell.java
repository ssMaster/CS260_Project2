
/*
 * A Cell object knows the passable connections to neighboring cells, but it does not know the coordinates.
 */
public class Cell {
	final int NORTH = 0;
	final int EAST = 1;
	final int SOUTH = 2;
	final int WEST = 3;
	boolean[] neighbors = new boolean[4];	// represent the possible directions to cell neighbors
	
	/**
	 * Constructor
	 */
	public Cell(){
		setNorth(false);
		setEast(false);
		setSouth(false);
		setWest(false);
	}
	
	// ----------------------------------- setters
	
	public void setNorth(boolean value){
		neighbors[NORTH] = value;
	}
	
	public void setEast(boolean value){
		neighbors[EAST] = value;
	}
	
	public void setSouth(boolean value){
		neighbors[SOUTH] = value;
	}
	
	public void setWest(boolean value){
		neighbors[WEST] = value;
	}
	
	public void setNeighbors(int dir){
		neighbors[dir] = false;
	}
	
	// --------------------------------- getters
	
	public boolean getNorth(){
		return neighbors[NORTH];
	}
	
	public boolean getEast(){
		return neighbors[EAST];
	}
	
	public boolean getSouth(){
		return neighbors[SOUTH];
	}
	
	public boolean getWest(){
		return neighbors[WEST];
	}
	
	public boolean[] getNeighbors(){
		return neighbors;
	}
	
	public String toString(){
		return "North: " + getNorth() + " East: " + getEast() + " South: " + getSouth() + " West: " + getWest();
	}

}
