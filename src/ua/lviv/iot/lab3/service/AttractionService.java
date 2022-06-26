package ua.lviv.iot.lab3.service;

import ua.lviv.iot.lab3.entity.Attractions;

import java.util.List;

public interface AttractionService {
    List<Attractions> sortByPermissionABS(List<Attractions> attractionsList,String permission);
    List<Attractions> sortByPermissionDESC(List<Attractions> attractionsList,String permission);
    List<Attractions> sortByNumberKidsABS(List<Attractions> attractionsList);
    List<Attractions> sortByNumberKidsDESC(List<Attractions> attractionsList);


}
