package MainApp;


import service.ICourse;

public class Coder { //target Class

    public Coder(ICourse iCourse) {
        this.iCourse = iCourse;
        System.out.println("Coder Parameterized constructor is called");

    }
    public Coder() {
        System.out.println("Coder constructor is called");
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;
    public Boolean buyTheCourse(double amount){
        return iCourse.getTheCourse(amount);
    }
}
