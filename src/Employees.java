public class Employees extends User{
    protected String address ;
    protected char position ;
    protected String graduatedCollage;
    protected int yearOfGraduation;
    protected String totalGrade ;
    public Employees(String firstName, String lastName , String username , String phone , String password , String id , String address , char position , String graduatedCollage, int yearOfGraduation, String totalGrade){
        super(firstName,lastName,username,phone,password,id);
        this.address = address;
        this.totalGrade = totalGrade;
        this.position = position;
        this.graduatedCollage = graduatedCollage;
        this.yearOfGraduation = yearOfGraduation;
    }
}
