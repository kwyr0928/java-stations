package com.example.coupon;

public class CouponC {
public float calculate(int[] cartItems){
    float total = 0;
    for(int item : cartItems){
        if(item >= 2000){
            total += (item*0.8);
        }else{
        total += item;
        }
    }
    if(total < 5000){
        total += 800;
    }else{

    }
    return total;
}
}
