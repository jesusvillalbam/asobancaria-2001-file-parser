package com.jesusvillalbam.asobancaria2001fileparser.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.fixed.FieldAlignment;

public class LotDetailV2001 {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 48)
    private String userPrincipalReference;
    @Parsed
    @FixedWidth(value = 14, alignment = FieldAlignment.RIGHT, padding = '0')
    private String collectValue;
    @Parsed
    @FixedWidth(value = 2)
    private String paymentProcedence;
    @Parsed
    @FixedWidth(value = 2)
    private String paymentType;
    @Parsed
    @FixedWidth(value = 6)
    private String operationNumber;
    @Parsed
    @FixedWidth(value = 6)
    private String authorizationNumber;
    @Parsed
    @FixedWidth(value = 3)
    private String financialInstitutionDebitedCode;
    @Parsed
    @FixedWidth(value = 4)
    private String branchOfficeCode;
    @Parsed
    @FixedWidth(value = 7)
    private String sequence;
    @Parsed
    @FixedWidth(value = 3)
    private String returnCause;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getUserPrincipalReference() {
        return userPrincipalReference;
    }

    public void setUserPrincipalReference(String userPrincipalReference) {
        this.userPrincipalReference = userPrincipalReference;
    }

    public String getCollectValue() {
        return collectValue;
    }

    public void setCollectValue(String collectValue) {
        this.collectValue = collectValue;
    }

    public String getPaymentProcedence() {
        return paymentProcedence;
    }

    public void setPaymentProcedence(String paymentProcedence) {
        this.paymentProcedence = paymentProcedence;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public String getFinancialInstitutionDebitedCode() {
        return financialInstitutionDebitedCode;
    }

    public void setFinancialInstitutionDebitedCode(String financialInstitutionDebitedCode) {
        this.financialInstitutionDebitedCode = financialInstitutionDebitedCode;
    }

    public String getBranchOfficeCode() {
        return branchOfficeCode;
    }

    public void setBranchOfficeCode(String branchOfficeCode) {
        this.branchOfficeCode = branchOfficeCode;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getReturnCause() {
        return returnCause;
    }

    public void setReturnCause(String returnCause) {
        this.returnCause = returnCause;
    }

    @Override
    public String toString() {
        return "LotDetailV2001{" +
                "recordType='" + recordType + '\'' +
                ", userPrincipalReference='" + userPrincipalReference + '\'' +
                ", collectValue='" + collectValue + '\'' +
                ", paymentProcedence='" + paymentProcedence + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", operationNumber='" + operationNumber + '\'' +
                ", authorizationNumber='" + authorizationNumber + '\'' +
                ", financialInstitutionDebitedCode='" + financialInstitutionDebitedCode + '\'' +
                ", branchOfficeCode='" + branchOfficeCode + '\'' +
                ", sequence='" + sequence + '\'' +
                ", returnCause='" + returnCause + '\'' +
                '}';
    }
}
