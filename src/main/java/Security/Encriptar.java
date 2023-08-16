
package Security;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;


public class Encriptar {
    //con MD5
    public static String secretKey = "unallaveParaProyecto"; //llave para encriptar y desencriptar

    
    public String ecnode(String secretKey, String cadena){ //encriptar
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5"); //tipo de incrptacion MD5
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));//arrelo de bytes tipo para asentos
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24); //copia del arrgelo anterior
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");//cifrado 
            cifrado.init(Cipher.ENCRYPT_MODE, key); //encriptar modo con la llave ya pasada al arreglo de bytes
            byte[] plainTextBytes = cadena.getBytes("utf-8");//cadena a incrptar a arreglo de bytes
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);//de 64 bytes al cifrado de la cadena
            encriptacion = new String(base64Bytes);//pasamos el arreglo de base 64 encriptado
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal al encriptar");
        }
        return encriptacion;
    }
    
    public String deecnode(String secretKey, String cadenaEncriptada){ //desencriptar lo mismo a la inversa
         String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5"); //tipo md5
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));//transforma areglo de bytes llave
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);//desencriptar y paso llave
            byte[] plainText = decipher.doFinal(message);//cadena desencriptada arreglo bytes
            desencriptacion = new String(plainText, "UTF-8"); //guardamos el arrelgo en la variable en UTP-8 en un String clave normal

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return desencriptacion;
    }
}
