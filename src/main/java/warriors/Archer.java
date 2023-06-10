package warriors;

/*
Вид воина Лучник.
 */

import weapons.Protection;
import weapons.Weapon;
import weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Protection>{ // Класс Лучника;
    public Archer(String name, int healthPoint, Ranged weapon, Protection protection) { // Поля берем от воина;
        super(name, healthPoint, weapon, protection);
    }

    public int distance(){
        return super.getWeapon().distance(); // Дальность ведения стрельбы лучника;
    }



    @Override
    public String toString() {
        return String.format("Лучник: %s, Дистанция: %d",super.toString(), distance()); // Вывод лучника;
    }
}
