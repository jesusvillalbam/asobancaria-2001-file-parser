package com.example.demo.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Headers;
import com.univocity.parsers.annotations.Nested;
import com.univocity.parsers.annotations.Parsed;

import java.util.ArrayList;
import java.util.List;

@Headers
public class FileHeader {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 10)
    private String collectCompanyNIT;
    @Parsed
    @FixedWidth(value = 8)
    private String collectDate;
    @Parsed
    @FixedWidth(value = 3)
    private String collectEntityCode;
    @Parsed
    @FixedWidth(value = 17)
    private String receivingCustomerAccountNumber;
    @Parsed
    @FixedWidth(value = 8)
    private String fileDateGeneration;
    @Parsed
    @FixedWidth(value = 4)
    private String fileHourGeneration;
    @Parsed
    @FixedWidth(value = 1)
    private String fileModificator;
    @Parsed
    @FixedWidth(value = 2)
    private String accountType;
    private List<LotHeader> lotHeader = new ArrayList<>();
    private FileControl fileControl;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getCollectCompanyNIT() {
        return collectCompanyNIT;
    }

    public void setCollectCompanyNIT(String collectCompanyNIT) {
        this.collectCompanyNIT = collectCompanyNIT;
    }

    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(String collectDate) {
        this.collectDate = collectDate;
    }

    public String getCollectEntityCode() {
        return collectEntityCode;
    }

    public void setCollectEntityCode(String collectEntityCode) {
        this.collectEntityCode = collectEntityCode;
    }

    public String getReceivingCustomerAccountNumber() {
        return receivingCustomerAccountNumber;
    }

    public void setReceivingCustomerAccountNumber(String receivingCustomerAccountNumber) {
        this.receivingCustomerAccountNumber = receivingCustomerAccountNumber;
    }

    public String getFileDateGeneration() {
        return fileDateGeneration;
    }

    public void setFileDateGeneration(String fileDateGeneration) {
        this.fileDateGeneration = fileDateGeneration;
    }

    public String getFileHourGeneration() {
        return fileHourGeneration;
    }

    public void setFileHourGeneration(String fileHourGeneration) {
        this.fileHourGeneration = fileHourGeneration;
    }

    public String getFileModificator() {
        return fileModificator;
    }

    public void setFileModificator(String fileModificator) {
        this.fileModificator = fileModificator;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<LotHeader> getLotHeader() {
        return lotHeader;
    }

    public void setLotHeader(List<LotHeader> lotHeader) {
        this.lotHeader = lotHeader;
    }

    public FileControl getFileControl() {
        return fileControl;
    }

    public void setFileControl(FileControl fileControl) {
        this.fileControl = fileControl;
    }
}
