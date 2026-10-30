class Solution {
    public int helper(int[] nums, int divisor,int limit){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            double val=Math.ceil((double)nums[i] / divisor);
            ans+=(int)val;
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int limit) {
        Arrays.sort(nums);
       int low=1;
       int high=nums[nums.length-1];
       int ans=0;
       while(low<=high){
        int mid = (low+high)>>1;
        if(helper(nums,mid,limit)<=limit){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}