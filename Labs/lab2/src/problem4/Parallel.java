package problem4;

public class Parallel extends Circuit{
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance(){
        double ra = a.getResistance();
        double rb = b.getResistance();
        if(ra == 0.0 || rb == 0.0){
            return 0.0;
        }
        return (ra * rb) / (ra + rb);
    }

    @Override
    public double getPotentialDiff(){
        return a.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V){
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
