package MultilevelInheritance;

public class Branch extends college{
    String branchName;
    int branchId;
    static int branchTotalstaff;


    public Branch(String branchName, int branchId, int branchTotalstaff, String collegeName,  String collegeAddress, long collegePhone, String collegeEmail, String collegePlace) {
        super(collegeName, collegeAddress, collegePhone, collegeEmail, collegePlace);
        this.branchName = branchName;
        this.branchId = branchId;
    }

}
