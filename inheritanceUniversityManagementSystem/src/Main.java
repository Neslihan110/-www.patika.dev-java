public class Main {
    public static void main(String[] args) {

                Aceemician a1 = new Aceemician("Ahmet Kum", "05070000000", "Ahmetkum@gmail.com", "CENG", "Doç.");
                a1.login();
                a1.attendClass();
                Officer o1 = new Officer("Mehmet Kum", "05530000000", "mehmetkum@gmail.com", "kitchen", "chef");
                o1.login();
                o1.work();
                o1.diningHall();
                Lecturer l1 = new Lecturer("İbrahim Kum", "05350000000", "ibrahimkum@gmail.com", "Math", "Dr.", 2);
                System.out.println(l1.getNameSurname() + " kapı numarası : " + l1.getDoorNumber());
                Asistant as1 = new Asistant("Fatih Tekin", "05340000000", "ftekin@gmail.com", "ENG", "Assistant", "08.00 - 17.00");
                System.out.println(as1.getNameSurname() + " çalışma saatleri : " + as1.getOfficeClock());
                Computing c1 = new Computing("SunaŞensoy", "05360000000", "sensoysuna@gmail.com", "computing", "officer", "network");
                System.out.println(c1.getNameSurname() + " görevi : " + c1.getTask());
                SecurityOfficer so1 = new SecurityOfficer("Onur Avci", "05340000000", "onuravcj@gmail.com", "security", "officer", "security");
                so1.bout();
                LabAsistant la1 = new LabAsistant("Serdar Avci", "05340000000", "srdrvc@gmail.com", "FZK", "Assistant", "08.00 - 17.00");
                la1.labEnter();
            }
        }
