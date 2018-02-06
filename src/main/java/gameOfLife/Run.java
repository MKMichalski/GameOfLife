package gameOfLife;

public class Run {


    public static void main(String[] args) {


        World world = new World(5);
        world.createRandomWorld(10);

       int timer = 10;

       while (timer > 0) {
           world.displayWorld();
           world.generateNewWorld();
           world.displayWorld();
            --timer;
       }

    }
}
