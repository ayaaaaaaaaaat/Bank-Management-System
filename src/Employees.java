public class Employees extends User{

    // attributes

    protected String address ;
    protected char position ;
    protected String graduatedCollage;
    protected int yearOfGraduation;
    protected String totalGrade ;

    // constructor(s)

    public Employees(String firstName, String lastName , String username , String phone , String password , String id , String address , char position , String graduatedCollage, int yearOfGraduation, String totalGrade){
        super(firstName,lastName,username,phone,password,id);
        this.address = address;
        this.totalGrade = totalGrade;
        this.position = position;
        this.graduatedCollage = graduatedCollage;
        this.yearOfGraduation = yearOfGraduation;
    }

    // method(s)

    public int editPersonalInformation(int number){  // address and position only
        //
        return -1;
    }

    public boolean createClientAccount(){ // feh parameters bta3 el client's information
        //
        return false;
    }

    //public Client searchForClient(String name){ // by name or account number

    //}

    public boolean deleteClientAccount(){
        //
        return false;
    }
}
