class Solution {
    public boolean isValid(String s) {
  HashMap<Character,Character> mappBrackets = new HashMap<>();
        Stack<Character> s1 = new Stack<>();

        mappBrackets.put(')', '(');
        mappBrackets.put('}', '{');
        mappBrackets.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char charct=s.charAt(i);
            if(!mappBrackets.containsKey(charct)){
                s1.push(charct);
            }else{
                if(s1.isEmpty()){
                    return false;
                }
                char topEle=s1.pop();
                if(topEle!=mappBrackets.get(charct)){
                    return false;
                }
            }
        }
        return s1.isEmpty();

    }
}
