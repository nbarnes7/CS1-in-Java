 public static void bubbleSort(int array[], int arraySize) {
      int maxElement, index, temp;
      for (maxElement = arraySize - 1; maxElement >= 0; maxElement--) {
         for (index = 0; index <= maxElement - 1; index++) {
            if (array[index] > array[index + 1]) {
               temp = array[index];
               array[index] = array[index + 1];
               array[index + 1] = temp;
            }
         }
      }
   }
