/*
 * Name: Charles David Read 
 * Student number: c1646151
 */

/*
 * A class to represent a number of instances of a zoo animal.
 */
public class Animal {

	private String name;
    private int num;
    private int loan;

	/*
	 * Constructor method for creating an animal with a given name
	 * and number of  animal instances.
	 * This constructor checks that the total number of instances argument is 
	 * valid; i.e., the number of animals should be 1 or more. 
	 * If not valid, the constructor will throw an IllegalArgumentException with
	 * an appropriate error message.
	 */
	public Animal( String inName, int inTotalNumAnimals ) {
		this.name = inName;
        this.num = inTotalNumAnimals;

		if ( num < 1 ) {
				throw new IllegalArgumentException("Error: Invalid number of instances.");
			}
    }

	/*
	 * An accessor method that returns the animals name.
	 */
	public String getName() {
		return name;

	}

	/*
	 * An accessor method that returns the total number of instances of this animal.
	 * This should count both animal on loan to other collections and returned animals from other collections.
	 */ 
	public int getTotalAnimals() {
		int total = num + loan;
		return total;
	}


	/*
	 * Returns the number of instances of the animal that are available
	 * (i.e., not on loan to another collection).
	 */
	public int getAvailableAnimals() {
		return num;
	}

	/*
	 * Mark one of the instances of this animal as on loan to another collection.
	 * If there are no available instances to loan to another collection, then this method should 
	 * throw an IllegalStateException with an appropriate error message.
	 */
	public void loanAnimal() {

		if ( num == 0 ) {
				throw new IllegalStateException("Error: No more Animals to Loan.");
			}
		num--;
		loan++;

		
	}

	/*
	 * Mark one of the instances of this animal as returned from another collection.
	 * If none of the instances of this animal are on loan to other collections, this method
	 * should throw an IllegalStateException with an appropriate error message.
	 */
	public void returnAnimal() {
		if ( loan == 0 ) {
				throw new IllegalStateException("Error: No Animals loaned.");
			}
		num++;
		loan--;

	}
}
