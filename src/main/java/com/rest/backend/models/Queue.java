package com.rest.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@Document(collection = "queue")
@AllArgsConstructor
@NoArgsConstructor
public class Queue {
    @Id
    private ObjectId id;
    @Field
    private String name;
    @Field
    private String surname;
    @Field
    private String middleName;
    @Field
    @Indexed(unique = true)
    private String email;
    @Field
    @Indexed(unique = true)
    private String phoneNumber;
    @Field
    private LocalDate data;
    @Field
    private String time;
    @Field
    private String checkNumber;
    @Field
    private short service;

    public Queue(String name, String surname, String middleName, String email, String phoneNumber, LocalDate data, String time, String checkNumber, short service) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.data = data;
        this.time = time;
        this.checkNumber = checkNumber;
        this.service = service;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public short getService() {
        return service;
    }

    public void setService(short service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", data=" + data +
                ", time='" + time + '\'' +
                ", checkNumber='" + checkNumber + '\'' +
                ", service=" + service +
                '}';
    }
}
