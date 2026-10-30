class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int low=0;
      int high=arr.size()-1;
      int ans=Integer.MAX_VALUE;
      while(low<=high){
        int mid =(low+high)>>1;
        if(arr.get(mid)<=arr.get(high)){
            ans=Math.min(ans,arr.get(mid));
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return ans;
    }
}
