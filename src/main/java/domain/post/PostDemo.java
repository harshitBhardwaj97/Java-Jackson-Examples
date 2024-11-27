package domain.post;

import com.fasterxml.jackson.core.JsonProcessingException;
import service.impl.JacksonJSONServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class PostDemo {
    private static final Post postOne = new Post();
    private static final String postJson = """
            {
              "tags" : [ {
                "id" : 1,
                "name" : "Spring Boot"
              } ],
              "postedAt" : "2024-11-27 20:26:41",
              "lastUpdatedAt" : "2024-11-27 20:26:41",
              "id" : 200,
              "title" : "Spring Boot",
              "description" : "Post about Spring Boot",
              "content" : "content here"
            }
            """;

    public static void main(String[] args) throws JsonProcessingException {
        final var jacksonJSONServiceImpl = new JacksonJSONServiceImpl();

        System.out.println("#############################");
        System.out.println("Starting Post creation and JSON conversion...");

        // Set values to the postOne object
        postOne.setTitle("Jackson JSON API Guide");
        postOne.setId(100L);
        postOne.setDescription("Post about Jackson JSON API");
        postOne.setContent("HTML content here");

        final Set<Tag> tags = new HashSet<>();
        Tag java = new Tag(1L, "Java");
        Tag jackson = new Tag(2L, "Jackson");
        Tag json = new Tag(3L, "JSON");
        tags.add(java);
        tags.add(jackson);
        tags.add(json);

        postOne.setTags(tags);

        // Print the Post object before serialization
        System.out.println("Post object before serialization:");
        System.out.println(postOne);

        // Convert Post object to JSON
        System.out.println("#############################");
        System.out.println("Serializing Post object to JSON...");
        String jsonString = jacksonJSONServiceImpl.convertPOJOToJsonString(postOne);
        System.out.println("Serialized Post object as JSON:");
        System.out.println(jsonString);

        System.out.println("#############################");
        System.out.println("Starting deserialization of JSON to POJO...");

        // Deserialize the postJson string back into a Post object
        Post deserializedPost = jacksonJSONServiceImpl.convertJsonStringToPOJO(postJson, Post.class);

        // Log the deserialized Post object
        System.out.println("Deserialized Post object from JSON:");
        System.out.println(deserializedPost);

        System.out.println("JSON to Post POJO conversion completed.");
        System.out.println("#############################");
    }
}
