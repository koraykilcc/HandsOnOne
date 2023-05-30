package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.Map;



@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        return Collections.singletonMap("message", "Hello World feature!");//as

    }
}
