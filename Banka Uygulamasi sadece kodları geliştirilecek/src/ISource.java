import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public interface ISource {

    public boolean labelSource(JLabel label);

    public boolean buttonSource(JButton button);

    public boolean textSource(JTextField textField);
}