import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SourceController implements ISource {

    private Object source = null;

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return this.source;
    }

    @Override
    public boolean labelSource(JLabel label) {
        return this.source == label;
    }

    @Override
    public boolean buttonSource(JButton button) {
        return this.source == button;
    }

    @Override
    public boolean textSource(JTextField textField) {
        return this.source == textField;
    }
}