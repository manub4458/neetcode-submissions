class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
           for(int j = i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
              
              i++;
            }
            else{
               j++;
               
            }
           }
          
        }
         return true ;
}
}