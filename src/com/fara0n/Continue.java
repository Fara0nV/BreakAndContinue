package com.fara0n;

public class Continue {
    public static void main(String[] args) {
        for(int i=0;i<=15;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Отобраны нечетные чмсла : "+i);
        }
    }
}
