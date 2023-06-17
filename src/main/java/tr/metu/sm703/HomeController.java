package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() throws NoSuchPaddingException, NoSuchAlgorithmException {
        String password="password";
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        return Collections.singletonMap("message", "Hello World feature2!");

    }
}
