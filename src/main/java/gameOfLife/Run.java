package gameOfLife;

public class Run {


    public static void main(String[] args) {


        World world = new World(10);
        world.createRandomWorld(10);
        world.displayWorld();

       int timer = 100;

       while (timer > 0) {
           world.generateNewWorld();
           world.displayWorld();
            --timer;
                   }

    }
}
