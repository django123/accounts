package io.django.accounts.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="customer")
@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
   @Column(name = "customer_id")
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
}
