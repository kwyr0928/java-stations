package com.example.station6;

public class Main {
    public static void main(String[] args) {
        // ここから
        int users[] = new int[5];
        users[0] = 23;
        users[1] = 36;
        users[2] = 31;
        users[3] = 48;
        users[4] = 58;
        int all = 0;
        for(int user : users){
            all += user;
        }
        System.out.println((double)all/5);
        // ここまで
    }
}
