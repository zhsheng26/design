package builder.mode2;

public class Main {
    public static void main(String[] args) {
        ResponseEntity<String> body = new ResponseEntity.ResponseBuilder()
                .putHeader("name", "andy")
                .code(404)
                .body("builder mode2");
        System.out.println(body.toString());
    }
}
