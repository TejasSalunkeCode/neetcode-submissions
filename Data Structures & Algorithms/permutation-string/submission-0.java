class Solution {
    public boolean checkInclusion(String s1, String s2) {
          if(s1.length()>s2.length()){
            return false;
        }
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        //Intialize frequency maps for s1 and the first window of s2

        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i)-'a']++;
            s2Map[s2.charAt(i)-'a']++;
        }

        //slide the window through s2 and compare the maps
        for (int i = 0; i < s2.length()-s1.length(); i++) {
            if(matches(s1Map,s2Map)){
                return true;
            }
            s2Map[s2.charAt(i+s1.length())-'a']++;
            s2Map[s2.charAt(i)-'a']--;
        }
        //check last window
        return matches(s1Map,s2Map);
    }

    private static boolean matches(int[]s1map,int[]s2map){
        for (int i = 0; i < 26; i++) {
            if(s1map[i]!=s2map[i]){
                return false;
            }
        }
        return true;
    }

}
