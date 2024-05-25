package java_pratice.array_string;
//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
public class GreatesteCommonDivisor {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 ="AB";
        System.out.println(" result "+ gcdOfStrings(str1,str2));
    }

    public static String gcdOfStrings( String str1, String str2){
        if ( str2.length() > str1.length()){
            return  gcdOfStrings( str2, str1);
        }
        if( str1.equals(str2)){
            return  str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }

        return "";
    }
}
