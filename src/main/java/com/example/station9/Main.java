package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = { 1000, 1100, 1200, 1300 };
        int[] itemPrices2 = { 1000, 1100, 1200, 1300, 1600, 1800 };
        int[] itemPrices3 = { 1000, 2100, 3200, 2300 };
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        int total_a = 0;
        int total_b = 0;
        int total_c = 0;
        for (int price : itemPrices) {
            total_a += price;
            total_b += price;
            if (price >= 2000) {
                total_c += (price * 0.8);
            } else {
                total_c += price;
            }
        }
        total_b *= 0.9;
        if (total_b < 5000) {
            total_b += 800;
        } else {

        }
        if (total_c < 5000) {
            total_c += 800;
        } else {

        }
        int min = total_a;
        String coupon = "A";
        if (min > total_b) {
            min = total_b;
            coupon = "B";
        } else {

        }
        if (min > total_c) {
            min = total_c;
            coupon = "C";
        } else {

        }
        System.out.println(coupon);
        // ここまで
    }
}
