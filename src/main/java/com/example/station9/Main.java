package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        int sum = 0;
        for (int i = 0; i < itemPrices.length; i = i + 1){
            sum = sum + itemPrices[i];
        }
        
        int total = 0;

        for (int i = 0; i < itemPrices.length; i = i + 1){
            if (itemPrices[i] >= 2000){
                total = total + itemPrices[i];
            }
        }

        if (sum <= 5000){
            System.out.println("A");
        } else if (total >= 4000 && sum >= 5800){
            System.out.println("C");
        } else if (sum >= 5555){
            System.out.println("B");
        } else {
            System.out.println("なし");
        }
        // ここまで
    }
}
