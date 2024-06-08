package java_pratice.array_string;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowel {
    public static void main(String[] args) {
        String S = "aA";
        int i =0 , j = S.length()-1;
        String  vowel = "aeiou";
        boolean isVowelAtI = false;
        boolean isVowelAtJ = false;
        char [] s2c = S.toCharArray();
        char charAtI ;
        char charAtJ;
        while( i < j ){
            System.out.println(i + " "+ j);
            charAtI = s2c[i];
            charAtJ = s2c[j];
            isVowelAtI = vowel.indexOf(Character.toLowerCase(charAtI)) == -1;
            isVowelAtJ = vowel.indexOf(Character.toLowerCase(charAtJ)) == -1;
            System.out.println(isVowelAtI + " "+ isVowelAtJ);
            if (isVowelAtI ){
                i++;
            } if (isVowelAtJ){
                j--;
            } if ( !isVowelAtJ && !isVowelAtI){

                char newChar = charAtI;
                s2c[i] = charAtJ;
                s2c[j] = newChar;
                i ++;
                j--;
            }
        }

        System.out.println(String.valueOf(s2c));
    }
}
