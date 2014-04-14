



import javax.swing.JOptionPane;

public class Blackjack
{
    public static void main(String[] args)
    {
        Player CPU = new Player();
        Player player = new Player();
        String input;
        
        JOptionPane.showMessageDialog(null, "Welcome to a game of Blackjack 21!");
        JOptionPane.showMessageDialog(null, "A six sided dye will be used to add the score!"
                + " Your opponent is the computer "
                + "Hope you win by getting to 21");
        input = JOptionPane.showInputDialog(" Yes/1 will let you begin, "
                + "Anything else will exit you from this program");
        
        if (input.equalsIgnoreCase("Yes") || input.equals("1"))
        {
            runRound(CPU, player);
        }
        else
        {
            System.exit(0);
        }
    }
    
    public static void runRound(Player CPU, Player player)
    {
        int CPUScore, playerScore;
        String input;
        
        CPUScore = 0;
        playerScore = 0;
        CPU.setTotal(0);
        player.setTotal(0);
        
        do
        {
            CPU.rollDice();
            player.rollDice();
            
            CPUScore= CPU. getScore;
            playerScore= player.getScore();
            
            CPU.setTotal(CPUScore);
            player.setTotal(playerScore);
            
            if (CPUScore > 21 || playerScore > 21)
            {
                gameResult(CPU, player);
            }
            
            input = JOptionPane.showInputDialog("Score = " + playerScore
                    + "  (CPU score not shown)\nRun another round?"
                    + "\n(Type Yes or 1 to roll, maybe something else to quit)");
            
        } while (input.equals("1") || input.equalsIgnoreCase("Yes"));
        gameResult(CPU, player);
    }
    
    public static void gameResult(Player CPU, Player player)
    {
        String input, result;
        int CPUScore, playerScore;
        
        CPUScore = 21 - CPU.getTotal();
        playerScore = 21 - player.getTotal();
        
        if (player.getTotal() > 21 && CPU.getTotal() > 21)
        {
            result = " both lost";
        }
        else if (player.getTotal() > 21)
        {
            result = " loss";
        }
        else if (CPU.getTotal() > 21)
        {
            result = " win";
        }
        else if (playerScore > CPUScore)
        {
            result = " loss";
        }
        else if (CPUScore > playerScore)
        {
            result = "win";
        }
        else
        {
            result = "What?...";
        }
        
        input = JOptionPane.showInputDialog("Computer: " + CPU.getTotal()
                + "\nYour Score: " + player.getTotal() + "\nYou" + result + "!"
                + " Play again?\n(Yes or 1 to play, or anything else to exit)");
        
        if (input.equals("1") || input.equalsIgnoreCase("Yes"))
        {
            runRound(CPU, player);
        }
        else
        {
            System.exit(0);
        }
    }
}