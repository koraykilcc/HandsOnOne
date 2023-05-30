package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        String input1 = "password1";
        String input2 = "password2";

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash1 = md.digest(input1.getBytes());
        byte[] hash2 = md.digest(input2.getBytes());

        System.out.println("Hash1: " + new String(hash1));
        System.out.println("Hash2: " + new String(hash2));
        return Collections.singletonMap("message", "Hello World feature!");//as

    }
}
