package com.apprentcarproject.dto;

import com.apprentcarproject.model.Customers;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class ReservationDTO {

    @JsonProperty(value = "reservation_id")
    private Long reservationId;

    @JsonProperty(value = "actual_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-MM-dd")
    private Date actualDate;

    @JsonProperty(value = "init_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-MM-dd")
    private Date initDate;

    @JsonProperty(value = "final_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-MM-dd")
    private Date finalDate;

    @JsonProperty(value = "pick_up_time")
    @Temporal(TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:MM")
    private Date pickUpTime;

    @JsonProperty(value = "drop_off_time")
    @Temporal(TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:MM")
    private Date dropOffTime;

    @JsonProperty(value = "office_code")
    private String officeCode;

    @JsonProperty(value = "office_return_code")
    private String officeReturnCode;

    @JsonProperty(value = "car_category")
    private String carCategory;

    @JsonProperty(value = "top_insurance")
    private Boolean topInsurance;

    @JsonProperty(value = "tire_and_glass_protection")
    private Boolean tireAndGlassProtection;

    private Customers customers;
}
