package java_pratice.array_string;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candles = {2,3,5,1,3};
        int extra_candle =3;
        System.out.println( " result " + kidsCandle(candles, extra_candle));
    }

    public static List <Boolean> kidsCandle ( int [] candles , int extra_candle){
        List<Boolean> result =new ArrayList<>(candles.length);
        int maxi = 0 ;
        for(int i=0;i<candles.length;i++)
        {
            if(candles[i]>maxi){
                maxi=candles[i];
            }
        }
        for(int i =0 ; i < candles.length; i++){
            if ( candles[i] + extra_candle >= maxi){
                result.add (true);
            }else {
                result.add (false);
            }
        }
        return result;

    }
}
