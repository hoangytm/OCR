package execute;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


import java.io.File;

/**
 * @author PhanHoang
 * 5/25/2020
 */
public class Main {
    public static void main(String[] args) throws TesseractException {
        File image = new File("D:\\JAVA\\hoangytm\\asset\\handwritting.jpg");
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("D:\\JAVA\\hoangytm\\tessdata");
        tesseract.setLanguage("vie");
        tesseract.setPageSegMode(1);
        tesseract.setOcrEngineMode(1);
        String result = tesseract.doOCR(image);
        System.out.println(result);
    }

}
