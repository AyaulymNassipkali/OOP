package Practice3.Problem2;

import java.util.Objects;

public class Person {
    private final String name;
    private String address;

    public Person(String name, String address) {
        isNullOrIsBlank(name);
        isNullOrIsBlank(address);

        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        isNullOrIsBlank(address);
        this.address = address;
    }

    public void isNullOrIsBlank(String item) {
        if (item == null || item.isBlank()) {
            throw new IllegalArgumentException(item + " cannot be null or empty");
        }
    }

    public void isItemNegative(double item) {
        if (item < 0) {
            throw new IllegalArgumentException(item + " cannot be negative");
        }
    }

    public void isItemNonNegative(double item) {
        if (item <= 0) {
            throw new IllegalArgumentException(item + " cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "Person[name = " + name + ", address = " + address + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Person person)) {
            return false;
        }
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
