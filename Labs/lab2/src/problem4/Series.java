package problem4;

public class Series extends Circuit{
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b){
        this.a = a;
        this.b = b;
    }


    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double totalR = getResistance();
        if (totalR == 0.0){
            a.applyPotentialDiff(0.0);
            b.applyPotentialDiff(0.0);
            return;
        }
        double current = V / totalR;
        a.applyPotentialDiff(current * a.getResistance());
        b.applyPotentialDiff(current * b.getResistance());
    }
}
