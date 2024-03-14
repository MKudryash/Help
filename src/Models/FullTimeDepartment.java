package Models;

public class FullTimeDepartment extends Students {
    private int ballUSE;
    private double avgBallCertificate;

    public FullTimeDepartment(int id_student, int numberTheRecordBook, String surname, String name, String group, String department, String discipline, int mark, String nameTeacher) {
        super(id_student, numberTheRecordBook, surname, name, group, department, discipline, mark, nameTeacher);
        this.ballUSE = ballUSE;
        this.avgBallCertificate = avgBallCertificate;
    }


    public int getBallUSE() {
        return ballUSE;
    }

    public void setBallUSE(int ballUSE) {
        this.ballUSE = ballUSE;
    }

    public double getAvgBallCertificate() {
        return avgBallCertificate;
    }

    public void setAvgBallCertificate(double avgBallCertificate) {
        this.avgBallCertificate = avgBallCertificate;
    }
}
