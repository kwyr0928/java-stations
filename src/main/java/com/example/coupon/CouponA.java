package com.example.coupon;

public class CouponA {
public float calculate(int[] cartItems){
    float total = 0;
    for(int item : cartItems){
        total += item;
    }
    return total;
}
}
