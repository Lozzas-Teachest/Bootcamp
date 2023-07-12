/* Sort is a class for sorting integer numbers */

public class Sort
{
    // Provide a sort() class method that implements a simple 'bubble sort'
    // algorithm to sort an array of integers into ascending order
    // Use temp.txt
    public static void bSort(int[] nums)
    {
        //
        // Todo:
        //
        // Insert your code here

        // assuming method parameter was (int[] nums);

        //bubble sort
        for (int i = 0; i < nums.length - 1; ++i)
        {
            for (int j = i + 1; j < nums.length; ++j)
            {
                if (nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }









    }


}




