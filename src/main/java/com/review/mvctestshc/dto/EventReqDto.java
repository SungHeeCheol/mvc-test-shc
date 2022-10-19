package com.review.mvctestshc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventReqDto {
    private String strData;
    private String name;
    private String number;
}
