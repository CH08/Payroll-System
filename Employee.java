/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author harde
 */
public abstract class Employee {
    private int empId;
    private String name;
    private Vehicle vehicle;
    public Employee(){
        System.out.println(".. inside default constructor");
        empId=0;
        name="";
    }
    public Employee (int pEmpId, String pName, Vehicle pV){
        System.out.println(".. inside Employee non-default constructor");
        empId=pEmpId;
        name=pName;
        this.vehicle=pV;
    }
    public Employee (int pEmpId, String pName, String pPlate, String pColour){
        System.out.println(".. inside Employee non-default contructor");
        empId=pEmpId;
        name=pName;
        this.vehicle = new Vehicle(pPlate, pColour);
    }
    public abstract double calculatePay();
    

    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
