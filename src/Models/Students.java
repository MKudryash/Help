package Models;

public class Students {
    private int id_student;
    private int numberTheRecordBook;
    private String surname;
    private String name;
    private String group;
    private String department;
    private String discipline;
    private int mark;
    private String nameTeacher;

    public Students(int id_student, int numberTheRecordBook, String surname, String name, String group, String department, String discipline, int mark, String nameTeacher) {
        this.id_student = id_student;
        this.numberTheRecordBook = numberTheRecordBook;
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.department = department;
        this.discipline = discipline;
        this.mark = mark;
        this.nameTeacher = nameTeacher;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Id = " + id_student +
                ", Surname = '" + surname + '\'' +
                ", Name = '" + name + '\'' +
                ", Group = '" + group + '\'' +
                ", Department = '" + department + '\'' +
                ", Discipline = '" + discipline + '\'' +
                ", Mark = " + mark +
                ", TeacherName = '" + nameTeacher + '\'' +
                '}';
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getNumberTheRecordBook() {
        return numberTheRecordBook;
    }
}
