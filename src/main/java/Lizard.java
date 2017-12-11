public class Lizard extends Kaiju implements IFly {
    public Lizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    public void attack(Vehicle vehicle) {
        vehicle.takeDamage(attackValue);
    }


    public String connect(Kaiju kaiju) {
        return "fly move";
    }

    public String roar() {
        return "Roar!";
    }

    void takeDamage(int damage) {
        healthValue -= damage;
    }


}
