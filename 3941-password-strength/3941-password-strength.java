class Solution {
    public int passwordStrength(String password) {
        Set<Character> l = new HashSet<>();
        Set<Character> u = new HashSet<>();
        Set<Character> d = new HashSet<>();
        Set<Character> s = new HashSet<>();
        String sc = "!@#$%";

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)) l.add(c);
            else if(Character.isUpperCase(c)) u.add(c);
            else if(Character.isDigit(c)) d.add(c);
            else if(sc.indexOf(c) != -1) s.add(c);
        }
        return l.size()*1 + u.size()*2 + d.size()*3 + s.size() * 5;
    }
}