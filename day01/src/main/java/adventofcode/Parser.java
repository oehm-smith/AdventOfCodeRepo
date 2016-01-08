package adventofcode;

/**
 * For http://adventofcode.com/day/1/input.
 * 
 * '(' "climbs" a floor and ')' descends one.  Given a string of markers return which 'floor' we are on with the initial one being zero (0)
 * 
 * @author u86990
 *
 */
public class Parser {

    // Not using this but @Tests now
    public static void main(String[] args) {
        String markers = args[0];
        Parser p = new Parser();
        
        int run1 = p.findFinalFloor("");
        
        int run=run1;
        System.out.println("Given input: "+markers);
        System.out.println("  the resultant floor is: "+run);
    }

    public int findFinalFloor(String input) {
	    int floor = 0;
	    
	    for (int i=0 ; i < input.length(); i++) {
	        if (input.charAt(i) == '(') {
	            floor++;
	        } else if (input.charAt(i) == ')') {
                floor--;
            } 
	    }
		return floor;
	}
	

    /**
     * @param input
     * @param floorFirstReached - return index for this
     * @return the index of the character in the input (1th-indexed) where that floor is first reached
     */
    public int findIndexWhenHitFloor(String input, int floorFirstReached) {
              int floor = 0;
        
        for (int i=0 ; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                floor++;
            } else if (input.charAt(i) == ')') {
                floor--;
            }
            if (floor == floorFirstReached) {
                return i+1;
            }
        }
        return floor;
    }

}
