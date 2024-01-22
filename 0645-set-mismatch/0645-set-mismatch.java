class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int error[] = new int[2];
        Arrays.fill(error,  -1);
        
        int i = 0, f = 1;
        while(i < n) {
            if(nums[i] == f) f++;
            else error[1] = f;
            if (error[0] == -1 && nums[i] == nums[i+1]) 
              error[0]  = nums[i++];
            i++;
            if (error[0]!=-1 && error[1] != -1)  break;
        }
        if(error[1]==-1) error[1] =   f;
        return error;
    }
}