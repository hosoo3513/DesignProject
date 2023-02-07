package SogangUniv.DesignProject;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class MicrophoneRecorderTest {

    @Test
    public void microphoneTest() throws Exception {
        MicrophoneRecorder mr = new MicrophoneRecorder(new AudioFormat(16000, 16, 1, true, false));
        mr.start();
        // 5초간 마이크에서 목소리를 저장하는 시간
        Thread.sleep(5 * 1000);
        mr.stop();
        //Stream을 audioInputStream에 넣는 시간
        Thread.sleep(1000);

        File file = new File("test.wav");
        AudioSystem.write(mr.getAudioInputStream(), AudioFileFormat.Type.WAVE, file);
    }
}