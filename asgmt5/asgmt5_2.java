import java.util.List;

import javax.security.auth.Subject;

public class asgmt5_2 {
    public static void main(String[] args) {
        // Student kim = new Student();

        Subject fp0001 = new Subject(0, "elective", "FP0001", "지도교수상담", 0, "공학교육인증과정 대상학부의 인증과정 및 비인증과정 학생의 " +
        "지도교수는 인증프로그램 교육 목표, 학습성과, 교과영역 등의 전반적인 내용에 대한 상담을 통하여 원활한 대학생활을 할 수 있도록 지도한다.");
        Subject cs0005 = new Subject(1, "essential", "CS0005", "논리회로", 3, "기본 논리 Gate와 조합 논리 회로를 다루고 " + 
        "부울 함수의 간략화 및 플리플롭을 기초로 한 순차 논리 회로를 다루며 Counter와 Register에 대하여 배우고 실습한다.");
        Subject cs0007 = new Subject(1, "essential", "CS0007", "창의공학설계입문", 2, "프로젝트 기반의 접근방법을 통해, " + 
        "팀별 작업과 고객 지향적 설계 프로젝트를 효과적으로 수행하기 위한 개념설계 방법 및 프로젝트 관리도구들을 응용하는 방법에 대하여 며 개의 예제를 " + 
        "통해 알아본다. 또한, 설계 프로젝트 결과 보고 방법, 팀원의 활동 및 공학도로서의 윤리에 대해서도 알아본다.");

        Student kim = new Student();
        String[] abc = {"fp0001", "cs0005", "cs0007"};
        kim.setInfo("kim", 20201364 ,3.56, abc);

        System.out.println("name: " + kim.name);
        kim.printSubjects();
    }
    
}

class Student {
    String name;
    int studentID;
    double gpa;
    // List<Subject> subjects;
    Subject[] subjects = new Subject[3];

    void setInfo(String name, int studentID, double gpa, Subject[] subjects)
    {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
        this.subjects = subjects;
    }

    void printSubjects()
    {
        for (Subject subject : this.subjects)
        {
            System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            System.out.println("subject name: " + subject.getSubjectName());
            System.out.println("subject code: " + subject.getSubjectCode());
            System.out.println("grade: " + subject.getGrade());
            System.out.println("credit: " + subject.getCredit());
            System.out.println("Description: " + subject.getSubjectDescr());
        }
    }
}
class Professor{
    String name;
    int profeccorID;
    List<Subject> subjects;

    String getName() {return name;}
    int getID() {return profeccorID;}
    List<Subject> getSubjects() {return subjects;}
}

class Subject{
    private int grade;
    private String essential_or_elective;
    private String subjectCode;
    private String subjectName;
    private int credit;
    private String subjectDescr;

    Subject(int grade, String essential_or_elective, String subjectCode, String subjectName, int credit, String subjectDescr)
    {
        this.grade = grade;
        this.essential_or_elective = essential_or_elective;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credit = credit;
        this.subjectDescr = subjectDescr;    
    }

    int getGrade() { return this.grade;}
    String getEssential() { return this.essential_or_elective;}
    String getSubjectCode() { return this.subjectCode;}
    String getSubjectName() { return this.subjectName;}
    int getCredit() {return this.credit;}
    String getSubjectDescr() {return this.subjectDescr;}


}
