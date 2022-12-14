import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;

public final class GirisEkraniActions extends Actions {

    private DbGirisActions dbGirisActions = null;
    private String musteriNo_orTc;
    private int sifre;

    public GirisEkraniActions(GirisEkrani girisEkrani) {
        setGirisEkrani(girisEkrani);
    }

    public void setGirisEkrani(GirisEkrani girisEkrani) {
        this.girisEkrani = girisEkrani;
    }

    public DbGirisActions getDbGirisActions() {
        if (dbGirisActions == null) {
            dbGirisActions = new DbGirisActions();
        }
        return dbGirisActions;
    }

    @Override
    public void focusGained(FocusEvent e) {
        super.focusGained(e);
        if (sourceController().textSource(girisEkrani().getMusteriNo_TcNoText())) {
            if (girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("T.C. No / Müşteri No")) {
                girisEkrani().getMusteriNo_TcNoText().setText("");
            } else {
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.gray);
            }
        }
        if (sourceController().textSource(girisEkrani().getSifreText())) {
            if (girisEkrani().getSifreText().getText().trim().equals("**********")) {
                girisEkrani().getSifreText().setText("");
            } else {
                girisEkrani().getSifreText().setForeground(Color.gray);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        super.focusLost(e);

        if (sourceController().textSource(girisEkrani().getMusteriNo_TcNoText())) {
            if (girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("")) {
                girisEkrani().getMusteriNo_TcNoText().setText("T.C. No / Müşteri No");
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.gray);
            } else {
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.black);
            }

        }
        if (sourceController().textSource(girisEkrani().getSifreText())) {
            if (girisEkrani().getSifreText().getText().trim().equals("")) {
                girisEkrani().getSifreText().setText("**********");
                girisEkrani().getSifreText().setForeground(Color.gray);
            } else {
                girisEkrani().getSifreText().setForeground(Color.black);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if (sourceController().labelSource(girisEkrani().getSifremiUnuttumLabel())) {
            girisEkrani().getGirisEkraniFrame().setVisible(false);
            SifreYenilemeEkrani sifreYenilemeEkrani = new SifreYenilemeEkrani();
            sifreYenilemeEkrani.getEskiSifreText().setBackground(Color.black);
            sifreYenilemeEkrani.getEskiSifreText().setEditable(false);
            sifreYenilemeEkrani.getSifreYenilemeFrame().setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceController().buttonSource(girisEkrani().getGirisButton())) {

            if (alanlarDolumu()) {
                musteriNo_orTc = girisEkrani().getMusteriNo_TcNoText().getText().trim();
                sifre = Integer.valueOf(girisEkrani().getSifreText().getText().trim());
                if (getDbGirisActions().girisKonrolEt(musteriNo_orTc, sifre)) {
                    girisEkrani().getGirisEkraniFrame().setVisible(false);
                    getSingletonMusteri().setMusteriNo_Tc(musteriNo_orTc);
                    kullaniciHesapEkrani();
                } else {
                    uyariMesajlari().uyariMesajiGoster(girisEkrani().getGirisEkraniFrame(), "Giriş bilgileri doğru değildir!");
                    textleriBosalt();
                }
            } else {
                uyariMesajlari().uyariMesajiGoster(girisEkrani().getGirisEkraniFrame(), "Giriş bilgileri boş olamaz!");
            }

        }
        if (sourceController().buttonSource(girisEkrani().getBasvuruButton())) {
            basvuruEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/
    }

    public boolean alanlarDolumu() {
        return !(girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("T.C. No / Müşteri No")
                || girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("")
                || girisEkrani().getSifreText().getText().trim().equals("**********")
                || girisEkrani().getSifreText().getText().trim().equals(""));
    }

    public void textleriBosalt() {
        girisEkrani().getMusteriNo_TcNoText().setText("T.C. No / Müşteri No");
        girisEkrani().getMusteriNo_TcNoText().setForeground(Color.gray);
        girisEkrani().getSifreText().setText("**********");
        girisEkrani().getSifreText().setForeground(Color.gray);
    }
}