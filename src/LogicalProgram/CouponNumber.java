package LogicalProgram;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {

        char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        int random = (int) (Math.random() * 100000000);
        StringBuffer sb = new StringBuffer();

        while(random > 0) {
            sb.append(ch[random % ch.length]);
            random /= ch.length;
        }
        String couponCode = sb.toString();
        System.out.println("Coupon code is = " +couponCode);
    }
}