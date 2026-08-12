package service;

public class Java implements ICourse{

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Hibernate Course is purchased and fee paid is" + amount);
        return true;
    }
}
