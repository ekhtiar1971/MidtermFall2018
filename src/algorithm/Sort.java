package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int m = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > m) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = m;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        int t = array.length;
        for (int i = 0; i < t - 1; i++)
            for (int j = 0; j < t - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return list;

    }
    

    /*public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array , m+1, r);
            merge(array, l, m, r);
        }
        return list;
    }*/


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    /*void heap(int array[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;


        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heap(array, n, largest);
        }


        public int[] heapSort ( int[] array){
            int[] list = array;
            //implement here
            int n = array.length;
            for (int i = n / 2 - 1; i >= 0; i--)
                heap(array, n, i);
            for (int i = n - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heap(array, i, 0);
            }


        return list;
    }*/


        public int[] bucketSort ( int[] array) {
            int[] list = array;


                //implement here
            return array;

        }
            public int[] shellSort ( int[] array){
                int[] list = array;
                //implement here
                int n = array.length;
                for (int gap = n / 2; gap > 0; gap /= 2) {
                    for (int i = gap; i < n; i += 1) {
                        int temp = array[i];
                        int j;
                        for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                            array[j] = array[j - gap];
                        array[j] = temp;
                    }
                }

                return list;
            }


            public static void printSortedArray ( int[] array){
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);

                }
            }

        }

