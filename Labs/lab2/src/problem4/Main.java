package problem4;

public class Main {
    public static void main(String[] args){
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        System.out.println("Equivalent Resistance: " + circuit.getResistance() + " ohm");

        double V = 24.0;
        circuit.applyPotentialDiff(V);

        System.out.println("Applied Voltage: " + V +" V");
        System.out.println("Total Current: " + circuit.getCurrent() + " A");
        System.out.println("Total Power: " + circuit.getPower() + " W");

        System.out.println("Potential difference on r1: " + r1.getPotentialDiff() + " V");
        System.out.println("Potential difference on r3: " + r3.getPotentialDiff() + " V");


    }
}
