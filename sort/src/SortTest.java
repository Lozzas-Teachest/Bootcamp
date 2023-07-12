/* SortTest is a Java application for testing the Sort class */


public class SortTest
{
    private static String[] testNames = {"Trulli", "Baumgartner", "Montoya",
            "Sato", "Coulthard", "Barrichello",
            "Schumacher", "Button", "Alonso",
            "Fisichella", "Bruni", "Webber" };
    private static int[] testAges = {40, 26, 29, 27, 32, 31, 32, 37, 28, 30, 32, 32};
    //
    // The main() method is the entry point of this class
    //
    public static void main(String[] args)
    {
        //
        // Todo:
        //
        // Declare and create an array of ten integers
        //

        int[] numbers = new int[10];





        //
        // Todo:
        //
        // Initialise the array with random values
        // (use random() class method of Math class)
        //
        for(int i = 0; i < numbers.length ; i++) {
            int number = (int) (Math.random() * 100);
            numbers[i] = number;
        }




        //
        // Todo:
        // Change this 'for' loop to print
        // out contents of original array
        //
        System.out.println("\nOriginal array is:\n");

		for(int i = 0; i < numbers.length; i++)
		{
		System.out.print( numbers[i] + "\t");
		}




        //
        // Todo:
        //
        // Write one line of code to call the
        // class method of the Sort class
        // to sort the array into ascending order
        //

        Sort.bSort(numbers);






        //
        // Todo:
        // Change this 'for' loop to print
        // out contents of sorted array
        //
        System.out.println("\nSorted array is:\n");

		for(int i = 0; i < numbers.length; i++)
		{
		System.out.print(numbers[i] + "\t");
		}

        //
        // ToDo
        //
        // Declare a variable capable of referencing an array of persons
        //
        Person[] persons;



        //
        // ToDo
        //
        // Create an array capable of referencing as many persons as there are
        // names defined in the 'testNames' array
        //
        persons = new Person[12];



        //
        // ToDo
        //
        // Fill the array with references to Person objects
        // (Use test values provided in class variables above)
        //

        for (int i = 0; i< persons.length ; i++) {
            persons[i] = new Person(testNames[i], testAges[i]);
        }



        //
        // ToDo
        //
        // Print out initial contents of array
        //
        System.out.println("\nThe original list of people is:\n");

		for(int i = 0; i < persons.length; i++)
		{
			System.out.println(persons[i].getName() + " " + persons[i].getAge());

		}



        //
        // ToDo
        //
        // Sort array so that names are either in age
        // or alphabetical order
        //
        Person.bSortByAge(persons);




        //
        // ToDo
        //
        // Print sorted contents of array
        //
        System.out.println("\nThe sorted list of people is:\n");

		for(int i = 0; i < persons.length; i++)
		{
			System.out.println(persons[i].getAge() + " " + persons[i].getName());

		}






    }
}