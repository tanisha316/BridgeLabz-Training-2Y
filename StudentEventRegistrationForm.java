import java.util.*;
public class StudentEventRegistrationForm {
    
class Participant<T>{
    private T rollnumber;
    private String name;
    private String branch;
    
    public Participant(T rollnumber, String name, String branch){
        this.rollnumber=rollnumber;
        this.name=name;
        this.branch=branch;
    }
    public T getParticipantA(){
        return rollnumber;
    }
    public String getParticipantB(){
        return name;
    }
    public String getParticipantC(){
        return branch;
    }

    public void displayParticipantinfo(){
        System.out.println("Name-"+name+"roll number-"+rollnumber+"branch-"+branch);
    }
}
    public static void main(/**/){
        ArrayList<String> participants= new ArrayList<>();
        participants.add("ishaan");
        participants.add("mayank");
        participants.add("hina");

        LinkedList<String> queue =new LinkedList<> ();
    queue.add("riya");
    queue.add("adit");
    queue.add("isha");
    System.out.println("initial queue"+ queue);
    queue.removeFirst();
    System.out.println("after removing first"+queue);
    queue.addLast("payal");
    System.out.println("after adding last"+ queue);

    Set<String> rollno= new HashSet<>();
        rollno.add("12");
        rollno.add("14");
    }
}
