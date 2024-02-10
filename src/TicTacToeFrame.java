import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TicTacToeFrame extends JFrame
{
//    private JButton oneOne;
//    private JButton oneTwo;
//    private JButton oneThree;
//    private JButton twoOne;
//    private JButton twoTwo;
//    private JButton twoThree;
//    private JButton threeOne;
//    private JButton threeTwo;
//    private JButton threeThree;
    private JOptionPane optionPane;
    private JPanel mainPanel;
    private ArrayList<TicTacToeTile> tiles = new ArrayList<>();
    public void TicTacToeFrame()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,3));
        setTitle("Tic-Tac-Toe");
        for (int i = 0; i < 3; i++)
        {
            tiles.add(new TicTacToeTile(0, i));
        }
        for (int i = 0; i < 3; i++)
        {
            tiles.add(new TicTacToeTile(1, i));
        }
        for (int i = 0; i < 3; i++)
        {
            tiles.add(new TicTacToeTile(2, i));
        }
        for (TicTacToeTile tile: tiles)
        {
            mainPanel.add(tile);
        }
        add(mainPanel);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize((screenWidth / 4) * 3, screenHeight);
        setLocation(screenWidth / 8, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Do you wanna close the window?", "Choose", JOptionPane.YES_NO_OPTION);
                        if (selectedOption == JOptionPane.YES_OPTION)
                        {
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
    }
}
