package weapons.shields;
/*
Рыцарский щит
 */
import weapons.Protection;

public class KnightShield implements Protection {

    @Override
    public int blockDamage() {return 3;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }
}