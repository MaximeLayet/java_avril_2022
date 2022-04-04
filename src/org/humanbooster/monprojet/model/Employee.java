package org.humanbooster.monprojet.model;


import java.util.Objects;

public class Employee {
        private int id;
        private static int count = 0;
        private String firstName;
        private String lastName;
        private double salary;

        private Company company;
        private BankInfo bankInfo;
        private Status status;

    public Employee(String firstName, String lastName, double salary, Company company, BankInfo bankInfo, Status status) {
        this.id = ++count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
        this.bankInfo = bankInfo;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", company=").append(company);
        sb.append(", bankInfo=").append(bankInfo);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
