package com.example.demo;

import com.example.demo.domain.dto.FileControl;
import com.example.demo.domain.dto.FileHeader;
import com.example.demo.domain.dto.LotControl;
import com.example.demo.domain.dto.LotDetail;
import com.example.demo.domain.dto.LotHeader;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.InputValueSwitch;
import com.univocity.parsers.common.processor.RowProcessor;
import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStreamReader;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        parseAsobancariaFile2001();
    }

    public static void parseAsobancariaFile2001() {
        FixedWidthParserSettings settings = new FixedWidthParserSettings();
        settings.setRecordEndsOnNewline(true);
        settings.setSkipTrailingCharsUntilNewline(true);
        settings.trimValues(true);
        settings.setAutoConfigurationEnabled(true);
        settings.setHeaderExtractionEnabled(false);


        FixedWidthFields fileHeader = FixedWidthFields.forParsing(FileHeader.class);
        FixedWidthFields lotHeader = FixedWidthFields.forParsing(LotHeader.class);
        FixedWidthFields lotDetail = FixedWidthFields.forParsing(LotDetail.class);
        FixedWidthFields lotControl = FixedWidthFields.forParsing(LotControl.class);
        FixedWidthFields fileControl = FixedWidthFields.forParsing(FileControl.class);

        settings.addFormatForLookahead("01", fileHeader);
        settings.addFormatForLookahead("05", lotHeader);
        settings.addFormatForLookahead("06", lotDetail);
        settings.addFormatForLookahead("08", lotControl);
        settings.addFormatForLookahead("09", fileControl);

        final BeanListProcessor<FileHeader> fileHeaderProcessor = new BeanListProcessor<>(FileHeader.class);
        final BeanListProcessor<LotHeader> lotHeaderProcessor = new BeanListProcessor<>(LotHeader.class);
        final BeanListProcessor<LotDetail> lotDetailProcessor = new BeanListProcessor<>(LotDetail.class);
        final BeanListProcessor<LotControl> lotControlProcessor = new BeanListProcessor<>(LotControl.class);
        final BeanListProcessor<FileControl> fileControlProcessor = new BeanListProcessor<>(FileControl.class);

        InputValueSwitch inputValueSwitch = new InputValueSwitch(0) {
            private FileHeader currentFileHeader;
            private LotHeader currentLotHeader;

            @Override
            public void rowProcessorSwitched(RowProcessor from, RowProcessor to) {
                if (from == fileHeaderProcessor && to == lotHeaderProcessor) {
                    currentFileHeader = fileHeaderProcessor.getBeans().get(fileHeaderProcessor.getBeans().size() - 1);
                }

                if (from == lotHeaderProcessor && to == lotDetailProcessor) {
                    currentFileHeader.getLotHeader().addAll(lotHeaderProcessor.getBeans());
                    currentLotHeader = lotHeaderProcessor.getBeans().get(lotHeaderProcessor.getBeans().size() - 1);
                    lotHeaderProcessor.getBeans().clear();
                }

                if (from == lotDetailProcessor) {
                    currentLotHeader.getLotDetails().addAll(lotDetailProcessor.getBeans());
                    lotDetailProcessor.getBeans().clear();
                }

                if (from == lotControlProcessor) {
                    currentLotHeader.setLotControl(lotControlProcessor.getBeans().get(0));
                    lotControlProcessor.getBeans().clear();
                }

                if (from == fileControlProcessor) {
                    currentFileHeader.setFileControl(fileControlProcessor.getBeans().get(0));
                    fileControlProcessor.getBeans().clear();
                }

            }
        };

        inputValueSwitch.addSwitchForValue("01", fileHeaderProcessor);
        inputValueSwitch.addSwitchForValue("05", lotHeaderProcessor);
        inputValueSwitch.addSwitchForValue("06", lotDetailProcessor);
        inputValueSwitch.addSwitchForValue("08", lotControlProcessor);
        inputValueSwitch.addSwitchForValue("09", fileControlProcessor);

        settings.setProcessor(inputValueSwitch);
        inputValueSwitch.setDefaultSwitch(fileHeaderProcessor);

        FixedWidthParser parser = new FixedWidthParser(settings);
        parser.parse(new InputStreamReader(DemoApplication.class.getResourceAsStream("/asobancaria_test.txt")));

        fileHeaderProcessor.getBeans();
    }
}
