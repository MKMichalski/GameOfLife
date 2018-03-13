package gameOfLife;


import java.util.Random;

public class World {
    private LiveCell livecell;
    private DeadCell deadcell;
    private int size;
    private World world[][];

     World() {
    }

     World(int size) {
        this.size = size;
        world = new World[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void displayWorld() {
        for (int i = 1; i < world.length-1; i++) {
            for (int j = 1; j < world.length-1; j++) {

                System.out.print(world[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

    }

    /**
     * This method create initial "world"
     *
     * @param density should be in range 0-10, density defines density of population.
     */
    public void createRandomWorld(int density) {


        livecell = new LiveCell();
        deadcell = new DeadCell();
        Random r = new Random();

        for (int i = 1; i < world.length - 1; i++) {
            for (int j = 1; j < world.length - 1; j++) {
                int x = r.nextInt(12 - density);
                if (x == 1) {
                    world[i][j] = livecell;

                } else {
                    world[i][j] = deadcell;
                }
            }
        }
    }

    public void generateNewWorld() throws ArrayIndexOutOfBoundsException {

        for (int i = 1; i < world.length - 1; i++) {
            for (int j = 1; j < world.length - 1; j++) {
                if (world[i][j] == livecell) {
                    int counterLive = 0;
                    if (world[i - 1][j - 1] == livecell) {
                        counterLive++;
                    }
                    if (world[i - 1][j] == livecell) {
                        counterLive++;
                    }
                    if (world[i - 1][j + 1] == livecell) {
                        counterLive++;
                    }
                    if (world[i][j - 1] == livecell) {
                        counterLive++;
                    }
                    if (world[i][j + 1] == livecell) {
                        counterLive++;
                    }
                    if (world[i + 1][j - 1] == livecell) {
                        counterLive++;
                    }
                    if (world[i + 1][j] == livecell) {
                        counterLive++;
                    }
                    if (world[i + 1][j + 1] == livecell) {
                        counterLive++;
                    }

                    if (counterLive < 2 || counterLive > 3) {
                        world[i][j] = deadcell;
                    } else {
                        world[i][j] = livecell;
                    }

                }
                if (world[i][j] == deadcell) {
                    int counterLive1 = 0;
                    if (world[i - 1][j - 1] == livecell) {
                        counterLive1++;
                    }
                    if (world[i - 1][j] == livecell) {
                        counterLive1++;
                    }
                    if (world[i - 1][j + 1] == livecell) {
                        counterLive1++;
                    }
                    if (world[i][j - 1] == livecell) {
                        counterLive1++;
                    }
                    if (world[i][j + 1] == livecell) {
                        counterLive1++;
                    }
                    if (world[i + 1][j - 1] == livecell) {
                        counterLive1++;
                    }
                    if (world[i + 1][j] == livecell) {
                        counterLive1++;
                    }
                    if (world[i + 1][j + 1] == livecell) {
                        counterLive1++;
                    }
                    if (counterLive1 == 3) {
                        world[i][j] = livecell;
                    } else {
                        world[i][j] = deadcell;
                    }


                }
            }
        }
    }


}

