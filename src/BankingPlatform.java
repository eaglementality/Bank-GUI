import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingPlatform {
    private JButton depositeCashButton;
    private JButton withdrawCashButton;
    private JTextField DEPtextField1;
    private JTextField WithtextField2;
    private JButton pushButton;
    private JButton outButton;
    private JButton historyButton;
    private JPanel Mainpanel;
    private JPanel FirstPanel;
    private JPanel SecondPanel;
    private JLabel AvailableLabel;
    double Depdisplay;
//    private JPanel HistoryPanel;

    // String Deptext = String.valueOf(Double.parseDouble( DEPtextField1.getText()));
    public BankingPlatform() {
        DEPtextField1.setVisible(false);
        pushButton.setVisible(false);
        outButton.setVisible(false);
        WithtextField2.setVisible(false);
//        String Deptext = String.valueOf(Double.parseDouble( DEPtextField1.getText()));
        depositeCashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DEPtextField1.setVisible(true);
                pushButton.setVisible(true);
            }
        });
        withdrawCashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WithtextField2.setVisible(true);
                outButton.setVisible(true);
            }
        });
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Deptext = String.valueOf(Double.parseDouble( DEPtextField1.getText()));
                Depdisplay += Double.valueOf( Deptext);
            AvailableLabel.setText("GHC "+ Depdisplay);
            DEPtextField1.setVisible(false);
            pushButton.setVisible(false);
            DEPtextField1.setText(" ");
            }
        });
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Withtext = String.valueOf(Double.parseDouble( WithtextField2.getText()));
                Depdisplay -= Double.valueOf( Withtext);
                AvailableLabel.setText("GHC "+ Depdisplay);
                WithtextField2.setVisible(false);
                outButton.setVisible(false);
                WithtextField2.setText("");
            }
        });
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             History history = new History();
             history.history();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new BankingPlatform().Mainpanel);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
