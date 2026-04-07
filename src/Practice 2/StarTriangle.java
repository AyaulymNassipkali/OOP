package Practice2;

public class StarTriangle {
    String star = "[*]";
    int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder myString = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                myString.append(star);
            }
            myString.append("\n");
        }
        return myString.toString();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(4);
        System.out.println(small.toString());
    }
}
