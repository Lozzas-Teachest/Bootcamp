/* Person is a class to represent a simple person */


public class Person
{
    //
    // ToDo
    //
    // Declare instance variables for person's name and age
    // Note: call these name and age, respectively, to match those
    //       used in accessor methods getName() and getAge().
    //
    private int age;
    private String name;




    //
    // ToDo
    //
    // Define a constructor to initialise person's name and age
    //
    public Person(String n, int a)
    {
        //
        // Todo:
        //
        // Insert your code here
        age = a;
        name = n;
    }





    // Method to get person's name
    //
    public String getName()
    {
        return name;
    }

    // Method to get person's age
    //
    public int getAge()
    {
        return age;
    }


    //
    // ToDo
    //
    // Provide a compareTo() method similar to String.compareTo()
    //






    //
    // ToDo
    //
    // Provide a class method to sort persons in array by age
    // (use a simple bubble sort algorithm)
    //
    public static void bSortByAge(Person[] pers)
    {
        //
        // Todo:
        //
        // Insert your code here

        //bubble sort
        //bubble sort
        for (int i = 0; i < pers.length - 1; ++i)
        {
            for (int j = i + 1; j < pers.length; ++j)
            {
                if (pers[i].getAge() > pers[j].getAge())
                {
                    Person temp = pers[i];
                    pers[i] = pers[j];
                    pers[j] = temp;
                }
            }
        }
//        for (int i = 0; i < pers.length - 1; ++i)
//        {
//            int aPers = pers[i].getAge()
//            for (int j = i + 1; j < pers.length; ++j)
//            {
//                if (aPers[i] > aPers[j])
//                {
//                    int temp = aPers[i];
//                    aPers[i] = aPers[j];
//                    aPers[j] = temp;
//                }
//            }
//        }







    }


    //
    // ToDo
    //
    // Provide a class method to sort persons in array by name
    // (use simple bubble sort algorithm)
    //
    public static void bSortByName(Person[] pers)
    {
        //
        // Todo:
        //
        // Insert your code here








    }


}
