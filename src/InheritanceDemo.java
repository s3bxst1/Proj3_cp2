import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        //Making 3 workers
        workers.add(new Worker("Bilbo", "Baggins", "000001", "Esq.", 1200, 15.0));
        workers.add(new Worker("Aragorn", "Strider", "000002", "Esq.", 1201, 50.0));
        workers.add(new Worker("Gandalf", "The Grey", "000003", "Wizard", 1999, 100.0));

        // Making 3 salaried workers
        workers.add(new SalaryWorker("Will", "Juergens", "000004", "Mr.", 2003, 120000.0));
        workers.add(new SalaryWorker("Drew", "Hammond", "000005", "Miss.", 2002, 45000.0));
        workers.add(new SalaryWorker("Casey", "Brooks", "000006", "Miss.", 2003, 60000.0));

        // Adding pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");

            for (Worker worker : workers) {
                double hoursWorked = 40;
                if (week == 2) {
                    hoursWorked = 50;
                }

                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }

            System.out.println();
        }
    }
}
