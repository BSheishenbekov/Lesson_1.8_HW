package kg.geecktech.les8.players;

import java.util.Random;

public class Berserk extends Hero {

    private int savedDamage;

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    public Berserk(int health, int damage) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int savedDamage = random.nextInt(20) + 10;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this){
                heroes[i].setDamage(heroes[i].getDamage() + savedDamage);
            }
        }
    }
}
