package Model;

public class cell {
    public int  height;
    public int  widht;
    public boolean alive;

    public cell(int height, int widht ) {
        this.height = 3;
        this.widht = 10;

    }
    //public void update(int aliveNeighboursCount) {
    //        if (alive && aliveNeighboursCount > 3) {
    //            alive = false;
    //        } else if (alive && aliveNeighboursCount < 2) {
    //            alive = false;
    //        } else if (aliveNeighboursCount == 3 && !alive) {
    //            alive = true;
    //        }
    //    }


    public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
    }
}

