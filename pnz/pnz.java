import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PNZ extends JApplet implements ActionListener {

    boolean isGameOver = true;
    String target;
    int count;
    JTextField responseField;
    JTextField guessField;
    JTextArea responseArea;

    public void init() {
       Container contentPane = getContentPane();
       contentPane.setBackground(Color.PINK);
       contentPane.setLayout(new FlowLayout());
       JButton newGameButton = new JButton("New Game");
       JButton registerButton = new JButton("Register");
       JLabel guessLabel = new JLabel("Enter your guess:");
       responseField = new JTextField(25);
       guessField = new JTextField(3);
       responseArea = new JTextArea(15, 20);
       contentPane.add(newGameButton);
       contentPane.add(responseField);
       contentPane.add(guessLabel);
       contentPane.add(guessField);
       contentPane.add(registerButton);
       contentPane.add(responseArea);
       newGameButton.addActionListener(this);
       registerButton.addActionListener(this);
       responseField.setText("Click \"New Game\" to get started.");
       responseArea.setText("");
    }

    public void actionPerformed(ActionEvent e) {
       String actionCommand = e.getActionCommand();
       if(actionCommand.equals("New Game"))
          startNewGame();
       else if(actionCommand.equals("Register")) {
          processGuess();
       }
       else
          responseField.setText("Error");
    }

    private void startNewGame() {
       count = 0;
       target = randomString();
       isGameOver = false;
       responseArea.setText("");
       displayResult("          Guess","Result");
       responseField.setText("OK. Guess a number with 3 distinct 
digits.");
    }

    private void processGuess() {
       String guess = guessField.getText(), result;
       boolean validInput = true;
       if(isGameOver) {
          responseField.setText("It's time to start a new game.");
          return;
       }
       if(guess.length() != 3)
          validInput = false;
       else {
          validInput = Character.isDigit(guess.charAt(0)) &&
                       Character.isDigit(guess.charAt(1)) &&
                       Character.isDigit(guess.charAt(2)) &&
                       guess.charAt(0) != guess.charAt(1) &&
                       guess.charAt(1) != guess.charAt(2) &&
                       guess.charAt(2) != guess.charAt(0);
       }
       if(!validInput) {
          JOptionPane.showMessageDialog(null,
                                "Error: Your guess must be 3 distinct 
digits.");
          return;
       }
       result = evaluateGuess(target, guess);
       displayResult("          " + guess, result);
       count++;
       if(guess.equals(target)) {
          responseField.setText("Right! You got it in " + count + " 
tries.");
          isGameOver = true;
       }
    }

    private String randomString() {
       String str = "   ";
       while(str.charAt(0) == str.charAt(1) ||
             str.charAt(1) == str.charAt(2) ||
             str.charAt(2) == str.charAt(0))
          str = "" + randomDigit() + randomDigit() + randomDigit();
      return str;
    }

    private char randomDigit() {
       int n;
       n = '0' + (int)(10*Math.random());
       return (char)n;
    }

    private String evaluateGuess(String target, String guess) {
       String str = "";
       int i, j;
       for(i = 0; i < 3; i++){
          for(j = 0; j < 3; j++){
             if(guess.charAt(i) == target.charAt(j)) {
                if(i == j)
                   str = "P" + str;
                else
                   str = str + "N";
             }
          }
       }
       if(str.length() == 0)
          str = "Z";
       return "    " + str;
    }

    private void displayResult(String guess, String result) {
       responseArea.append(guess + " " + result  + "\n");
    }
}
