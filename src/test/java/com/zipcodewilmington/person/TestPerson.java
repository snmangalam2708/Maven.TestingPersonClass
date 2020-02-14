package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNewAttributes() {
        // Given

        Person person = new Person();
        Integer expectedAge = 37;
        String expectedName = "David";
        String expectedWeight = "85.7 lb";
        String expectedEyeColor = "green";
        String expectedGender = "male";
        Double expectedShoeSize = 8.5;
        String expectedHeight = "5' 8''";

        // When
        person.setName(expectedName);
        person.setAge(expectedAge);
        person.setWeight(expectedWeight);
        person.setEyeColor(expectedEyeColor);
        person.setGender(expectedGender);
        person.setShoeSize(expectedShoeSize);
        person.setHeight(expectedHeight);


        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualWeight = person.getWeight();
        String actualEyeColor = person.getEyeColor();
        String actualGender = person.getGender();
        Double actualShoeSize = person.getShoeSize();
        String actualHeight = person.getHeight();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedHeight, actualHeight);
    }

}
