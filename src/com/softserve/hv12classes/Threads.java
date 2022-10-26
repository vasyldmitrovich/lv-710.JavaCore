package hv12classes;

public class Threads extends Thread {

    private String message ;
    private String message2;

    public String getMessage() {
        return message;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public Threads() {


    }
    public Threads(String message, String message2) {
        this.message = message;
        this.message2 = message2;

    }

    public Threads( String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Threads{" +
                "message='" + message + '\'' +
                ", message2='" + message2 + '\'' +
                '}';
    }

    public void run() {

        System.out.println(message+" "+message2);



    }
}
