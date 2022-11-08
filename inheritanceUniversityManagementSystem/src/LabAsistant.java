public class LabAsistant extends Asistant {
    public LabAsistant(String nameSurname, String mpNo, String eposta, String episode, String degree, String officeClock) {
        super(nameSurname, mpNo, eposta, episode, degree, officeClock);
    }

    public void labEnter(){
        System.out.println(getNameSurname() + " laboratuvara girdi !");
    }
}