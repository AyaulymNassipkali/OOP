package problem4;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower(){
        return getPotentialDiff() * getCurrent();
    }

    public double getCurrent() {
        double r = getResistance();
        if (r == 0.0) {
            return 0.0;
        }
        return getPotentialDiff() / r;
    }

}
