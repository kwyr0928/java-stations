package com.example.coupon;

public class CouponB {
public float calculate(int[] cartItems){
    float total = 0;
    for(int item : cartItems){
        total += item;
    }
    total *= 0.9;
    if(total < 5000){
        total += 800;
    }else{

    }
    return total;
}
}
