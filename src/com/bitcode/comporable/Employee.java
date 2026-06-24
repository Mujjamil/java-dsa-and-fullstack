package com.bitcode.comporable;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String eName;
    private int eAge;
    public Employee(int empId, String eName, int eAge) {
        this.empId = empId;
        this.eName = eName;
        this.eAge = eAge;
    }

    @Override
    public int compareTo(Employee e){
        //return this.empId-e.empId;
        return this.eName.compareTo(eName);
    };


}
