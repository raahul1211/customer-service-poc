/*
    my_transaction table which contains transaction details of customer and help us fetch the purchase
    details in the API responses.
*/

package com.infy.customer.entity;

import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

// using lombok for getter and setter methods, arg and no-arg constructors
@Entity
@Data
@Table(name = "my_transaction")
public class MyTransaction extends Reward{
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private CustomerEntity customer; //customer will be working as a foreign key

    private Double total;

    private String description;

    private Date saveDate;

    // implementing the logic for getPoints() method of Reward class to calculate the points
    @Override
    public Long getPoints() {
        this.points = 0l;

        if (this.total > 50 && this.total <= 100) {
            this.points += (this.total.intValue() - 50) * 1;
        }

        if (this.total > 100) {
            this.points += 50;
            this.points += (this.total.intValue() - 100) * 2;
        }

        return this.points;
    }

    @Override
    public String toString() {
        return String.format("MyTransaction [id=%s, customer=%s, total=%s, description=%s, saveDate=%s]", id, customer,
                total, description, saveDate);
    }
}