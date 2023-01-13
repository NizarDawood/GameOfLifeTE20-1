package Model;

public class cell {
    public int  height;
    public int  widht;
    public boolean alive;

    public cell(int height, int widht ) {
        this.height = height;
        this.widht = widht;

    }

    public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
    }
}

