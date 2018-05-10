package com.company;

import java.util.Scanner;

public class Main {

    // ATTRIBUTEN
    static Scanner scanner = new Scanner(System.in);


    // METHODES
    public static void main(String[] args) {

        Television myFirstTelevision = new Television();

        while (true) {
            System.out.println("\n1. ON\n" +
                    "2. OFF\n" +
                    "3. CHANNEL UP\n" +
                    "4. CHANNEL DOWN\n" +
                    "5. VOLUME UP\n" +
                    "6. VOLUME DOWN\n" +
                    "7. SET CHANNEL\n" +
                    "8. SET VOLUME LEVEL\n" +
                    "9. EXIT\n");
            System.out.print("Maak uw keuze: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: myFirstTelevision.turnOn(); break;
                case 2: myFirstTelevision.turnOff(); break;
                case 3: myFirstTelevision.channelUp(); break;
                case 4: myFirstTelevision.channelDown(); break;
                case 5: myFirstTelevision.volumeUp(); break;
                case 6: myFirstTelevision.volumeDown(); break;
                case 7: if (myFirstTelevision.isOn()) {
                    int choice = getNewChannel(); myFirstTelevision.setChannel(choice); break;
                } else {
                    System.out.println("De TV staat niet aan."); break;
                }
                case 8: if (myFirstTelevision.isOn()) {
                    int keuze = getNewVolumeLevel(); myFirstTelevision.setVolume(keuze); break;
                } else {
                    System.out.println("De TV staat niet aan."); break;
                }
                case 9: System.exit( 0);
                default:
                    System.out.println("Sorry, die keuze staat niet in het menu.");


            }
        }




    }

    public static int getNewChannel() {
        System.out.print("Op welk kanaal wilt u de TV zetten?");
        int choice = scanner.nextInt();
        return choice;
    }

    public static int getNewVolumeLevel() {
        System.out.println("Op welk volume wilt u de TV zetten?");
        int keuze = scanner.nextInt();
        return keuze;
    }
}
