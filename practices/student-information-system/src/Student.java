public class Student {
    String name, stuNo;
    int classes;
    Course mat, fizik, kimya;
    double avarage, averageMat, averageFizik, averageKimya, fizikVerbalPer, matVerbalPer, kimyaVerbalPer;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matVerbalPer = 0.3;
        this.fizikVerbalPer = 0.2;
        this.kimyaVerbalPer = 0.5;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalNote = matVerbal;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.verbalNote = fizikVerbal;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.verbalNote == 0 ||
                this.fizik.note == 0 || this.fizik.verbalNote == 0 ||
                this.kimya.note == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            System.out.println("Ortalama Mat : " + this.averageMat);
            System.out.println("Ortalama Fizik : " + this.averageFizik);
            System.out.println("Ortalama Kimya : " + this.averageKimya);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.averageMat = (this.mat.verbalNote * this.matVerbalPer) + (this.mat.note * (1 - this.matVerbalPer));
        this.averageFizik = (this.fizik.verbalNote * this.fizikVerbalPer) + (this.fizik.note * (1 - this.fizikVerbalPer));
        this.averageKimya = (this.kimya.verbalNote * this.kimyaVerbalPer) + (this.kimya.note * (1 - this.kimyaVerbalPer));
        this.avarage = (this.averageMat + this.averageFizik + this.averageKimya) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
    }

}