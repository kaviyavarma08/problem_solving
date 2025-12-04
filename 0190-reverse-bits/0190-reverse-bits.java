class Solution {
    public int getBit(int n,int position) {
        return (n & (1<<position));
    }
    public int reverseBits(int n)
    {
        long num=0;
        for(int i=0;i<32;i++)
        {
            int bit=getBit(n,i);
            if(bit!=0)
            {
                num+=1<<(31-i);
            }
            
        }
        return (int)num;
    }
}