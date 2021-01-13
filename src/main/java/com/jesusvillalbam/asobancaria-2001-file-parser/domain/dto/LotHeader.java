package com.example.demo.domain.dto;

import com.univocity.parsers.annotations.FixedWidth;
import com.univocity.parsers.annotations.Headers;
import com.univocity.parsers.annotations.Parsed;

import java.util.ArrayList;
import java.util.List;

public class LotHeader {

    @Parsed
    @FixedWidth(value = 2)
    private String recordType;
    @Parsed
    @FixedWidth(value = 13)
    private String collectServiceCode;
    @Parsed
    @FixedWidth(value = 4)
    private String lotNumber;
    private List<LotDetail> lotDetails = new ArrayList<>();
    private LotControl lotControl;

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

    public List<LotDetail> getLotDetails() {
        return lotDetails;
    }

    public void setLotDetails(List<LotDetail> lotDetails) {
        this.lotDetails = lotDetails;
    }

    public LotControl getLotControl() {
        return lotControl;
    }

    public void setLotControl(LotControl lotControl) {
        this.lotControl = lotControl;
    }
}
