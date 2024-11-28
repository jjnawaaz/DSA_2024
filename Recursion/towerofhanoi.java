package Recursion;

public class towerofhanoi {

    public static void towerofhanoi(int disks, String Source, String Helper, String Destination) {
        if (disks == 1) {
            System.out.println("The disk " + disks + " moved from " + Source + " to " + Destination);
            return;
        }
        towerofhanoi(disks - 1, Source, Destination, Helper);
        System.out.println("The disk " + disks + " moved from " + Source + " to " + Destination);
        towerofhanoi(disks - 1, Helper, Source, Destination);
    }

    public static void main(String[] args) {
        int disks = 3;
        towerofhanoi(disks, "Source", "Helper", "Destination");
    }
}
