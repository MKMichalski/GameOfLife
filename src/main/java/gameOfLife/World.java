package gameOfLife;


import java.util.Random;

public class World{

    private int size;
    private World world [][];
    public World (){}

    public World(int size ) {
        this.size = size;
        world = new World [size][size];
    }


    public void displayWorld() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                System.out.print(world[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void createRandomWorld(){
        LiveCell livecell = new LiveCell();
        DeadCell deadcell = new DeadCell();
        Random r = new Random();

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world.length; j++) {
                int x = r.nextInt(2);
                if(x == 1){
                    world[i][j] =  livecell ;

                }else{
                    world[i][j] = deadcell;
                }
            }
        }
    }


    public void generateNewWorld() {





    }
}
