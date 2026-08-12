package service;

public class Java implements ICourse{
    public Java() {
        System.out.println("Java constructor is called");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java Course is purchased and fee paid is" + amount);
        return true;
    }
}
