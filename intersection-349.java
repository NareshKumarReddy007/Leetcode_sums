class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int x:nums1)
        {
            set.add(x);
        }
        for(int x1:nums2)
        {
            if(set.contains(x1))
            {
                result.add(x1);
            }
        }
        int []ans=new int[result.size()];
        int i=0;
        for(int num:result)
        {
            ans[i++]=num;
        }
        return ans;
    }
}
