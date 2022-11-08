public class Asistant extends Aceemician{
    private String officeClock;

    public Asistant(String nameSurname, String mpNo, String eposta, String episode, String degree, String officeClock){
        super(nameSurname, mpNo, eposta, episode, degree);
        this.officeClock = officeClock;
    }

    public String getOfficeClock(){
        return officeClock;
    }

    public void setOfficeClock(String officeClock){
        this.officeClock = officeClock;
    }

    public void takeQuiz(){
        System.out.println(this.getNameSurname() + " quiz yaptı !");
    }
}

