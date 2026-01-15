public class lab5_3 
{
    public static int search(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            // Check if the target is found
            if (nums[mid] == target) 
            {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) 
            { // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) 
                {
                    right = mid - 1; // Target is in the left half
                } 
                else 
                {
                    left = mid + 1; // Target is in the right half
                }
            } 
            else 
            { // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) 
                {
                    left = mid + 1; // Target is in the right half
                } 
                else 
                {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
