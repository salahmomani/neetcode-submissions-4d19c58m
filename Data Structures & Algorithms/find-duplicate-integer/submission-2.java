class Solution {
    public int findDuplicate(int[] nums) {
                HashMap<Integer,Integer> map=new HashMap<>();
                int valueTemp=1;
                for(int number:nums){
                    if(!map.containsKey(number)){
                        map.put(number,valueTemp);
                    }else{
                        return number;
                    }
                    valueTemp++;
                }
        return valueTemp;
    }
}
