/*
Bulb Switcher
Input: n = 3
Output: 1
Explanation: At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off]. 
So you should return 1 because there is only one bulb is on.
Pattern - after nth round - square numbers are always on.
*/
class LeetCode319{
    public int bulbSwitch(int n){
        if(n==0) return 0;
        int count=1;
        int i=2;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;//return (int)Math.sqrt(n);
    }
}
