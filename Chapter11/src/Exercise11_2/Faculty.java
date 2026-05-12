package Exercise11_2;

import Utils.MyDate;

public class Faculty extends Employee {
    private double officeHours;
    private String rank;


    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
                   double officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
