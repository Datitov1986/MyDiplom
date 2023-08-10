package org.example.Tarif;

/**
 * Класс, содержащий тарифы
 * есть возможность получать информацию о тарифах через геттеры,
 * а также обновлять тарифы при их изменении при помощи сеттеров
 */

public class Tarifi {
    private static double gorVoda = 205.73;
    private static double holVoda = 50.93;
    private static double vodootvedenie = 39.97;
    private static double electricT1 = 6.91;
    private static double electricT2 = 2.62;

    public double getGorVoda() {
        return gorVoda;
    }

    public static double getHolVoda() {
        return holVoda;
    }

    public static double getVodootvedenie() {
        return vodootvedenie;
    }

    public static double getElectricT1() {
        return electricT1;
    }

    public static double getElectricT2() {
        return electricT2;
    }

    public static void setGorVoda(double gorVoda) {
        Tarifi.gorVoda = gorVoda;
    }

    public static void setHolVoda(double holVoda) {
        Tarifi.holVoda = holVoda;
    }

    public static void setVodootvedenie(double vodootvedenie) {
        Tarifi.vodootvedenie = vodootvedenie;
    }

    public static void setElectricT1(double electricT1) {
        Tarifi.electricT1 = electricT1;
    }

    public static void setElectricT2(double electricT2) {
        Tarifi.electricT2 = electricT2;
    }
}
