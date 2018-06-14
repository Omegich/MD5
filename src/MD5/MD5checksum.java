package MD5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

public class MD5checksum {
	
	public static void main(String[] args) {
	}

    private File file;

    public MD5checksum(String filePath) {
        this.file = new File(filePath);
    }

    public MD5checksum(File file) {
        this.file = file;
    }

    public String getMD5() {
        String md5 = null;

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(this.file);

            md5 = DigestUtils.md5Hex(IOUtils.toByteArray(fileInputStream));

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();            
        }

        return md5;
    }
}