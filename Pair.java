public class Pair<T extends Object> {
    private T x;
    private T y;
    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }
    public T getY() {
        return y;
    }
}