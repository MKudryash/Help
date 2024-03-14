package Models;

public class TargetDepartment extends Students {

    private String nameTargetCompany;
    private int theAmountOfTraining;

    public TargetDepartment(int id_student, int numberTheRecordBook, String surname, String name, String group, String department, String discipline, int mark, String nameTeacher) {
        super(id_student, numberTheRecordBook, surname, name, group, department, discipline, mark, nameTeacher);
        this.nameTargetCompany = nameTargetCompany;
        this.theAmountOfTraining = theAmountOfTraining;
    }


    public String getNameTargetCompany() {
        return nameTargetCompany;
    }

    public void setNameTargetCompany(String nameTargetCompany) {
        this.nameTargetCompany = nameTargetCompany;
    }

    public int getTheAmountOfTraining() {
        return theAmountOfTraining;
    }

    public void setTheAmountOfTraining(int theAmountOfTraining) {
        this.theAmountOfTraining = theAmountOfTraining;
    }
}
