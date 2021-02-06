package com.jesusvillalbam.asobancaria2001fileparser.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.fixed.FieldAlignment;

public class FileControlV2001 {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 9, alignment = FieldAlignment.RIGHT, padding = '0')
    private String totalFileRecords;
    @Parsed
    @FixedWidth(value = 18, alignment = FieldAlignment.RIGHT, padding = '0')
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

    @Override
    public String toString() {
        return "FileControlV2001{" +
                "recordType='" + recordType + '\'' +
                ", totalFileRecords='" + totalFileRecords + '\'' +
                ", totalValueCollectedInFile='" + totalValueCollectedInFile + '\'' +
                '}';
    }
}
