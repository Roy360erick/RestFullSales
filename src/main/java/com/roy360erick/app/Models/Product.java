package com.roy360erick.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long ProductId;

    public String Descriptions;

    public Double Price ;

    public Boolean IsAvailable ;

    public Date PublishOn ;

}
