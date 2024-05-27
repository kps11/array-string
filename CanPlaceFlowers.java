package java_pratice.array_string;
//https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed ={0,0,0}; int n=2;
        System.out.println(canPlaceFlower(flowerbed, n));

    }
    public static boolean canPlaceFlower( int [] flowerbed , int n){
        for( int i = 0; i < flowerbed.length; i = i + 2 ){

            if( flowerbed[i] == 0 ) {
                if (i == flowerbed.length - 1 || flowerbed[i] == flowerbed[i + 1]) {
                    n--;
                } else {
                    i++;
                }
            }
        }
        return n <= 0;
    }
}
