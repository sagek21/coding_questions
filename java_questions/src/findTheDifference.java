/*Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

*/


public class findTheDifference {

    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";

        finddifference(s,t);
    }


    public static char finddifference(String s, String t) {
        int [] schars = new int[26];

        for(int i=0; i<s.length(); i++)
            schars[s.charAt(i)-'a']++;
        for(int j=0; j<t.length(); j++)
            if(--schars[t.charAt(j)-'a'] <0)
                return t.charAt(j);
        return 0;
    }

}
