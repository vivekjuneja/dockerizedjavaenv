package sparkexample;

import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Service 1 says VIVEK JUNEJA... TESTING:) ";
        });
    }
}
