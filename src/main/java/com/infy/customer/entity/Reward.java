/*
    Reward class contains the getPoints() method and 'points' instance variable which are part of
    Transaction class as MyTransaction class extending Reward class and hence we are providing their
    definition in Transaction class.
*/

package com.infy.customer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Reward {

    @JsonInclude
    protected Long points;

    public abstract Long getPoints();
}