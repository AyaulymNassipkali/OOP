package Lab1;

import java.util.Vector;

public class DragonLaunch {
	enum Gender {
        BOY,
        GIRL
    }
    
    public static class Person {
        private Gender gender;
        
        Person(Gender gender) {
            this.gender = gender;
        }
        
        public Gender getGender() {
            return gender;
        }
        
        public void setGender(Gender gender) {
            this.gender = gender;
        }
        
        @Override
        public String toString() {
            return (gender == Gender.BOY) ? "B" : "G";
        }
    }
    
    private Vector<Person> prisoners;
    
    public DragonLaunch() {
        prisoners = new Vector<>();
    }
    
    public void kidnap(Person p) {
        prisoners.add(p);
    }
    
    public boolean willDragonEatOrNot() {
        int unmatchedBoys = 0;
        
        for (Person p : prisoners) {
            if (p.getGender() == Gender.BOY) {
                unmatchedBoys++;
            } else {
                if (unmatchedBoys > 0) {
                    unmatchedBoys--;
                }
            }
        }
        
        return unmatchedBoys > 0;
    }
    
    public Vector<Person> getPrisoners() {
        return new Vector<>(prisoners);
    }
    
    public static void main(String[] args) {
        DragonLaunch test1 = new DragonLaunch();
        test1.kidnap(new Person(Gender.BOY));
        test1.kidnap(new Person(Gender.BOY));
        test1.kidnap(new Person(Gender.GIRL));
        test1.kidnap(new Person(Gender.GIRL));
        
        System.out.println("BBGG: " + test1.willDragonEatOrNot());
        
        DragonLaunch test2 = new DragonLaunch();
        test2.kidnap(new Person(Gender.GIRL));
        test2.kidnap(new Person(Gender.BOY));
        test2.kidnap(new Person(Gender.GIRL));
        test2.kidnap(new Person(Gender.BOY));
        
        System.out.println("GBGB: " + test2.willDragonEatOrNot());
    }

}
