package Utility;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import org.monte.screenrecorder.ScreenRecorder;

public class TakeVideo {
	
	public static ScreenRecorder takeVideo(ScreenRecorder screenRecorder)throws Exception{
		//initialize the graphics configuration
		GraphicsConfiguration gconfig = GraphicsEnvironment
		         .getLocalGraphicsEnvironment()
		         .getDefaultScreenDevice()
		         .getDefaultConfiguration();
		
		screenRecorder = new ScreenRecorder(gconfig,
		         new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey,MIME_AVI),
		         new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f, KeyFrameIntervalKey, (int) (15 * 60)),
		         new Format(MediaTypeKey, MediaType.VIDEO,EncodingKey,"black",FrameRateKey, Rational.valueOf(30)), null);
		return screenRecorder;
	}
	
}
