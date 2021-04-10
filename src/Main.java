import WeaponList.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new Weapon[]{new Knife(), new WaterPistol(), new Pistol(), new Slingshot()});
        System.out.format("У игрока %d слота(-ов) с оружием,"
                        + "введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}