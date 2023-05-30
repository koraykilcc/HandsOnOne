package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.Map;
import java.util.Random;


@Controller
public class HomeController {
    String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }
    @Get
    public Map<String, Object> index() {
        generateSecretToken();
        return Collections.singletonMap("message", "Hello World feature!");//as

    }
}
