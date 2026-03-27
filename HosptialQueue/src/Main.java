//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
        ERPriorityQueue er = new ERPriorityQueue();

        er.admitPatient("John (Flu)", 3);
        er.admitPatient("Sarah (Broken Arm)", 2);
        er.showWaitingRoom();
        er.admitPatient("Mike (Chest Pain)", 1);
        er.admitPatient("Anna (Sprained Ankle)", 3);

        er.showWaitingRoom();

        er.treatPatient();
        er.showWaitingRoom();
	}
}
