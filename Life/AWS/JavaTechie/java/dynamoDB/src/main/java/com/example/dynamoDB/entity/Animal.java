package com.example.dynamoDB.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "person")
public class Animal implements Serializable {
    @DynamoDBHashKey(attributeName = "personId")
    @DynamoDBAutoGeneratedKey
    @DynamoDBAttribute
    private String personId;
    @DynamoDBAttribute
    private String personName;
    @DynamoDBAttribute
    private int age;
    @DynamoDBAttribute
    private String emailId;
}
