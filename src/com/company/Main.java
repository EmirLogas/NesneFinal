package com.company;

import java.util.Scanner;

public class Main {

    interface Zaman {
        public int dakikahesapla();
    }

    static class Ay implements Zaman {
        public int dakikahesapla() {
            Scanner scan = new Scanner(System.in);
            int ay, gun, dakika;
            System.out.println("Ay değerini giriniz : ");
            ay = scan.nextInt();
            System.out.println("Gün değerini giriniz : ");
            gun = scan.nextInt();
            dakika = (ay * 30 + gun) * 24 * 60;
            Goster(ay, gun, dakika);
            return 0;
        }

        public void Goster(int ay, int gun, int dakika) {
            System.out.println(ay + " Ay" + gun + " Gün : " + dakika + " Dakikadır.");
        }
    }

    static class Gun implements Zaman {
        public int dakikahesapla() {
            Scanner scan = new Scanner(System.in);
            int gun, saat, dakika;
            System.out.println("Gün değerini giriniz : ");
            gun = scan.nextInt();
            System.out.println("Saat değerini giriniz : ");
            saat = scan.nextInt();
            dakika = (gun * 24 + saat) * 60;
            Goster(gun, saat, dakika);
            return 0;
        }

        public void Goster(int gun, int saat, int dakika) {
            System.out.println(gun + " Gün" + saat + " Saat : " + dakika + " Dakikadır.");
        }
    }

    static class Saat implements Zaman {
        public int dakikahesapla() {
            Scanner scan = new Scanner(System.in);
            int saat, dakika, toplamDakika;
            System.out.println("Saat değerini giriniz : ");
            saat = scan.nextInt();
            System.out.println("Dakika değerini giriniz : ");
            dakika = scan.nextInt();
            toplamDakika = (saat * 60) + dakika;
            Goster(saat, dakika, toplamDakika);
            return 0;
        }

        public void Goster(int saat, int dakika, int toplamDakika) {
            System.out.println(saat + " Saat " + dakika + " Dakika : " + toplamDakika + " Dakikadır.");
        }
    }

    public static void main(String[] args) {

        Ay ay = new Ay();
        Gun gun = new Gun();
        Saat saat = new Saat();
        int secenek;
        String devam = "e";
        Scanner scan = new Scanner(System.in);
        if (devam == "e") {
            System.out.println("Hangi hesaplamayı seçmek istiyorsunuz : ");
            secenek = scan.nextInt();
            if (secenek == 1) {
                saat.dakikahesapla();
            }
            if (secenek == 2) {
                gun.dakikahesapla();
            }
            if (secenek == 3) {
                ay.dakikahesapla();
            }
            System.out.println("Devam etmek istiyor musunuz? (e/h)");
            devam = scan.next();
        }
    }
}
