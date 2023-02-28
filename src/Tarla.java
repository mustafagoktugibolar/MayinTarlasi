import java.util.Random;

public class Tarla {
    private int row;
    private int column;


    public Tarla(){

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

    public void set(int row, int column){
        this.setColumn(column);
        this.setRow(row);
    }

    public void creatTarla(){
        String tarlaArr[][] = new String[row][column];
        boolean mineArr[][] = new boolean[row][column];

        for (int i = 0; i < tarlaArr.length; i++) {
            for (int j = 0; j < tarlaArr[i].length; j++) {
                tarlaArr[i][j] = "-";
            }
        }

        for (int k = 0; k < (row * column) / 4; k++) {
            for (int l = 0; l <= Math.random() * row; l++) {
                for (int s = 0; s <= Math.random() * column; s++) {
                    mineArr[l][s] = true;
                }
            }
        }
        for (boolean[] bs : mineArr) {
            for (boolean b : bs) {
                System.out.println(b);
            }
        }

        for (String[] strings : tarlaArr) {
            for (String strings2 : strings) {
                System.out.print(strings2 + " ");
            } 
        System.out.println();    
        }
    }
    
    


}
