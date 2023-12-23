package game;

public class Move {
    private int row;
    private int column;
    private int value;

    public Move(int row, int column, int value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public  int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Move (%s, %d, %d)", value, row + 1, column + 1);
    }
}
