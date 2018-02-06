package gameOfLife;

public class Run {


    public static void main(String[] args) {


        World world = new World(50);
        world.createRandomWorld();
        world.displayWorld();
        world.generateNewWorld();



    }
}
