//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
        PriorityQueue cpu = new PriorityQueue(5);

        System.out.println("---Scheduling Tasks---");
        cpu.enqueue(30);
        cpu.enqueue(10);
        cpu.enqueue(50);
        cpu.enqueue(20);

        System.out.println("---Executing Tasks by Priority---");
        while(!cpu.isEmpty()){
            System.out.println("Cpu Processing Task: " + cpu.dequeue());
        }
	}
}
