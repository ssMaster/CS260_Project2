import java.util.Stack;

/*
 * A Maze creates a Maze object with a method to determine the solution path of the maze should one exits.
 */
public class Maze {
	private LinkedStack<Location> stack;	// hold the locations in the stack
	private ArraySet<Location> set;			// hold the burnt locations
	private Cell[][] cells;					// hold the cells
	private boolean pathFound;				// determine if a path is found
	
	private Location finishLocation;		// for the exit point of the maze
	
	/**
	 * Constructor
	 * @param rows - The number of rows in the maze
	 * @param columns - The number of columns in the maze
	 */
	public Maze(int rows, int columns){
		cells = new Cell[rows][columns];
		set = new ArraySet();
	}
	
	/**
	 * Convenience method to set if a path is found
	 * @param found - True if a path is found, otherwise false
	 */
	public void setPathFound(boolean found){
		pathFound = found;
	}
	
	/**
	 * convenience method to determine if a path was found
	 * @return - True if a path was found, otherwise false
	 */
	public boolean getPathFound(){
		return pathFound;
	}
	
	/**
	 * Return the size of the maze
	 * @return - The size of the maze
	 */
	public int size(){
		return cells.length;
	}
	
	/**
	 * locate the current cell
	 * @return
	 */
	public Cell[][] locate(){
		Cell[][] cell = new Cell[size()][size()];
		
		for(int i = 0; i < size(); i++){
			for(int j = 0; j < size(); j++){
				cell[i][j] = cells[i][j];
			}
		}
		return cell;
	}
	
	/**
	 * Get the cells
	 * @return - The cells array
	 */
	public Cell[][] getCells(){
		return cells;
	}
	
	/**
	 * Set the finish location
	 * @param finish - The finish location
	 */
	public void setFinish(Location finish){
		finishLocation = finish;
	}
	
	/**
	 * Get the finish location
	 * @return - The finish location
	 */
	public Location getFinishLocation(){
		return finishLocation;
	}
	
	/**
	 * run the search algorithm
	 */
	public void findPath(){
		Cell[][] currentCell = locate();	
		
		// declare the locations stack
		stack = new LinkedStack<Location>();
		
		ArraySet mark = new ArraySet<Location>();
		
		// insert the starting location
		stack.push(new Location(0, 0));
		
		Location current, next;
		
		// loop while there are still more paths to traverse
		while(!stack.isEmpty()){
			//current = stack.pop();
			current = stack.peek();
			//System.out.println(current);
			
			if(current.equals(getFinishLocation())){
				System.out.println("\nThe maze is solved!");
				pathFound = true;
				break;
			}
			
			// mark the current position
			mark.add(current);
			
			
			pathFound = false;
			// put the neighbors in the stack
			// ------------------------------------ North
			next = current.getNextLocation(0);
			
			
			if(isNeighborOK(0, current) && !mark.isElement(next) && !set.isElement(next)){
				stack.push(next);
				current = next;
				pathFound = true;
			}
			// ------------------------------------ East
			next = current.getNextLocation(1);
			if(isNeighborOK(1, current) && !mark.isElement(next) && !set.isElement(next)){
				stack.push(next);
				current = next;
				pathFound = true;
			}
			// ------------------------------------ South
			next = current.getNextLocation(2);
			if(isNeighborOK(2, current) && !mark.isElement(next) && !set.isElement(next)){
				stack.push(next);
				current = next;
				pathFound = true;
			}
			// ------------------------------------ West
			next = current.getNextLocation(3);
			if(isNeighborOK(3, current) && !mark.isElement(next) && !set.isElement(next)){
				stack.push(next);
				current = next;
				pathFound = true;
			}
	
			if(!pathFound){
				set.add(stack.pop());
			}
		}
		
		if(stack.isEmpty()){
			pathFound = false;
		}
	}
	
	/**
	 * Check if the current cell has a passable neighbor
	 * @param dir - The direction of entry
	 * @param currentLocation - The current cell location
	 * @return - True if the cell has a neighbor, otherwise false
	 */
	private boolean isNeighborOK(int dir, Location currentLocation){
		Cell currentCell = cells[currentLocation.getRow()][currentLocation.getColumn()];
		if(currentCell.getNeighbors()[dir] && ((currentLocation.getFrom()+2)%4 != dir)){
			return true;
		}
		else{
			return false;
		}
	}	
	
	/**
	 * Display the path locations by emptying the stack
	 */
	public void displayPathLocations(){
		if(pathFound){
			int count = 0;
			System.out.println("Locations traversing the maze:");
			while(!stack.isEmpty()){
				count++;
				System.out.println("Step " + count + ":  \t" + stack.pop());
			}
		}
		else{
			System.out.println("This maze has no solution.");
		}
	}
}
