/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.*;

/**
 *
 * @author Lucas
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws Exception {
        // open the sound file as a Java input stream
        String gongFile = "/Users/al/DevDaily/Projects/MeditationApp/resources/gong.au";
        InputStream in = new FileInputStream(gongFile);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
