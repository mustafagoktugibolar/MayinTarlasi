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
        
        if(row - 2 < 0){
            row = 1;
        }
 
        if(column - 2 < 0){
            column = 1;
        }

        for (int i = row -1 ; i <= x + 1 ;  i++) {
            for (int j = column -1; j <= y + 1; j++) {
                if(isMine(i, j)){
                    counter++;
                }
                   
            }
            
        }
        Field.fieldArr[row -1][column - 1] = ("" + counter);
        counter = 0;
        
    }

}
