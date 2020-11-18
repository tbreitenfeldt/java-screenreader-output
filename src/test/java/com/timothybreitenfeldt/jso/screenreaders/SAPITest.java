package com.timothybreitenfeldt.jso.screenreaders;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SAPITest {

    private SAPI sapi = new SAPI();

    @Test
    void testIsRunning() {
        if (SAPITest.isWindows()) {
            Assertions.assertTrue(sapi.isRunning());
        } else {
            Assertions.assertFalse(this.sapi.isRunning());
        }
    }

    @Test
    void testSpeakString() {
        fail("Not yet implemented");
    }

    @Test
    void testSpeakStringBoolean() {
        fail("Not yet implemented");
    }

    @Test
    void testSilence() {
        fail("Not yet implemented");
    }

    @Test
    void testSAPI() {
        fail("Not yet implemented");
    }

    @Test
    void testWaitUntilDoneLong() {
        fail("Not yet implemented");
    }

    @Test
    void testWaitUntilDone() {
        fail("Not yet implemented");
    }

    @Test
    void testSpeakWaitString() {
        fail("Not yet implemented");
    }

    @Test
    void testSpeakWaitStringBoolean() {
        fail("Not yet implemented");
    }

    @Test
    void testGetVoices() {
        fail("Not yet implemented");
    }

    @Test
    void testGetVoice() {
        fail("Not yet implemented");
    }

    @Test
    void testSetVoice() {
        fail("Not yet implemented");
    }

    @Test
    void testGetRate() {
        fail("Not yet implemented");
    }

    @Test
    void testSetRate() {
        fail("Not yet implemented");
    }

    @Test
    void testGetPitch() {
        fail("Not yet implemented");
    }

    @Test
    void testSetPitch() {
        fail("Not yet implemented");
    }

    @Test
    void testGetVolume() {
        fail("Not yet implemented");
    }

    @Test
    void testSetVolume() {
        fail("Not yet implemented");
    }

    @Test
    void testScreenreader() {
        fail("Not yet implemented");
    }

    @Test
    void testBraille() {
        fail("Not yet implemented");
    }

    @Test
    void testOutputStringBoolean() {
        fail("Not yet implemented");
    }

    @Test
    void testOutputString() {
        fail("Not yet implemented");
    }

    @Test
    void testGetName() {
        fail("Not yet implemented");
    }

    @Test
    void testObject() {
        fail("Not yet implemented");
    }

    @Test
    void testGetClass() {
        fail("Not yet implemented");
    }

    @Test
    void testHashCode() {
        fail("Not yet implemented");
    }

    @Test
    void testEquals() {
        fail("Not yet implemented");
    }

    @Test
    void testClone() {
        fail("Not yet implemented");
    }

    @Test
    void testToString() {
        fail("Not yet implemented");
    }

    @Test
    void testNotify() {
        fail("Not yet implemented");
    }

    @Test
    void testNotifyAll() {
        fail("Not yet implemented");
    }

    @Test
    void testWait() {
        fail("Not yet implemented");
    }

    @Test
    void testWaitLong() {
        fail("Not yet implemented");
    }

    @Test
    void testWaitLongInt() {
        fail("Not yet implemented");
    }

    @Test
    void testFinalize() {
        fail("Not yet implemented");
    }

    private static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("windows");
    }

}
