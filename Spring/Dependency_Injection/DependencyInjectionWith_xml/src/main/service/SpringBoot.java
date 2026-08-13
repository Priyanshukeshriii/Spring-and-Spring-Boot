package service;

public class SpringBoot implements ICourse {
    public SpringBoot() {
        System.out.println("SpringBoot constructor is called");
    }


    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring boot Course is purchased and fee paid is" + amount);
        return true;
    }
}
