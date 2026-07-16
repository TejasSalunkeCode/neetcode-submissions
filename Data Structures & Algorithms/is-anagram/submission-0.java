class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        Character[] chars = new Character[s.length()];
        Character[] chars2 = new Character[t.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            chars2[i] = t.charAt(i);  // ✅ fixed here
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars[i] != null && chars[i].equals(chars2[j])) {
                    count++;
                    chars2[j] = null; // mark as used
                    break;
                }
            }
        }

        return count == chars.length;
    }
}
