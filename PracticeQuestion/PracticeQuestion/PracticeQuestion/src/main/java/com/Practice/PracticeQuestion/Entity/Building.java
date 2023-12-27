package com.Practice.PracticeQuestion.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Building {
    private int buildingId;
    private String buildingAddress;
    private String buildingName;
    public static Building building(int buildingId){
            buildingId=buildingId;
            return new Building();
    }
}
