class Solution {
    public int CalculateDays(int[] weights, int days,int max_cap){
        int val=0;
        int d=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+val>max_cap){
                d+=Math.ceil((double)val/max_cap);
                val=weights[i];
            }
            else{
                val+=weights[i];
            }
        }
        int ans =(int)Math.ceil((double)weights[weights.length-1]/max_cap);
        d+=ans-1;
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        // Your code goes here
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(weights[i],low);
            high+=weights[i];
        }
        int ans=high;
        while(low<=high){
            int mid = (low+high)>>1;
            if(CalculateDays(weights, days, mid)<=days){
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