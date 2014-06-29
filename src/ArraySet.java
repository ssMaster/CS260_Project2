
/*
 * An ArraySet object utilizes the Array approach to a set to add the burnt locations of the maze.
 */
public class ArraySet<E> implements Cloneable{
	/*
	 * Invariant of the ArraySet<E> class:
	 * 	1) The number of elements in the bag is in the instance variable manyItems
	 * 	2) For an empty ArraySet, we do not care what is stored in any of data; for a non-empty set, the elements in the set are stored in data[0] through data[manyItems - 1], and we don't care what's in the rest of data.
	 * 	   Duplicates are not allowed.
	 */
	private E[] data;		// to hold the elements in the set
	private int manyItems;	// the number of elements in the set
	
	// getter method
	public E[] getData(){
		return data; 
	}
	
	/**
	 * Default Constructor
	 * @param initialCapacity	The initial capacity of the array
	 */
	public ArraySet(){
		data = (E[]) new Object[10];
		manyItems = 0;
	}
	
	/**
	 * Constructor
	 * @param initialCapacity	The initial capacity of the array
	 */
	public ArraySet(int initialCapacity){
		data = (E[]) new Object[initialCapacity];
		manyItems = 0;
	}
	
	/**
	 * add method adds a new element to the set as long as it does not already exist in the set.
	 * @param element	The new element to add to the set
	 */
	public void add(E element){
		// check to see if the element already exists in the set. If it doesn't then add the element to the set.
		if(isElement(element)){
			return;
		}
		
		if(manyItems == data.length){
			ensureCapacity(manyItems * 2 + 1);
		}
		data[manyItems] = element;
		manyItems++;
	}
	
	/**
	 * remove method will remove the target from the set
	 * @param target The target to remove
	 * @return True if the target was removed, false if the target was not found and therefor not removed
	 */
	public boolean remove(E target){
		int index;	// hold the location of target in the data array
		
		if(target == null){
			index = 0;
			while(index < manyItems && data[manyItems] != null){
				index++;
			}
		}
		else{
			index = 0;
			while(index < manyItems && (!target.equals(data[index]))){
				index++;
			}
		}
		
		if(index == manyItems){
			return false;
		}
		else{
			manyItems--;
			data[index] = data[manyItems];
			data[manyItems] = null;
			return true;
		}
	}
	
	/**
	 * isElement method will determine if a target location already exists in the set 
	 * @param target The target location
	 * @return	True if already in set, otherwise false
	 */
	public boolean isElement(E target){
		// loop through data to see if the target is already in the set
		for(int i = 0; i < manyItems; i++){
			// if the target exists in the set already, return true
			if(data[i].equals(target)){
				return true;
			}
		}
		// target does not exist in the set yet so return false
		return false;
	}
	
	/**
	 * ensureCapacity method creates a new array with the capacity minimumCapacity and fills it with the contents of the data field.
	 * @param minimumCapacity	The capacity of the new array
	 */
	public void ensureCapacity(int minimumCapacity){
		E[] biggerArray;
		
		if(data.length < minimumCapacity){
			biggerArray = (E[]) new Object[minimumCapacity];
			for(int i = 0; i < manyItems; i++){
				biggerArray[i] = data[i];
			}
			data = biggerArray;
		}
		
	}
	
	/**
	 * Return the capacity of the set
	 * @return - Capacity of the set
	 */
	public int getCapacity(){
		return data.length;
	}
	
	/**
	 * Return the size of the set
	 * @return - Number of elements in the set
	 */
	public int size(){
		return manyItems;
	}
	
	/**
	 * Clone method
	 */
	public ArraySet<E> clone(){
		ArraySet<E> answer;
		
		try{
			answer = (ArraySet<E>) super.clone();
			
		}
		catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not support cloneable");
		}
		
		answer.data = data.clone();
		return answer;
	}
}
