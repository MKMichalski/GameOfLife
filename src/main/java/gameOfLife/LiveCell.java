package gameOfLife;

public class LiveCell extends World{

private String shape;

    public LiveCell() {
        super();
        this.shape = "#";

    }

    @Override
    public String toString() {
        return shape;
    }
}
