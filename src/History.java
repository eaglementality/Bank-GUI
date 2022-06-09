import javax.swing.*;

public class History {
    private JPanel HistoryPanel;

    public  void history(){
        JFrame frame = new JFrame();
        frame.setContentPane(new History().HistoryPanel);
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
