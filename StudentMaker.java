package Facade;

public class StudentMaker {

    private Student itStd;
    private Student engStd;

    public StudentMaker() {
        if (itStd == null) {
            itStd = new ITStudent();
        }
        if (engStd == null) {
            engStd = new EngineerStudent();
        }

    }
    
    public void viewItStudent(){
        itStd.view();
        
    }
    public void viewEngStudnet(){
        engStd.view();
    }
}
