package com.example.validateform.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 45, message = "Điền 2 - 45 ký tự")
    @NotNull(message = "Không được để trống")
    private String firstName;

    @Size(min = 2, max = 45, message = "Điền 2 - 45 ký tự")
    @NotNull(message = "Không được để trống")
    private String lastName;


    @Size(min = 10, max = 11, message = "Phải nhập 10 hoặc 11 số")
    @NotNull(message = "Không được để trống")
    @Pattern(regexp = "^0.*$", message = "Phải bắt đầu bằng số 0")
    @Pattern(regexp = "^$|[0-9]*$", message = "Chỉ được nhập số")
    private String phoneNumber;

    @Min(value = 18, message = "Phải là người 18 tuổi trở lên")
    @NotNull(message = "Không được để trống")
    private int age;

    @Email(message = "Email không hợp lệ")
    @NotNull(message = "Không được để trống")
    private String email;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
