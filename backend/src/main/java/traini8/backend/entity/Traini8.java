package traini8.backend.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Traini8 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "CenterName is required")
    private String centerName;

    @NotBlank(message = "CenterCode is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "ContactPhone is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "ContactPhone must be a 10-digit number")
    private String contactPhone;
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
class Address {

    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

}

