/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

import java.util.Date;

/**
 *
 * @author Imane
 */
public class Employee {
    private String familyName;
    private String firstName;
    private WorkingSchedule workingSchedule;
    private String CIN;
    private BankAccountInformation bankAccountInformation;
    private Date birthday;
    private String department;
    private String phoneNumber;
    private double hourlyRate;
    private Date dateOfPayment;
    private String SSN;
    private String status;
    private Date hiringDate;
    private String maritalStatus;
    private double holidayRate;
    private double holidayPayment;
    private int totalNumberOfLeavingDays;
    private double incentive;
    private double transport;
    private double retirementFee;
    
    public Employee(String familyName, String firstName, WorkingSchedule workingSchedule, String CIN, BankAccountInformation bankAccountInformation, Date birthday, String department, String phoneNumber, double hourlyRate, Date dateOfPayment, String SSN, String status, Date hiringDate, String maritalStatus, double holidayRate, double holidayPayment, int totalNumberOfLeavingDays, double incentive, double transport, double retirementFee) {
    this.familyName = familyName;
    this.firstName = firstName;
    this.workingSchedule = workingSchedule; // fill this class
    this.CIN = CIN;
    this.bankAccountInformation = bankAccountInformation; // fill this class 
    this.birthday = birthday;
    this.department = department; 
    this.phoneNumber = phoneNumber;
    this.hourlyRate = hourlyRate;
    this.dateOfPayment = dateOfPayment;
    this.SSN = SSN;
    this.status = status;
    this.hiringDate = hiringDate;
    this.maritalStatus = maritalStatus;
    this.holidayRate = holidayRate;
    this.holidayPayment = holidayPayment;
    this.totalNumberOfLeavingDays = totalNumberOfLeavingDays;
    this.incentive = incentive;
    this.transport = transport;
    this.retirementFee = retirementFee;
    
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public WorkingSchedule getWorkingSchedule() {
        return workingSchedule;
    }

    public void setWorkingSchedule(WorkingSchedule workingSchedule) {
        this.workingSchedule = workingSchedule;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public BankAccountInformation getBankAccountInformation() {
        return bankAccountInformation;
    }

    public void setBankAccountInformation(BankAccountInformation bankAccountInformation) {
        this.bankAccountInformation = bankAccountInformation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public double getHolidayRate() {
        return holidayRate;
    }

    public void setHolidayRate(double holidayRate) {
        this.holidayRate = holidayRate;
    }

    public double getHolidayPayment() {
        return holidayPayment;
    }

    public void setHolidayPayment(double holidayPayment) {
        this.holidayPayment = holidayPayment;
    }

    public int getTotalNumberOfLeavingDays() {
        return totalNumberOfLeavingDays;
    }

    public void setTotalNumberOfLeavingDays(int totalNumberOfLeavingDays) {
        this.totalNumberOfLeavingDays = totalNumberOfLeavingDays;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    public double getRetirementFee() {
        return retirementFee;
    }

    public void setRetirementFee(double retirementFee) {
        this.retirementFee = retirementFee;
    }
    
    public void printInvoice() {
        // might need modifications
     
    }
    
    @Override 
    public String toString() {
        return "First name:" + this.firstName + "\nLast name:" + this.familyName + "\nWorking Schedule" + this.workingSchedule.toString() + "\nCIN:" + this.CIN + "Bank account information:" + this.bankAccountInformation.toString() + "\nBirthday:" + this.birthday.toString() + "\nDepartment:" + this.department + "\nPhone number:" + this.phoneNumber + "\nHourly rate:" + this.hourlyRate + "\nDate of payment:" + this.dateOfPayment.toString() + "\nSSN:" + this.SSN + "\nStatus:" + this.status + "\nHiring date:" + this.hiringDate.toString() + "\nMarital status:" + this.maritalStatus + "\nHoliday rate:" + this.holidayRate + "\nHoliday payment:" + this.holidayPayment + "\nTotal number of leaving days:" + this.totalNumberOfLeavingDays + "\nIncentive:" + this.incentive + "\nTransport:" + this.transport + "\nRetirement fee:" + this.retirementFee;
    }
   }

