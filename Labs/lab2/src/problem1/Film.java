package problem1;

import java.util.Objects;

public class Film extends MediaContent{
    private int year;

    public Film(String title, int duration, int year){
        super(title, duration);
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Film film = (Film) o;
        return year == film.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year);
    }
}
