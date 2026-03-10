import java.util.Arrays;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i-1] + 1) {
                current++;
            }

            else if(nums[i] != nums[i-1]) {
                if(current > longest)
                    longest = current;

                current = 1;
            }
        }

        if(current > longest)
            longest = current;

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}

//to find the length of the longest consecutive sequence in an unsorted array