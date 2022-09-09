package com.tekgs.nextgen.ctrlintelligence.view.errorpage;

import org.softwareonpurpose.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups={GauntletTest.Application.CTRL_INTELLIGENCE, GauntletTest.View.ERROR_PAGE})
public class ErrorPageViewTest extends GauntletTest {

    public void smoke(){
        ErrorPageViewExpected expected = ErrorPageViewExpected.getInstance();
        ErrorPageViewActual actual = ErrorPageViewActual.directNav();

        then(ErrorPageViewCalibrator.getInstance(expected, actual));
    }
}
