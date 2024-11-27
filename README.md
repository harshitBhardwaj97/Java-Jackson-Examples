# Java Jackson Examples

This project demonstrates how to use Jackson for serializing and deserializing Java objects. It includes examples of
converting POJOs to JSON and vice versa
using Jackson's `ObjectMapper`.

## Features

- **POJO to JSON Serialization**: Converts Java objects to JSON strings.
- **JSON to POJO Deserialization**: Converts JSON strings back into Java objects.
- **Collection Handling**: Supports serialization and deserialization of `List`, `Set`, and `Map`.
- **Custom Date Formatting**: Demonstrates how Jackson handles date fields with customized formats.

## Key Classes and Methods

- `JacksonJSONServiceImpl`: Implements `JacksonJSONService` interface for JSON conversion. Provides methods for
  converting between POJOs and JSON.
    - `convertPOJOToJsonString(Object object)`: Converts a Java object to JSON.
    - `convertJsonStringToPOJO(String json, Class<T> clazz)`: Converts a JSON string back into a Java object.