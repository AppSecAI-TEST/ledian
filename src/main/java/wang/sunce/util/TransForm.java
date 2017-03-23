package wang.sunce.util;

/**
 * Created by Sunce on 2017/3/20 0020.
 */


import java.io.File;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransForm {
    private static Logger logger = LoggerFactory.getLogger(TransForm.class);


    public static void main(String[] args) {
        String src = "E:/ideaProject/ledian.rar";
        encodeBase64String(src);

//		String src2 = "E:/ideaProject/work.rar.txt";
//		decodeBase64(src2, ".rar");

    }

    public static void encodeBase64String(String src){
        try {
            logger.info("readFile {}", src);
            File file = new File(src);
            String parent = file.getParent();
            String name = file.getName();
            byte[] binaryData = FileUtils.readFileToByteArray(file) ;
            String value = Base64.encodeBase64String(binaryData);
            File desc = new File(parent, name+".txt");
            logger.info("writeStringToFile {}", desc);
            FileUtils.writeStringToFile(desc, value, "UTF-8");
        } catch (IOException e) {
            logger.error("encodeBase64String error", e);
        }
    }

    public static void decodeBase64(String src, String extName){
        try {
            logger.info("readFile {}", src);
            File file = new File(src);
            String parent = file.getParent();
            String name = file.getName();
            String readFileToString = FileUtils.readFileToString(file, "UTF-8");
            byte[] decodeBase64 = Base64.decodeBase64(readFileToString);
            File desc = new File(parent, name + extName);
            logger.info("writeByteToFile {}", desc);
            FileUtils.writeByteArrayToFile(desc, decodeBase64);
        } catch (IOException e) {
            logger.error("decodeBase64 error", e);
        }
    }

}

