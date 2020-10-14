public class pivotIndex {
    // iterate through the array
    // add numbers up to but excluding current index
    // add numbers after current index
    // compare results
    // if both sides equal return index
    // otherwise continue loop
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int sum = 0;
        int leftsum = 0;

        // s = sum of all numbers, we are on index i
        // if we know the sum of nums left of index i, sum of nums
        // sum of right of index i = TotalSum - nums[i] - leftsum

        // we get the total sum of the array
        for (int numbers : nums)
            sum += numbers;
        // find the pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) {
                System.out.println("This is the pivot index " + i);
            }
            leftsum += nums[i];
        }
        System.out.println(-1);
        ;
    }
}
