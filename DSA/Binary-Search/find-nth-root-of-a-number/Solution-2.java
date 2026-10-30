class Solution {
    public long power(int N,int M,int number){
        long ans=1;
        for(int i=1;i<=N;i++){
            ans=1L*ans*M;
            if(ans>number)
            break;
        }
        return ans;
    }
    public int NthRoot(int N, int M) {
        if(M<=1)
        return M;
        if(N==1)
        return M;
        int low=0;
        int high=M;
        int number=M;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)>>1;
            long val=power(N,mid,number);
            if(val==number){
                return mid;
            }
            else if(val<number){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
