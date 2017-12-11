public class Lizard extends Kaiju implements IFly {
    public Lizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }



    public String connect(Kaiju kaiju) {
        return "fly move";
    }

    public String roar() {
        return "Roar!";
    }
}
