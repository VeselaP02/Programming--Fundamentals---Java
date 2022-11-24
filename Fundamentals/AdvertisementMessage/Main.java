package AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessage = Integer.parseInt(scanner.nextLine());
        Message message = new Message();

        for (int i = 1; i <= countMessage ; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}
