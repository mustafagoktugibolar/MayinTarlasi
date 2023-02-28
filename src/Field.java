import java.util.Random;

public class Field {
    private int row;
    private int column;
    private int blank;
    String fieldArr[][] = new String[row][column];
    boolean mineArr[][] = new boolean[row][column];


    public Field(){

    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getBlank() {
        return blank;
    }

    public void setBlank(int blank) {
        this.blank = blank;
    }

    public void set(int row, int column){
        this.setColumn(column);
        this.setRow(row);
        this.setBlank((column * row * 3) / 4);
    }

    public void creatField(){

        for (int i = 0; i < fieldArr.length; i++) {
            for (int j = 0; j < fieldArr[i].length; j++) {
                fieldArr[i][j] = "-";
            }
        }
        for (int k = 0; k < (row * column) / 4; k++) {
            Random rand = new Random();
            mineArr[rand.nextInt(row)] [rand.nextInt(column)] = true;
        }
    }

    public void print(){
        for (String[] strings : fieldArr) {
            for (String strings2 : strings) {
                System.out.print(strings2 + " ");
            } 
        System.out.println();    
        }
    }
    
    


}
