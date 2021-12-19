package com.apprentcarproject.mapper;


import com.apprentcarproject.dto.ReservationDTO;
import com.apprentcarproject.model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation fromReservationDTO(ReservationDTO reservationDTO) {
        Reservation reservation = new Reservation();

        reservation.setReservationId(reservationDTO.getReservationId());
        reservation.setActualDate(reservationDTO.getActualDate());
        reservation.setInitDate(reservationDTO.getInitDate());
        reservation.setFinalDate(reservationDTO.getFinalDate());
        reservation.setPickUpTime(reservationDTO.getPickUpTime());
        reservation.setDropOffTime(reservationDTO.getDropOffTime());
        reservation.setOfficeCode(reservationDTO.getOfficeCode());
        reservation.setOfficeReturnCode(reservationDTO.getOfficeReturnCode());
        reservation.setTopInsurance(reservationDTO.getTopInsurance());
        reservation.setTireAndGlassProtection(reservationDTO.getTireAndGlassProtection());
        reservation.setCarCategory(reservationDTO.getCarCategory());
        return reservation;
    }

    public ReservationDTO toReservationDTO(Reservation reservation) {
        ReservationDTO reservationDTOs = new ReservationDTO();

        reservationDTOs.setReservationId(reservation.getReservationId());
        reservationDTOs.setActualDate(reservation.getActualDate());
        reservationDTOs.setInitDate(reservation.getInitDate());
        reservationDTOs.setFinalDate(reservation.getFinalDate());
        reservationDTOs.setPickUpTime(reservation.getPickUpTime());
        reservationDTOs.setDropOffTime(reservation.getDropOffTime());
        reservationDTOs.setOfficeCode(reservation.getOfficeCode());
        reservationDTOs.setOfficeReturnCode(reservation.getOfficeReturnCode());
        reservationDTOs.setTopInsurance(reservation.getTopInsurance());
        reservationDTOs.setTireAndGlassProtection(reservation.getTireAndGlassProtection());
        reservationDTOs.setCarCategory(reservation.getCarCategory());
        return reservationDTOs;
    }
}
