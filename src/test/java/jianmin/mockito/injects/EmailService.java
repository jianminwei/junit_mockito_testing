package jianmin.mockito.injects;

public class EmailService implements Service{
    @Override
    public boolean send(String msg) {
        System.out.println("Sending email");
        return true;
    }
}
