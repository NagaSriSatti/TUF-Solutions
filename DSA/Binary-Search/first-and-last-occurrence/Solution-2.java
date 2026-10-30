class Solution {
    public int lowerBound(int[] nums, int x) {
       int low=0;
       int high=nums.length-1;
       int ans=-1;
       while(low<=high){
        int mid = (low+high)>>1;
        if(nums[mid]==x){
            ans=mid;
            high=mid-1;
        }
        else if(nums[mid]>x){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
     }
     public int upperBound(int[] nums,int x){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
    int low=lowerBound(nums,target);
    int upper=upperBound(nums,target);
    int[] ans= new int[2];
    ans[0]=low;
    if(low==-1)
    ans[1]=-1;
    else
    ans[1]=upper;
    return ans;
    }
}