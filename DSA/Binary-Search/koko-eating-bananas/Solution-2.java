class Solution {
    public int helper(int[] nums, int mid,int h){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int val=(int)Math.ceil((double)nums[i]/mid);
            ans+=val;
            if(ans>h)
            break;
        }
        return ans;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int low=1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
            high=Math.max(high,nums[i]);
        }
        int ans=high;
        while(low<=high){
            int mid = (low+high)>>1;
            if(helper(nums,mid,h)<=h){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}