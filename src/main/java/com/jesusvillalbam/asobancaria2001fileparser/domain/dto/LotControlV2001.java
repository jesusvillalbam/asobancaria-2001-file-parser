package com.jesusvillalbam.asobancaria2001fileparser.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Parsed;

public class LotControlV2001 {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 9)
    private String totalLotRecords;
    @Parsed
    @FixedWidth(value = 18)
    private String totalValueCollectedInLot;
    @Parsed
    @FixedWidth(value = 4)
    private String lotNumber;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getTotalLotRecords() {
        return totalLotRecords;
    }

    public void setTotalLotRecords(String totalLotRecords) {
        this.totalLotRecords = totalLotRecords;
    }

    public String getTotalValueCollectedInLot() {
        return totalValueCollectedInLot;
    }

    public void setTotalValueCollectedInLot(String totalValueCollectedInLot) {
        this.totalValueCollectedInLot = totalValueCollectedInLot;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    @Override
    public String toString() {
        return "LotControlV2001{" +
                "recordType='" + recordType + '\'' +
                ", totalLotRecords='" + totalLotRecords + '\'' +
                ", totalValueCollectedInLot='" + totalValueCollectedInLot + '\'' +
                ", lotNumber='" + lotNumber + '\'' +
                '}';
    }
}
