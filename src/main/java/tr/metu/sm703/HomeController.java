package tr.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileInputStream;
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
    @GET
    @Path("/images/{image}")
    @Produces("images/*")
    public Response getImage(@javax.ws.rs.PathParam("image") String image) {
        File file = new File("resources/images/", image); //Weak point

        if (!file.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(new FileInputStream(file)).build();
    }
    @Get
    public Map<String, Object> index() {
        generateSecretToken();
        return Collections.singletonMap("message", "Hello World feature!");//as

    }
}
