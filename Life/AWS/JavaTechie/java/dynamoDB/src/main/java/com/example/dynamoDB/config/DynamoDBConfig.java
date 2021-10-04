package com.example.dynamoDB.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Bean
    public DynamoDBMapper mapper() {
        return new DynamoDBMapper(amazonDynamoDBConfig());
    }

    private AmazonDynamoDB amazonDynamoDBConfig() {
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIA447VVTWY46BYDNGS", "uIn3IHAvj0DvL8hIg+sKua1yGP326HozgcfZSgQD"))).build();
    }
}
