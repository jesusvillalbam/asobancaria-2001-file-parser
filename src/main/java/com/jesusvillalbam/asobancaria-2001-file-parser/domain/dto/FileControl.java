package com.example.demo.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Parsed;

public class FileControl {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 9)
    private String totalFileRecords;
    @Parsed
    @FixedWidth(value = 18)
    private String totalValueCollectedInFile;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getTotalFileRecords() {
        return totalFileRecords;
    }

    public void setTotalFileRecords(String totalFileRecords) {
        this.totalFileRecords = totalFileRecords;
    }

    public String getTotalValueCollectedInFile() {
        return totalValueCollectedInFile;
    }

    public void setTotalValueCollectedInFile(String totalValueCollectedInFile) {
        this.totalValueCollectedInFile = totalValueCollectedInFile;
    }
}
