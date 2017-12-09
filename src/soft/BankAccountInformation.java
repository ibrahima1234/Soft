/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft;

/**
 *
 * @author Imane
 */
public class BankAccountInformation {
    private String RIB;
    private String bankAccountNumber;
    private String bankName;
    
    public BankAccountInformation(String RIB, String bankAccountNumber, String bankName) {
        this.RIB = RIB;
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    // implement toString()
}
