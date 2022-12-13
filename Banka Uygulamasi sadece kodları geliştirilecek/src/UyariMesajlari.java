import java.awt.Component;
import javax.swing.JOptionPane;

public class UyariMesajlari {

    private String uyariMesaji = "";

    public void uyariMesajiGoster(Component sinif, String uyariMesaji) {
        JOptionPane.showMessageDialog(sinif, uyariMesaji);
    }

    public int onayMesajiGoster(Component currentComponent, String message, String title) {
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(currentComponent, message, title, optionType);
        if (optionType == selected)
        {
            return 1;
        }
        return -1;
    }

    public String sayiUyarisiAl() {
        this.uyariMesaji = "Yalnızca sayı girilebilir!";
        return uyariMesaji;
    }

}