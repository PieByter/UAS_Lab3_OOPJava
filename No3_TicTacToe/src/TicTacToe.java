import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends Component {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button8;
    private JButton button5;
    private JButton button6;
    private JButton button9;
    private JButton button7;
    private JButton RESETButton;
    private JButton EXITButton;
    private JLabel title;
    private JPanel game;
    private JLabel player1;
    private JLabel player2;
    private JLabel player1text;
    private JLabel player2text;
    private String start = "X";
    private int xCount = 0;
    private int oCount = 0;

    public TicTacToe() {



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button1.setForeground(Color.RED);
                } else {
                    button1.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button2.setForeground(Color.RED);
                } else {
                    button2.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button3.setForeground(Color.RED);
                } else {
                    button3.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button4.setForeground(Color.RED);
                } else {
                    button4.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button8.setForeground(Color.RED);
                } else {
                    button8.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button5.setForeground(Color.RED);
                } else {
                    button5.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button6.setForeground(Color.RED);
                } else {
                    button6.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button9.setForeground(Color.RED);
                } else {
                    button9.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setText(start);
                if (start.equalsIgnoreCase("X")) {
                    button7.setForeground(Color.RED);
                } else {
                    button7.setForeground(Color.BLUE);
                }
                playerStart();
                winner();
            }
        });

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");

                button1.setBackground(Color.WHITE);
                button2.setBackground(Color.WHITE);
                button3.setBackground(Color.WHITE);
                button4.setBackground(Color.WHITE);
                button5.setBackground(Color.WHITE);
                button6.setBackground(Color.WHITE);
                button7.setBackground(Color.WHITE);
                button8.setBackground(Color.WHITE);
                button9.setBackground(Color.WHITE);
            }
        });

        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void score() {
        player1text.setText(String.valueOf(xCount));
        player2text.setText(String.valueOf(oCount));
    }

    public void playerStart() {
        if (start.equalsIgnoreCase("X")) {
            start = "O";
        } else {
            start = "X";
        }
    }

    private void winner() {
        String btn1 = button1.getText();
        String btn2 = button2.getText();
        String btn3 = button3.getText();
        String btn4 = button4.getText();
        String btn5 = button5.getText();
        String btn6 = button6.getText();
        String btn7 = button7.getText();
        String btn8 = button8.getText();
        String btn9 = button9.getText();

        boolean winnerFound = false;

        // player X win check
        if (btn1.equals("X") && btn2.equals("X") && btn3.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button1.setBackground(Color.GREEN);
            button2.setBackground(Color.GREEN);
            button3.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn4.equals("X") && btn5.equals("X") && btn6.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button4.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn7.equals("X") && btn8.equals("X") && btn9.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button7.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn1.equals("X") && btn4.equals("X") && btn7.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button1.setBackground(Color.GREEN);
            button4.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn2.equals("X") && btn5.equals("X") && btn8.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button2.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn3.equals("X") && btn6.equals("X") && btn9.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button3.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn1.equals("X") && btn5.equals("X") && btn9.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button1.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn3.equals("X") && btn5.equals("X") && btn7.equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            score();
            button3.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            winnerFound = true;
        }

        // player O win check
        if (btn1.equals("O") && btn2.equals("O") && btn3.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button1.setBackground(Color.GREEN);
            button2.setBackground(Color.GREEN);
            button3.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn4.equals("O") && btn5.equals("O") && btn6.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button4.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn7.equals("O") && btn8.equals("O") && btn9.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button7.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn1.equals("O") && btn4.equals("O") && btn7.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button1.setBackground(Color.GREEN);
            button4.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn2.equals("O") && btn5.equals("O") && btn8.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button2.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn3.equals("O") && btn6.equals("O") && btn9.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button3.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn1.equals("O") && btn5.equals("O") && btn9.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button1.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            winnerFound = true;
        }
        if (btn3.equals("O") && btn5.equals("O") && btn7.equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O Won!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            score();
            button3.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button7.setBackground(Color.GREEN);
            winnerFound = true;
        }
        
        // check if tie
        if (!winnerFound && !btn1.isEmpty() && !btn2.isEmpty() && !btn3.isEmpty() &&
                !btn4.isEmpty() && !btn5.isEmpty() && !btn6.isEmpty() &&
                !btn7.isEmpty() && !btn8.isEmpty() && !btn9.isEmpty()) {
            JOptionPane.showMessageDialog(this, "It's a Tie!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        frame.setContentPane(new TicTacToe().game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
