package problem1;

import java.util.Objects;

public class MediaContent {
    private String title;
    private int duration;

    public MediaContent(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MediaContent that = (MediaContent) o;
        return duration == that.duration && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}
