package com.lightningducks.sustainableswaps.webcontroller;

import com.lightningducks.sustainableswaps.controllers.WebController;
import org.junit.Assert;
import org.junit.Test;

public class WebControllerTest {

    @Test
    public void testA3Camryn() {
        WebController webController = new WebController();
        String content = webController.A3Camryn();
        Assert.assertNotNull(content);
    }
}
