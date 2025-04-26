# Tushare API Java SDK

A Java SDK for interacting with the Tushare API, providing easy access to Chinese financial market data.

## Features

- Simple and intuitive API interface
- Type-safe data models
- Efficient HTTP client implementation
- Comprehensive error handling

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Installation

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>cn.initialfire</groupId>
    <artifactId>tushare-api</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Usage

```java
// Initialize the client
TushareClient client = new TushareClient("YOUR_API_TOKEN");

// Example: Get stock basic information
StockBasicRequest request = new StockBasicRequest();
StockBasicResponse response = client.execute(request);
```

## Building from Source

1. Clone the repository
2. Run `mvn clean install`

## License

This project is licensed under the MIT License - see the LICENSE file for details. 