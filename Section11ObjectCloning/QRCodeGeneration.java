/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section11ObjectCloning;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Lucky_Rathod
 */
public class QRCodeGeneration {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        String details = "Lucky Rathod";
        
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        
        File f = new File("F:\\Learning java\\Telusko_185\\QrCodeGenerationProgramOutput\\MyQROutput.JPG");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
        
    }
    
}
