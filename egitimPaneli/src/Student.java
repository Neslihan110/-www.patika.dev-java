public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matVerbal, int matExam, int fizikVerbal, int fizikExam, int kimyaVerbal, int kimyaExam) {
        if (matVerbal >= 0 && matVerbal <= 100 && matExam >= 0 && matExam <= 100) {
            this.mat.verbalNote = matVerbal;
            this.mat.examNote = matExam;
        }
        if (fizikVerbal >= 0 && fizikVerbal <= 100 && fizikExam >= 0 && fizikExam <= 100) {
            this.fizik.verbalNote = fizikVerbal;
            this.fizik.examNote = fizikExam;
        }
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100 && kimyaExam >= 0 && kimyaExam <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
            this.kimya.examNote = kimyaExam;
        }
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.mat.verbalNote == 0 || this.fizik.examNote == 0 || this.fizik.verbalNote == 0 || this.kimya.examNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.examNote * this.fizik.examEffect) + (this.fizik.verbalNote * this.fizik.verbalEffect)) + ((this.kimya.examNote * this.kimya.examEffect) + (this.kimya.verbalNote * this.kimya.verbalEffect)) + ((this.mat.examNote * this.mat.examEffect) + (this.mat.verbalNote * this.mat.verbalEffect))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Matematik Yazılı Notu : " + this.mat.examNote);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Fizik Yazılı Notu : " + this.fizik.examNote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbalNote);
        System.out.println("Kimya Yazılı Notu : " + this.kimya.examNote);
    }

}
