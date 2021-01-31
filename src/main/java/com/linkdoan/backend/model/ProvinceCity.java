package com.linkdoan.backend.model;

import com.linkdoan.backend.dto.CommonDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "province_city")
public class ProvinceCity {
    @Id
    @Column(name = "province_city_id", unique = true, columnDefinition = "varchar(5)")
    private String provinceCityId;

    @Column(name = "name", columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "type", columnDefinition = "VARCHAR(30)")
    private String type;

    @Column(name = "country_id", columnDefinition = "CHAR(10)")
    private String countryId;

    public CommonDTO toDTO() {
        CommonDTO commonDTO = new CommonDTO();
        commonDTO.setId(this.provinceCityId);
        commonDTO.setLabel(this.name);
        return commonDTO;
    }
}
