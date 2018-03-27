 public static int binarySearch(int array[], int value, int arraySize) {
      int position = -1;
      int first = 0;
      int last = arraySize - 1;
      boolean found = false;
      int middle;
   
      while ((!found) && (first <= last)) {
         middle = (first + last) / 2;
      
         if (array[middle] == value) {
            found = true;
            position = middle;
         }
         else if (array[middle] > value) {
            last = middle - 1;
         }
         else {
            first = middle + 1;
         }
      }
      return position;
   }
