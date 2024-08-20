/*
	customer_entity table which contains customer information and help us fetch the customer details in
	the API responses.
*/

package com.infy.customer.entity;
import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "customer_entity")
public class CustomerEntity {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MyTransaction> transactions;

	@JsonInclude
	private Long rewardPoints;

	@JsonInclude
	private Double totalPurchases;

	// no arg constructor
	public CustomerEntity() {
		super();
	}

	// parameterized constructor
	public CustomerEntity(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// setters and getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MyTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<MyTransaction> transactions) {
		this.transactions = transactions;
	}

	// getter methods to fetch and calculate points from purchases done by customer
	public Long getRewardPoints() {
		if (transactions == null || transactions.isEmpty()) return 0l;

		return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a,b) -> a + b).longValue();
	}

	public Double getTotalPurchases() {
		if (transactions == null || transactions.isEmpty()) return 0d;

		return transactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
	}
}