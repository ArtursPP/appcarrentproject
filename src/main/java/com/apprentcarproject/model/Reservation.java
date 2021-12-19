package com.apprentcarproject.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {

    @Id
    @Column(name = "reservation_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @Column(name = "actual_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date actualDate;

    @Column(name = "init_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date initDate;

    @Column(name = "final_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date finalDate;

    @Column(name = "pick_up_time")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:MM")
    private Date pickUpTime;

    @Column(name = "drop_off_time")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:MM")
    private Date dropOffTime;

    @Column(name = "office_code")
    private String officeCode;

    @Column(name = "office_return_code")
    private String officeReturnCode;

    @Column(name = "car_category")
    private String carCategory;

    @Column(name = "top_insurance")
    private Boolean topInsurance;

    @Column(name = "tire_and_glass_protection")
    private Boolean tireAndGlassProtection;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @PostConstruct
    public void setActualDate() {
        this.actualDate = new Date();
    }


}
