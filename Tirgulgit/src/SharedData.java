import java.util.ArrayList;


/**
 * @author USER
 * sharing the data between the master to the rest of the group
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 * entering the array and his size 
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return
	 * return array of booleans 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 * setting the boolean array 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return
	 * return the final array list
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return
	 * getting the size of the array
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return
	 * return status flag : T\F
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * setting the status flag 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
