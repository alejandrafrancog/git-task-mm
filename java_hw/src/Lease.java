import java.util.Scanner;

public class Lease {
    private double totalLeasedMoney, downPayment,interestRate;
    private int leaseTerm;
    public Lease() {
    }
    public double calculateMonthlyPayment(double totalLeasedMoney, double downPayment, int leaseTerm, double interestRate) {
        return ((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) * (interestRate / 100))) / leaseTerm;
    }
    public void setTotalLeasedMoney(double totalLeasedMoney) {
        this.totalLeasedMoney = totalLeasedMoney;
    }
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public double getTotalLeasedMoney() {
        return totalLeasedMoney;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getLeaseTerm() {
        return leaseTerm;
    }


    public static void main(String[] args) {
        Lease lease = new Lease();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total leased money: ");
        lease.setTotalLeasedMoney(scanner.nextDouble());

        System.out.print("Enter down payment: ");
        lease.setDownPayment(scanner.nextDouble());

        System.out.print("Enter interest rate: ");
        lease.setInterestRate(scanner.nextDouble());

        System.out.print("Enter lease term: ");
        lease.setLeaseTerm(scanner.nextInt());

        System.out.printf("=======================================\nMonthly payment: %.3f \n",(lease.calculateMonthlyPayment(lease.getTotalLeasedMoney(),lease.getDownPayment(),lease.getLeaseTerm(),lease.getInterestRate())));
    }

}
