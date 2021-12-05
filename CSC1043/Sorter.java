/*Code imported from Professor Carter's slides and modified from looking at ints to
strings to work with sorting the DNA sequences. Modifications made by Sara Peak.*/

public class Sorter
{
  /**  Performs a Selection Sort on
  *      an integer array */
  public static void selectionSort( String [ ] array )
  {
    String temp; // temporary location for swap
    int max;  // index of maximum value in subarray

    for ( int i = 0; i < array.length - 1; i++ )
    {
      // find index of largest value in subarray
      max = indexOfLargestElement( array, array.length - i );

      // swap array[max] and array[array.length - i - 1]
      temp = array[max];
      array[max] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }

  /**  Finds index of largest element
  *    return  the index of the largest element in the subarray */
  private static int indexOfLargestElement( String [ ] array, int size )
  {
    int index = 0;
    for( int i = 1; i < size; i++ )
    {
      if ( array[i].compareTo(array[index])>0)
          index = i;
    }
    return index;
  }
}
