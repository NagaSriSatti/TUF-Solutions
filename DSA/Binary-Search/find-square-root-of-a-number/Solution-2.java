class Solution {
    public long square(int n){
        return (long)n*n;
    }
    public int floorSqrt(int n) {
        if(n<=1)
        return n;
      int low=0;
      int high=n/2;
      int ans=0;
      long number=n;
      while(low<=high){
        int mid =(low+high)>>1;
        if(square(mid)<=number){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return ans;
    }
}