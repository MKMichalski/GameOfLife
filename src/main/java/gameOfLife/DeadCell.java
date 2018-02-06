package gameOfLife;

public class DeadCell extends World {

    private String shape;

    public DeadCell() {
        super();
        this.shape = " ";
    }

    @Override
    public String toString() {
        return shape;
    }

}
