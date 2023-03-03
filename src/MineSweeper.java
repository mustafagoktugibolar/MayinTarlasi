public class MineSweeper {
    private static int counter = 0;

    public MineSweeper() {
    }

    public static int getCounter() {
        return counter;
    }


    public static void setCounter(int counter) {
        MineSweeper.counter = counter;
    }
    
    
    public static boolean isMine(int row, int column){
        if(Field.mineArr[row -1][column -1]){
            //Field.fieldArr[row -1][column - 1] = "B";
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void check(int x, int y){
        int row = x;
        int column = y;
        
        if(row < 2){
            row = 2;
        }
 
        if(column < 2){
            column = 2;
        }

        for (int i = row - 1; i <= x;  i++) {
            for (int j = column -1; j <= y; j++) {
                if(isMine(i, j)){
                    counter++;
                }       
            }
            
        }
        Field.fieldArr[x -1][y - 1] = ("" + counter);
        Field.blank--;
        counter = 0;
        
    }

}
