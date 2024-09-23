public class Main {
    public static void main(String[] args) {
        double MaintenanceCostofsummer = 400.00;
        double MaintenanceCostofFall = 600.00;
        double MaintenanceCostofWinter = 230.00;
        double MaintenanceCostofSpring = 670.00;
        double yearlyMaintenanceCost = MaintenanceCostofsummer+ MaintenanceCostofFall+MaintenanceCostofWinter+MaintenanceCostofSpring;
        System.out.println("The yearly maintenance cost is the sum of "+ MaintenanceCostofsummer + ", "+ MaintenanceCostofFall+ ", "+ MaintenanceCostofWinter + " and "+ MaintenanceCostofSpring + " is "+ yearlyMaintenanceCost);
    }
}
