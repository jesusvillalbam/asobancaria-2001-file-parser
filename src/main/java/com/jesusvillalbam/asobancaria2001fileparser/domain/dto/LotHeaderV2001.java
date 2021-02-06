package com.jesusvillalbam.asobancaria2001fileparser.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Parsed;

import java.util.ArrayList;
import java.util.List;

public class LotHeaderV2001 {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 13)
    private String collectServiceCode;
    @Parsed
    @FixedWidth(value = 4)
    private String lotNumber;
    private List<LotDetailV2001> lotDetails = new ArrayList<>();
    private LotControlV2001 lotControl;

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getCollectServiceCode() {
        return collectServiceCode;
    }

    public void setCollectServiceCode(String collectServiceCode) {
        this.collectServiceCode = collectServiceCode;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public List<LotDetailV2001> getLotDetails() {
        return lotDetails;
    }

    public void setLotDetails(List<LotDetailV2001> lotDetails) {
        this.lotDetails = lotDetails;
    }

    public LotControlV2001 getLotControl() {
        return lotControl;
    }

    public void setLotControl(LotControlV2001 lotControl) {
        this.lotControl = lotControl;
    }

    @Override
    public String toString() {
        return "LotHeaderV2001{" +
                "recordType='" + recordType + '\'' +
                ", collectServiceCode='" + collectServiceCode + '\'' +
                ", lotNumber='" + lotNumber + '\'' +
                ", lotDetails=" + lotDetails +
                ", lotControl=" + lotControl +
                '}';
    }
}
