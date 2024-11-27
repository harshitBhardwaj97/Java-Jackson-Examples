package domain.car;

import com.fasterxml.jackson.core.JsonProcessingException;
import service.impl.JacksonJSONServiceImpl;

public class CarDemo {

    private final static Car blackSuv = new Car("black", CarType.SUV);
    private final static Car blueSedan = new Car("blue", CarType.SEDAN);

    private final static String yellowSedanJson = """
            {
                "color" : "yellow",
                "type" : "SEDAN"
            }
            """;

    private final static String greenTruckJson = """
            {
                "color" : "green",
                "type" : "TRUCK"
            }
            """;

    public static void main(String[] args) throws JsonProcessingException {
        final var jacksonJSONServiceImpl = new JacksonJSONServiceImpl();
        System.out.println("Starting JSON to Car POJO and Car POJO to JSON conversions...");

        // Convert blackSuv POJO to JSON
        System.out.println("#############################");
        System.out.println("Black SUV POJO - ");
        System.out.println(blackSuv);

        var blackSuvJson = jacksonJSONServiceImpl.convertPOJOToJsonString(blackSuv);
        System.out.println("Black SUV JSON - ");
        System.out.println(blackSuvJson);

        // Convert blueSedan POJO to JSON
        System.out.println("#############################");
        System.out.println("Blue Sedan POJO - ");
        System.out.println(blueSedan);

        var blueSedanJson = jacksonJSONServiceImpl.convertPOJOToJsonString(blueSedan);
        System.out.println("Blue Sedan JSON - ");
        System.out.println(blueSedanJson);

        // Convert yellowSedanJson to POJO
        System.out.println("#############################");
        System.out.println("Deserializing yellowSedanJson to POJO...");

        Car yellowSedan = jacksonJSONServiceImpl.convertJsonStringToPOJO(yellowSedanJson, Car.class);
        System.out.println("Deserialized yellowSedan POJO - ");
        System.out.println(yellowSedan);

        // Convert greenTruckJson to POJO
        System.out.println("#############################");
        System.out.println("Deserializing greenTruckJson to POJO...");

        Car greenTruck = jacksonJSONServiceImpl.convertJsonStringToPOJO(greenTruckJson, Car.class);
        System.out.println("Deserialized greenTruck POJO - ");
        System.out.println(greenTruck);

        System.out.println("JSON to Car POJO and Car POJO to JSON conversions completed.");
        System.out.println("#############################");
    }
}
