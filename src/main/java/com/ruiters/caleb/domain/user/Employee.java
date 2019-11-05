package com.ruiters.caleb.domain.user;

public class Employee {
    private String empId, firstName, lastName;

    private Employee() { }

    private Employee(Builder builder) {
        this.empId = builder.empId;
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String empId, firstName, lastName;

        public Builder EmployeeId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder EmployeeFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder EmployeeLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(String empId) {
            this.empId = empId;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
