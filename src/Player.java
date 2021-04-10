import WeaponList.*;

public class Player {
    private final Weapon[] weaponSlots;

    public Player(Weapon[] weapons) {
        this.weaponSlots = weapons;
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        weaponSlots[slot].shot();
    }
}