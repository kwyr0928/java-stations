package com.example.coupon;

public class CouponCalculator {
public String findBestCoupon (int[] cartItems){
CouponA cou_a = new CouponA();
CouponB cou_b = new CouponB();
CouponC cou_c = new CouponC();
float total_a = cou_a.calculate(cartItems);
float total_b = cou_b.calculate(cartItems);
float total_c = cou_c.calculate(cartItems);
float min = total_a;
String coupon = "A";
if(min > total_b){
    min = total_b;
    coupon = "B";
}else{

}
if(min > total_c){
    min = total_c;
    coupon = "C";
}else{

}
return coupon;
}
}
