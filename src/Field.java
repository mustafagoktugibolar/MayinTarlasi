import java.util.Random;

public class Field{
    private int row;
    private int column;
    static int blank;
    static String fieldArr[][];
    static boolean mineArr[][];
    

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
        Field.blank = blank;
    }

    public void set(int row, int column){
        //SET DIMENSIONS
        this.setColumn(column);
        this.setRow(row);
        //SET ARRAYS
        fieldArr = new String[row][column];
        mineArr = new boolean[row][column];
        //SET BLANK
        this.setBlank((column * row * 3) / 4);
    }

    //USING THIS ONCE AT FIRST
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
        print();
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
