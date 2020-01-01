// iterative Binary Search

public int binarySearchIterative(int[] array, int key, int low, int high) {
    int idx = Integer.MAX_VALUE;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (array[mid] < key)low = mid + 1;
        else if (array[mid] > key)high = mid - 1;
        else if (array[mid] == key)return mid;
    }
    return idx;
}
// BinarySearch Using Recursion

public int binarySearchRecursive(int[] array, int key, int low, int high) {
    int mid = (low + high) / 2;
    if (high < low)return -1;
    if (key == array[mid])return mid;
    if (key < array[mid])return runBinarySearchRecursively(array, key, low, mid - 1);
    else return runBinarySearchRecursively(array, key, mid + 1, high);
}

// Using Builtin method
int idx = Arrays.binarySearch(array, key);

int idx = Collections.binarySearch(array, key);