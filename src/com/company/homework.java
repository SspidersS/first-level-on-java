package com.company;

public class homework {

    public static void main(String[] args) {

        System.out.println("Сколько в году месяцев? часов? минут? секуд? милисекунд?");
        System.out.println("чтобы узнать сколько часов в году нужно 24 часа умножить на 365 дней" );

        byte hours =24;
        short days = 365;
        byte minHour = 60;

        int hour = (hours*days);
        System.out.println("В году "+hour+" часов");
        short hourDay= (short)(hours*minHour);

        int minYear = (int)( hourDay * 365);
        System.out.println("В году "+ minYear+ " минут");

        int secondMin = (minYear * 60);
        System.out.println("в году " +secondMin+ " секунд");

        long milliseconds = (secondMin * 1_000l);
        System.out.println("В году " +milliseconds+ "секунд");





    }
}
