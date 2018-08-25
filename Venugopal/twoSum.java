class Solution {
    public int[] twoSum(int[] nums, int target) {


	int [] ans = new int[2];
	ans[0] = 0;
	ans[1] = 0;

	LinkedHashMap<Integer,Integer> posOfDiff = new LinkedHashMap<Integer,Integer>();

	for(int i = 0; i < nums.length; i++)
	    {

		if(posOfDiff.get(nums[i]) != null)
		    {
			ans[0] = posOfDiff.get(nums[i]);
			ans[1] = i;

		    }


		int currDiff = target - nums[i] ;

		posOfDiff.put(currDiff,i);








	    }


	return ans;



    }
}
