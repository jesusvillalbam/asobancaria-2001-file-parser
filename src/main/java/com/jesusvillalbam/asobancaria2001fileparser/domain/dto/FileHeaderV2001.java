package com.jesusvillalbam.asobancaria2001fileparser.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Headers;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.fixed.FieldAlignment;

import java.util.ArrayList;
import java.util.List;

@Headers
public class FileHeaderV2001 {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 10, alignment = FieldAlignment.RIGHT, padding = '0')
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
    private List<LotHeaderV2001> lotHeader = new ArrayList<>();
    private FileControlV2001 fileControl;

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

    public List<LotHeaderV2001> getLotHeader() {
        return lotHeader;
    }

    public void setLotHeader(List<LotHeaderV2001> lotHeader) {
        this.lotHeader = lotHeader;
    }

    public FileControlV2001 getFileControl() {
        return fileControl;
    }

    public void setFileControl(FileControlV2001 fileControl) {
        this.fileControl = fileControl;
    }

    @Override
    public String toString() {
        return "FileHeaderV2001{" +
                "recordType='" + recordType + '\'' +
                ", collectCompanyNIT='" + collectCompanyNIT + '\'' +
                ", collectDate='" + collectDate + '\'' +
                ", collectEntityCode='" + collectEntityCode + '\'' +
                ", receivingCustomerAccountNumber='" + receivingCustomerAccountNumber + '\'' +
                ", fileDateGeneration='" + fileDateGeneration + '\'' +
                ", fileHourGeneration='" + fileHourGeneration + '\'' +
                ", fileModificator='" + fileModificator + '\'' +
                ", accountType='" + accountType + '\'' +
                ", lotHeader=" + lotHeader +
                ", fileControl=" + fileControl +
                '}';
    }
}
