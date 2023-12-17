//Cake

public class Cake extends Food {
    private String icing;
    static int Count = 0;

    public Cake(String icing) {
        super("Торт");
        this.icing = icing;
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

    public String toString() {
        return super.toString() + " с начинкой '" + icing.toUpperCase() + "'";
    }
}
