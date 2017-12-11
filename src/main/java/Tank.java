public class Tank extends Vehicle {


    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    void takeDamage(int damage) {
        setHealthValue(getHealthValue() - damage);
    }

    public void attack(Kaiju kaiju) {
        kaiju.takeDamage(attackValue);
    }

}
