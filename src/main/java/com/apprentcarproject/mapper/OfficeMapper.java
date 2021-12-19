package com.apprentcarproject.mapper;

import com.apprentcarproject.dto.OfficeDTO;
import com.apprentcarproject.model.Office;
import org.springframework.stereotype.Component;

@Component
public class OfficeMapper {

    public Office fromDTO(OfficeDTO officeDTO){
        Office office = new Office();
        office.setOffice_id(officeDTO.getOffice_id());
        office.setOfficeCode(officeDTO.getOfficeCode());
        office.setOfficeName(officeDTO.getOfficeName());
        office.setOfficeAddress(officeDTO.getOfficeAddress());
        office.setOfficePostCode(officeDTO.getOfficePostCode());
        office.setOfficeCity(officeDTO.getOfficeCity());
        office.setOfficeCountry(officeDTO.getOfficeCountry());
        return office;

    }

    public OfficeDTO toDTO(Office office){
        OfficeDTO officeDTOs = new OfficeDTO();
        officeDTOs.setOffice_id(office.getOffice_id());
        officeDTOs.setOfficeCode(office.getOfficeCode());
        officeDTOs.setOfficeName(office.getOfficeName());
        officeDTOs.setOfficeAddress(office.getOfficeAddress());
        officeDTOs.setOfficePostCode(office.getOfficePostCode());
        officeDTOs.setOfficeCity(office.getOfficeCity());
        officeDTOs.setOfficeCountry(office.getOfficeCountry());
        return officeDTOs;

    }
}
