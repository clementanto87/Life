package com.example.dynamoDB.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.dynamoDB.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public Animal saveAnimal(Animal animal) {
        mapper.save(animal);
        return animal;
    }

    public Animal getAnimalById(String personId) {
        return mapper.load(Animal.class, personId);
    }

    public String deleteAnimal(Animal animal) {
        mapper.delete(animal);
        return "Delete successful!!";
    }

    public String updateAnimal(Animal animal) {
        mapper.save(animal, dynamoDBSaveExpression(animal));
        return "Update Successful!!";
    }
    private DynamoDBSaveExpression dynamoDBSaveExpression(Animal animal) {
        DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
        Map<String, ExpectedAttributeValue> map = new HashMap<>();
        map.put("personId", new ExpectedAttributeValue(new AttributeValue().withS(animal.getPersonId())));
        dynamoDBSaveExpression.setExpected(map);
        return dynamoDBSaveExpression;
    }
}
