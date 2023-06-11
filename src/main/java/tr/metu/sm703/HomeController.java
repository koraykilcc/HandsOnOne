package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        String PASSWORD="123444";
        Scanner myObj = new Scanner(System.in);
        String userId = myObj.nextLine();

        String sqlQuery = "select * from tbluser where userId = " + userId;
        return Collections.singletonMap("message", "Hello World producti!");
    }
}
