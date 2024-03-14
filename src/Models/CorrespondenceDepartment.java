package Models;

public class CorrespondenceDepartment extends Students{

    private String company;
    private String post;
    private int theAmountOfTraining;

    public CorrespondenceDepartment(int id_student, int numberTheRecordBook, String surname, String name, String group, String department, String discipline, int mark, String nameTeacher) {
        super(id_student, numberTheRecordBook, surname, name, group, department, discipline, mark, nameTeacher);
        this.company = company;
        this.post = post;
        this.theAmountOfTraining = theAmountOfTraining;
    }


    public int getTheAmountOfTraining() {
        return theAmountOfTraining;
    }

    public void setTheAmountOfTraining(int theAmountOfTraining) {
        this.theAmountOfTraining = theAmountOfTraining;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
