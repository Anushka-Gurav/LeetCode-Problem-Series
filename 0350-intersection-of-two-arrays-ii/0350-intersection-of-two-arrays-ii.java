class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> st=new ArrayList<Integer>();
        for(int val:nums1)
        {
            st.add(val);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int val:nums2)
        {
            if(st.contains(val))
            {
                list.add(val);
                st.remove(Integer.valueOf(val));
            }
        }
        int[] arr=new int[list.size()];
       int i=0;
       for(Integer ele:list)
       {
        arr[i]=ele;
        i++;
       }
       return arr;
    }
}