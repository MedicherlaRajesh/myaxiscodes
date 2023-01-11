package MultilevelInheritance;

public class Student extends Branch {
    String studentName;
    String studentEmail;
    String studentPlace;
    int studentId;
    String studentPhoneNo;
    public Student(String studentName, String studentEmail, String studentPlace, int studentId, String studentPhoneNo, String branchName, int branchId, String collegeName,  long collegePhone, String collegeEmail, String collegePlace) {
        super(branchName, branchId, branchTotalstaff, collegeName, collegeAddress, collegePhone, collegeEmail, collegePlace);
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPlace = studentPlace;
        this.studentId = studentId;
        this.studentPhoneNo = studentPhoneNo;
    }
        public void showStudentDetails(){
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Email: " + this.studentEmail);
        System.out.println("Student Place: " + this.studentPlace);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Phone No: " + this.studentPhoneNo);
        }
        public void showAllDetails(){
            System.out.println("Student Name: " + studentName);
            System.out.println("Student Email: " + studentEmail);
            System.out.println("Student Place: " + studentPlace);
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Phone No: " + studentPhoneNo);
            System.out.println("Student college Name: " + collegeName);
            System.out.println("Student branch Name: " + branchName);
        }
        public void showCollege(){
            System.out.println("College Name: " + collegeName);
            System.out.println("College Address: " + collegeAddress);
            System.out.println("College Phone: " + collegePhone);
            System.out.println("College Email: " + collegeEmail);
            System.out.println("College Place: " + collegePlace);
        }
        public void showBranch(){
            System.out.println("Branch Name: " + branchName);
            System.out.println("Branch Id: " + branchId);
        }
        public static void main(String[] args){
            Student s = new Student("rajesh", "rajesh@gmail.com", "Amp", 569, "7995679844", "cse", 5, "bvc", 226298, "bvc@gmail.com", "amp");
            s.showStudentDetails();
            s.showAllDetails();
            s.showCollege();
            s.showBranch();
       }
}
