package domain.collections;

import com.fasterxml.jackson.core.JsonProcessingException;
import service.impl.JacksonJSONServiceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionSerializationDemo {

    // 1. Define collections as constants
    public static final List<String> fruits = List.of("Apple", "Banana", "Cherry");
    public static final Set<String> uniqueFruits = new HashSet<>(Set.of("Apple", "Banana", "Cherry"));
    public static final Map<String, String> fruitColors = Map.of(
            "Apple", "Red",
            "Banana", "Yellow",
            "Cherry", "Red"
    );

    public static void main(String[] args) throws JsonProcessingException {
        final var jacksonJSONServiceImpl = new JacksonJSONServiceImpl();

        // 2. Example of serializing and deserializing a List
        System.out.println("#############################");
        System.out.println("Starting List serialization and deserialization...");
        System.out.println("Original List:");
        System.out.println(fruits);

        // Serialize List to JSON
        String listJson = jacksonJSONServiceImpl.convertPOJOToJsonString(fruits);
        System.out.println("Serialized List to JSON:");
        System.out.println(listJson);

        // Deserialize JSON back to List
        List<String> deserializedList = jacksonJSONServiceImpl.convertJsonStringToPOJO(listJson, List.class);
        System.out.println("Deserialized List from JSON:");
        System.out.println(deserializedList);

        System.out.println("#############################");

        // 3. Example of serializing and deserializing a Set
        System.out.println("Starting Set serialization and deserialization...");
        System.out.println("Original Set:");
        System.out.println(uniqueFruits);

        // Serialize Set to JSON
        String setJson = jacksonJSONServiceImpl.convertPOJOToJsonString(uniqueFruits);
        System.out.println("Serialized Set to JSON:");
        System.out.println(setJson);

        // Deserialize JSON back to Set
        Set<String> deserializedSet = jacksonJSONServiceImpl.convertJsonStringToPOJO(setJson, Set.class);
        System.out.println("Deserialized Set from JSON:");
        System.out.println(deserializedSet);

        System.out.println("#############################");

        // 4. Example of serializing and deserializing a Map
        System.out.println("Starting Map serialization and deserialization...");
        System.out.println("Original Map:");
        System.out.println(fruitColors);

        // Serialize Map to JSON
        String mapJson = jacksonJSONServiceImpl.convertPOJOToJsonString(fruitColors);
        System.out.println("Serialized Map to JSON:");
        System.out.println(mapJson);

        // Deserialize JSON back to Map
        Map<String, String> deserializedMap = jacksonJSONServiceImpl.convertJsonStringToPOJO(mapJson, Map.class);
        System.out.println("Deserialized Map from JSON:");
        System.out.println(deserializedMap);

        System.out.println("Serialization and deserialization completed.");
        System.out.println("#############################");
    }
}
