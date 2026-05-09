class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }

        Map<Character, Integer> smap= new HashMap<>();
        Map<Character, Integer> tmap= new HashMap<>();
        for(int i=0;i<m;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);

        }
        return smap.equals(tmap);



    }
}
