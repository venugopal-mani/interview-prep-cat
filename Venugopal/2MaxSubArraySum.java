class Solution {


    public int max(int a, int b)
    {
	return (a > b) ? a : b;
    }
    public int maxSubArray(int[] nums) {

	if(nums.length == 1)
	    {
		return nums[0];
	    }

	int cuSum = nums[0];
	int maxSum = nums[0];

	for (int i = 1; i < nums.length; i++)
	    {

		cuSum = max(nums[i], cuSum + nums[i]);




		if(maxSum < cuSum)
		    {
			maxSum = cuSum;
		    }

	    }



	return maxSum;
    }

}
