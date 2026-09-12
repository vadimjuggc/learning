package other;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Set<Point> set = new HashSet<>();
        set.add(new Point(1, 1));
        set.add(new Point(1, 1));
        System.out.println(set.size());
    }
}
