
    public class Worker extends Person {
        private double hourlyPayRate;

        public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
            super(firstName, lastName, ID, title, YOB);
            this.hourlyPayRate = hourlyPayRate;
        }

        public double calculateWeeklyPay(double hoursWorked) {
            double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
            double overtimePay = Math.max(hoursWorked - 40, 0) * 1.5 * hourlyPayRate;
            return regularPay + overtimePay;
        }

        public String displayWeeklyPay(double hoursWorked) {
            double regularHours = Math.min(hoursWorked, 40);
            double overtimeHours = Math.max(hoursWorked - 40, 0);
            double regularPay = regularHours * hourlyPayRate;
            double overtimePay = overtimeHours * 1.5 * hourlyPayRate;
            double totalPay = regularPay + overtimePay;
            return "Regular Hours: " + regularHours + ", Regular Pay: $" + regularPay +
                    "\nOvertime Hours: " + overtimeHours + ", Overtime Pay: $" + overtimePay +
                    "\nTotal Pay: $" + totalPay;
        }
    }

