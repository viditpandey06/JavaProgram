public class binarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12};
        int target = 3;
        int index = binarySearchfunc(nums, target, 0, nums.length);
        System.out.println(index);
    }
    public static int binarySearchfunc(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int mid = (s+e)/2;
            if (nums[mid] == target) {
                 System.out.println(nums[mid]);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchfunc(nums, target, mid+1, e);
            } else {
                return binarySearchfunc(nums, target, s, mid-1);
            }
        }
    }
}