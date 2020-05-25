package com.ensemble.lombokDemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @NotNull(message = "Employee ID cannot be null")
    private int empId;
    @NotBlank(message = "name cannot be blank")
    @Size(min=2, max=100)
    private String name;
    @NotNull(message = "date cannot be null")
    @JsonFormat(pattern="YYYY/MM/DD")
    private Date dob;
    @Positive(message = "salary must be positive")
    private int salary;
    @NotBlank(message = "location cannot be blank")
    private String location;
    @NotNull(message = "Employee ID cannot be null")
    private boolean married;


}
