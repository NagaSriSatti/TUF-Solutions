
class Solution {
    public int Calculate(int[] nums, int k,int mid,int m){
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }
            if(count==k){
                ans++;
                count=0;
            }
            if(ans>=m)
            return ans;
            if(nums[i]>mid)
            count=0;
        }
        return ans;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
     int low=Integer.MAX_VALUE;
     int high=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        low=Math.min(nums[i],low);
        high=Math.max(nums[i],high);
     }
     int ans=-1;
     while(low<=high){
        int mid = (low+high)>>1;
        if(Calculate(nums, k, mid, m)>=m){
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


