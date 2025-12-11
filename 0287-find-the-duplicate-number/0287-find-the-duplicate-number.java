class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int x:nums)
        {
            if(map.contains(x)){
                return x;
            }
            else
            {
                map.add(x);
            }
        }
        return -1;
    }
}