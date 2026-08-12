package service;

public class SpringBoot implements ICourse {
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java Course is purchased and fee paid is" + amount);
        return true;
    }
}
