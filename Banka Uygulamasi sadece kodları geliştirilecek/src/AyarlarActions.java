import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.ImageIcon;

public class AyarlarActions extends  Actions{

    Ayarlar ayarlarEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SifreYenilemeEkrani sifreyenilemeEkrani = null;


    public AyarlarActions(Ayarlar ayarlarEkrani)
    {
        setAyarlar(ayarlarEkrani);
    }

    public void setAyarlar(Ayarlar ayarlarEkrani)
    {
        this.ayarlarEkrani = ayarlarEkrani;
    }

    public Ayarlar ayarlarEkrani() {
        if (ayarlarEkrani == null) {
            ayarlarEkrani = new Ayarlar();
        }
        return ayarlarEkrani;
    }

    public SifreYenilemeEkrani sifreyenilemeEkrani()
    {
        if(sifreyenilemeEkrani == null)
        {
            sifreyenilemeEkrani = new SifreYenilemeEkrani();
        }
        return sifreyenilemeEkrani;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == ayarlarEkrani().telnodegistirIcon())
        {
            ayarlarEkrani().telnodegistirIcon().setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource())));
        }

        if(e.getSource() == ayarlarEkrani().sifredegistirIcon())
        {
            sifreyenilemeEkrani();
            ayarlarEkrani().getAyarlarFrame().setVisible(false);
        }
    }
}