package kg.geecktech.les8.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage,
                SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        Random random = new Random();
        int coeff = random.nextInt(2) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this) {
                heroes[i].setDamage(heroes[i].getDamage() * coeff);
            }
        }
    }
}
