package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
public interface ChessDesk {

    String[] XCoordinate = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int[] YCoordinate = {1, 2, 3, 4, 5, 6, 7, 8};

    Figure[] figuresArray = new Figure[32];
    int position = 0;

    public void fillFiguresArray() {
        this.figuresArray[position++] = this.new King(this.input, this.tracker);
        this.userActions[position++] = this.new EditTask(this.input, this.tracker);
        this.userActions[position++] = this.new DeleteTask(this.input, this.tracker);
        this.userActions[position++] = this.new ShowTasksList(this.input, this.tracker);
        this.userActions[position++] = this.new ShowFilteredList(this.input, this.tracker);
    }



}
