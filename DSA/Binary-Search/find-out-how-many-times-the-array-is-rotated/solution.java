class Solution {
    public int findKRotation(ArrayList<Integer> arr) {
    int low=0;
      int high=arr.size()-1;
      int ans=Integer.MAX_VALUE;
      int rotated=0;
      while(low<=high){
        int mid =(low+high)>>1;
        if(arr.get(mid)<=arr.get(high)){
            ans=Math.min(ans,arr.get(mid));
            high=mid-1;
            if(ans==arr.get(mid))
            rotated=mid;
        }
        else{
            low=mid+1;
        }
      }
      return rotated;
    }
}