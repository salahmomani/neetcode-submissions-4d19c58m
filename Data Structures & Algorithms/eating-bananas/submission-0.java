class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        int result=0;
        while(left<=right){
          int mid = left + (right - left) / 2;
                int sum = 0;
       for(int pile:piles){
           sum+=Math.ceil((double)pile/mid);
        }
        if(sum<=h){
        result=mid;
        right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return result;
}
}
