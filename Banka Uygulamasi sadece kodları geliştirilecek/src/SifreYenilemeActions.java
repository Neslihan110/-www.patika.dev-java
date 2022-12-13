import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class SifreYenilemeActions extends Actions{

    SifreYenilemeEkrani sifreyenilemeEkrani = null;
    Ayarlar ayarlarEkrani = null;



    public SifreYenilemeActions(SifreYenilemeEkrani sifreyenilemeEkrani)
    {
        setSifreYenilemeEkrani(sifreyenilemeEkrani);
    }

    public void setSifreYenilemeEkrani(SifreYenilemeEkrani sifreyenilemeEkrani)
    {
        this.sifreyenilemeEkrani = sifreyenilemeEkrani;
    }

    public SifreYenilemeEkrani sifreyenilemeEkrani() {
        if (sifreyenilemeEkrani == null) {
            sifreyenilemeEkrani = new SifreYenilemeEkrani();
        }
        return sifreyenilemeEkrani;
    }

    public Ayarlar ayarlarEkrani ()
    {
        if(ayarlarEkrani == null)
        {
            ayarlarEkrani = new Ayarlar();
        }
        return ayarlarEkrani;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sifreyenilemeEkrani().sifreyenileButton())
        {

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == sifreyenilemeEkrani().geriLabel()) {
            ayarlarEkrani();
            sifreyenilemeEkrani().getSifreYenilemeFrame().setVisible(false);
        }
    }
}