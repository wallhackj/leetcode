package org.example;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char[] sCharArray =s.toCharArray();
        char[] tCharArray =t.toCharArray();

        while(i < tCharArray.length){
            if(tCharArray[i]==sCharArray[j]){
                j++;
            }
            i++;

            if(j == sCharArray.length) return true;
        }

        return false;
    }
}
