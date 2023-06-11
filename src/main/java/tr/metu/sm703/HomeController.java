package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        String query = String.format("SELECT secret FROM Users WHERE (username = '%s' AND NOT role = 'admin')", username);
// Execute query and return the results
        // Get username from parameters
        String username = request.getParameter("username");
// Create a statement from database connection
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        return Collections.singletonMap("message", "Hello World producti!");
    }
}
