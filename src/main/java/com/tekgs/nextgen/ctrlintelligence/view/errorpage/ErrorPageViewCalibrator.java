package com.tekgs.nextgen.ctrlintelligence.view.errorpage;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class ErrorPageViewCalibrator extends Calibrator {

    private ErrorPageViewExpected expected;
    private ErrorPageViewActual actual;


    public ErrorPageViewCalibrator(ErrorPageViewExpected expected, ErrorPageViewActual actual) {
        super(description, expected, actual);
    }

    public static ErrorPageViewCalibrator getInstance(ErrorPageViewExpected expected, ErrorPageViewActual actual) {
    }

    @Override
    protected void executeVerifications() {
        verify("Error Page Verification", expected.getErrorText(), actual.getErrorText());
    }
}
