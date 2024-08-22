/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

/*
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = peakIndexInMountainArray(mountainArr, n);
        int firstTry = binarySearch(mountainArr, 0, peak, target);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(mountainArr, peak + 1, n - 1, target);
    }


    private int peakIndexInMountainArray(MountainArray arr, int n) {
        int start = 0;
        int end = n - 1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr.get(mid) > arr.get(mid+1)){      //asc part of array
                end = mid ;
            } else  {
                start = mid + 1;
            }
        }
        return start;

    }

    static int binarySearch(MountainArray arr, int start, int end, int x){
        boolean isAsc = arr.get(start) < arr.get(end);
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr.get(middle) == x)
                return middle;
            if (isAsc == true) {
                if (arr.get(middle) < x)
                    start = middle + 1;
                else
                    end = middle - 1;
            }
            else {
                if (arr.get(middle) > x)
                    start = middle + 1;
                else
                    end = middle - 1;
            }
        }
        return -1;
    }
}

*/
