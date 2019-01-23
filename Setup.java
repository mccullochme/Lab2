package mccullochme;

import bridges.connect.Bridges;

import java.util.Random;

import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "mccullochme", "1103199661777");

	    /* Set an assignment title */
	    bridges.setTitle("Max McCulloch");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    Random rndm = new Random();
	    int sqrdNum;
	    int tempNum;
	    for (int i = 0; i < arraySize; i++) {
	    	tempNum = rndm.nextInt(10);
	    	sqrdNum = tempNum * tempNum;
	    	arr.getElement(i).setValue (sqrdNum);
	        arr.getElement(i).setLabel(String.valueOf(sqrdNum));
	    }
	    
	    /* set the value as a Label */
	    
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}