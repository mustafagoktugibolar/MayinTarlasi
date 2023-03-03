import java.util.Scanner;

public class Game {
    public static void play() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Field field = new Field();

        boolean isError = false;

        String welcome = "*********** WELCOME *********** \n"
        + "Select Difficulty\n"
        + "Easy   (4x4)\n"
        + "Normal (6x6)\n"
        + "Hard   (8x8)";

        System.out.println(welcome);
        System.out.println();
        Thread.sleep(1000);

        System.out.print("Choosen Difficulty : ");
        String diff = sc.nextLine();


        if(diff.equals("Easy")){
            field.set(4, 4);
        }
        else if(diff.equals("Normal")){
            field.set(6, 6);
        }
        else if(diff.equals("Hard")){
            field.set(8, 8);
        }
        else{
            isError = true;
        }


        field.creatField();
        
       


        if(isError){
            System.out.println("Unvalid Process! Try Again");
            Thread.sleep(1000);
        }
    }
}
