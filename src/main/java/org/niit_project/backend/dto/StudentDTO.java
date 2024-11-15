package org.niit_project.backend.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "users")
@Data
public class StudentDTO {

    @Id
    private String id;

    @NotNull(message = "first name cannot be empty")
    private String firstName;

    @NotNull(message = "last name cannot be empty")
    private String lastName;

    @NotNull(message = "password cannot be null or empty")
    private String password;

    @NotNull(message = "email  cannot be empty")
    @Indexed(unique = true)
    private String email;

    private String profile;

    @NotNull(message = "phone number cannot be empty")
    @Indexed(unique = true)
    private String phoneNumber;

    private String counselorId;

    private LocalDateTime createdAt;

    private List<String> books;

    private List<String> courses;

    private List<String> channels;

    public StudentDTO(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getChannels() {
        return channels;
    }

    public String getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(String counselorId) {
        this.counselorId = counselorId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public @NotNull(message = "phone number cannot be empty") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotNull(message = "phone number cannot be empty") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public @NotNull(message = "email  cannot be empty") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "email  cannot be empty") String email) {
        this.email = email;
    }

    public @NotNull(message = "last name cannot be empty") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "last name cannot be empty") String lastName) {
        this.lastName = lastName;
    }

    public @NotNull(message = "first name cannot be empty") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull(message = "first name cannot be empty") String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "password cannot be null or empty") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "password cannot be null or empty") String password) {
        this.password = password;
    }
}
