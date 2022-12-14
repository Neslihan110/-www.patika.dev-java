import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbGirisActions extends DatabaseActions {

    private String musteriNo = "", musteriTc = "";
    private int sifre = 0;
    public boolean girisKonrolEt(String musteriNo_orTc, int sifre) {
        String query = "SELECT musteriNo,tcNo,sifre FROM 'musteriler' WHERE (musteriNo = ? OR tcNo = ?) AND sifre = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, musteriNo_orTc);
            preparedStatement.setString(2, musteriNo_orTc);
            preparedStatement.setInt(3, sifre);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                this.musteriNo = rs.getString("musteriNo");
                this.musteriTc = rs.getString("tcNo");
                this.sifre = rs.getInt("sifre");
            }
            return (this.musteriNo.equals(musteriNo_orTc) || this.musteriTc.equals(musteriNo_orTc)) && this.sifre == sifre;
        } catch (SQLException ex) {
            Logger.getLogger(DbGirisActions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}