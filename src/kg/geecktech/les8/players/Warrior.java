package kg.geecktech.les8.players;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int coeff = random.nextInt(1) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this){
                heroes[i].setDamage(heroes[i].getDamage() * coeff);
            }
        }
    }
}
