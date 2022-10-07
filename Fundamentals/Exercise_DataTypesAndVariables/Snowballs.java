package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());

        double snowballValue = 0;
        double maxValue = Double.MIN_VALUE;
        int biggestSnowballSnow = 0;
        int biggestSnowballTime  = 0;
        int biggestSnowballQuality = 0;

        for (int snowBall = 1; snowBall <= numberOfBalls ; snowBall++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                biggestSnowballSnow = snowballSnow;
                biggestSnowballTime = snowballTime;
                biggestSnowballQuality = snowballQuality;
            }
        }
            System.out.printf("%d : %d = %.0f (%d)",biggestSnowballSnow,biggestSnowballTime,maxValue,biggestSnowballQuality);


    }
}
