package farmsimulator;

import java.util.Random;

/**
 *
 * @author j3kaiii
 */
public class Cow implements Milkable, Alive{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udder;
    private double amount;

    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length) - 1]);
    }
    
    public Cow(String name) {
        this.name = name;
        this.udder = new Random().nextInt(26) + 15;
        
    }

    public String getName() {
        return name;
    }
    
    public double getCapacity() {
        return udder;
    }
    
    public double getAmount() {
        return amount;
    }

    @Override
    public double milk() {
        double all = amount;
        amount = 0.0;
        return all;
    }

    @Override
    public void liveHour() {
        this.amount += new Random().nextDouble() * 1.3 + 0.7;
        if (this.amount > this.udder) {
            this.amount = this.udder;
        }
    }
    
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udder);
    }
}

