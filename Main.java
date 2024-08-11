import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    static JFrame frame ;
    static JTextField textField ;
    static JButton [] buttons = new JButton[9] ;
    static JPanel panel;
    static String signX = "X";
    static String signO = "O";
    static String sign = signX;


    public static void checkForWinner() {
        // Possible winning combinations
        int[][] winningCombinations = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6}
        };

        for (int[] combination : winningCombinations) {
            String b1 = buttons[combination[0]].getText();
            String b2 = buttons[combination[1]].getText();
            String b3 = buttons[combination[2]].getText();

            if (!b1.equals("") && b1.equals(b2) && b2.equals(b3)) {
                showWinner(b1);
                return;
            }
        }

        boolean draw = true;
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                draw = false;
                break;
            }
        }

        if (draw) {
            showDraw();
        }
    }

    private static void showWinner(String winner) {
        JOptionPane.showMessageDialog(null,"Player " + winner + " wins!");
        resetBoard();
    }

    private static void showDraw() {
        JOptionPane.showMessageDialog(null, "It's a draw!");
        resetBoard();
    }

    private static void resetBoard() {
        for (JButton button : buttons) {
            button.setText("");
        }
        sign = signX;
    }
    public static void main(String[] args) {
        frame = new JFrame("Tik Tac Toe");
        frame.setVisible(true);
        frame.setBounds(450,100,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 5);
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setBackground(Color.LIGHT_GRAY);
            buttons[i].setFont(new Font ("Times Roman",Font.BOLD,50));
            buttons[i].setFocusPainted(false);
            buttons[i].setBorder(lineBorder);
            buttons[i].setVisible(true);
        }
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.setBounds(4000,500,400,400);
        panel.setBackground(Color.DARK_GRAY);
        panel.setVisible(true);
        panel.add(buttons[0]);
        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        panel.add(buttons[4]);
        panel.add(buttons[5]);
        panel.add(buttons[6]);
        panel.add(buttons[7]);
        panel.add(buttons[8]);
        frame.add(panel);
        //Design is completed

        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[0].getText() == ""){
                    buttons[0].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[1].getText() == ""){
                    buttons[1].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[2].getText() == ""){
                    buttons[2].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[3].getText() == ""){
                    buttons[3].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[4].getText() == ""){
                    buttons[4].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[5].getText() == ""){
                    buttons[5].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[6].getText() == ""){
                    buttons[6].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[7].getText() == ""){
                    buttons[7].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }
        });
        buttons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[8].getText() == ""){
                    buttons[8].setText(sign);
                    sign = sign == "X" ? signO : signX ;
                }
                checkForWinner();
            }

        });


    }

}