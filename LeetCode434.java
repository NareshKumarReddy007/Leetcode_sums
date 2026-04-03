//Segments in a String
class LeetCode434{
    public int countSegments(String s){
        if(s.length()==0) return 0;
        if(s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }
}
