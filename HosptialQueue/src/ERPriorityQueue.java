public class ERPriorityQueue {
    static class Patient{
        String name;
        int priority;
        Patient next;

        Patient(String name, int priority){
            this.name = name;
            this.priority = priority;
            this.next = null;
        }
    }

    private Patient head;

    public void admitPatient(String name, int priority) {
        Patient newPatient = new Patient(name, priority);

        if (head == null || priority < head.priority) {
            newPatient.next = head;
            head = newPatient;
            System.out.println("Admitting " + name + " to the front (Priority: " + priority + ")");
        } else {
            Patient current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newPatient.next = current.next;
            current.next = newPatient;
            System.out.println("Adding: " + name + " to the line (Priority " + priority +")");

        }
    }

    public void treatPatient(){
        if(head == null){
            System.out.println("Empty Waiting room.");
            return;
        }
            System.out.println("Now treating: " + head.name);
            head = head.next;
    }

    public void showWaitingRoom(){
        Patient temp = head;
        System.out.println("\n---Current Waiting Room Order---\n");
        while(temp != null){
            System.out.print("[" + temp.name + "| Priority: " + temp.priority + " ] -> ");
            temp = temp.next;
        }
        System.out.println("None\n");
    }
}
