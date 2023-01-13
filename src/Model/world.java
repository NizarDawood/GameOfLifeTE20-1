package Model;

public class world {

    public int  height;
    public int  widht;
    public cell[] cells;
    public boolean alive;

    public world(boolean alive) {
        this.alive = alive;
    }

    public world(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

         public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
    }

    public boolean isAlive() {
        return alive;
    }
}

