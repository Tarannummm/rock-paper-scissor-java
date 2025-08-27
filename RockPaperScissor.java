import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] rps={"r","p","s"};
        String computerMove= rps[new Random().nextInt(rps.length)];

        String playerMove;
        while(true){
            System.out.println("Please enter your move (r,p,s)");
            playerMove= sc.nextLine();
            if (playerMove.equals("r")|| playerMove.equals("p")||playerMove.equals("s")){
                break;
            }
            System.out.println(playerMove +"is Invalid");
        }
        System.out.println("Computer played:"+computerMove );

        if(playerMove.equals(computerMove)){
            System.out.println("Tie");
        }
        else if(playerMove.equals("r")){
            if(computerMove.equals("p")){
                System.out.println("You Lose");
            }
             else if(computerMove.equals("s")){
                System.out.println("You Win");
            }
        else if(playerMove.equals("p")){
             if(computerMove.equals("r")){
                System.out.println("You Win");
            }
             else if(computerMove.equals("s")){
                System.out.println("You Lose");
        } 
        else if (playerMove.equals("s")){
             if(computerMove.equals("r")){
                System.out.println("You Lose");
            }
             else if(computerMove.equals("p")){
                System.out.println("You Win");
        }

    }
}
    }
}
}


