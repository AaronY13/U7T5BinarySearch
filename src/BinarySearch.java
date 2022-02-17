public class BinarySearch
{
  public static int binarySearch(int[] elements, int target)
  {
    // start "left" boundary at first index and "right" boundary at last index
    int left = 0;
    int right = elements.length - 1;
    

    while (left <= right)
    {

       int middle = (left + right) / 2;
       

       if (target < elements[middle])
       {
          right = middle - 1;
       }

       else if (target > elements[middle])
       {
          left = middle + 1;
       }

       else
       {
          return middle;
       }
     }

     return -1;
  }

  public static int binarySearchPrintedCommentary(int[] elements, int target)
  {
    int left = 0;
    int right = elements.length - 1;
    
    // extra tracker for printing commentary
    int numChecks = 0;
    
    while (left <= right)
    {
       numChecks++;
       
       int middle = (left + right) / 2;
       System.out.println("Checking value at index " + middle + " (value = " + elements[middle] + ")");
       
       if (target < elements[middle])
       {
          right = middle - 1;
          System.out.println("-- " + elements[middle] + " is too HIGH! Setting right index to: " + right + " (value = " + elements[right] + ")");
       }
       else if (target > elements[middle])
       {
          left = middle + 1;
          System.out.println("-- " + elements[middle] + " is too LOW! Setting left index to: " + left + " (value = " + elements[left] + ")");
       }
       else
       {
          System.out.println("The target " + target + " was FOUND at index " + middle + "!  Returning " + middle);
          System.out.println("A total of " + numChecks + " elements were checked for a runtime of " + numChecks + " loop iterations"); 
          return middle;
       }
     }
     
     // if value not found, return -1
     System.out.println("The target " + target + " was NOT found; returning -1");
     System.out.println("A total of " + numChecks + " elements were checked for a runtime of " + numChecks + " loop iterations"); 
     return -1;
  }
}