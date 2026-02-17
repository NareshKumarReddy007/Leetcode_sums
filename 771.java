/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. 
You want to know how many of the stones you have are also jewels.
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
*/
class LeetCode771{
    public int numJewelsInStones(String jewels, String stones){
        Set<Character>set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);//add jewels
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)) count++;
        }
        return count++;
    }
}
