package builder.mode1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ResponseDirector director = new ResponseDirector(new ResponseBuilder());
        ResponseEntity<String> entity = director.create(200, new HashMap<>(), "builder mode");
        System.out.println(entity.toString());
    }
}
