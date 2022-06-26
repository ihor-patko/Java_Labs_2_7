package ua.lviv.iot.lab3.service.impl;

import ua.lviv.iot.lab3.entity.Attractions;
import ua.lviv.iot.lab3.service.AttractionService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AttractionServiceImpl implements AttractionService {

    @Override
    public List<Attractions> sortByPermissionABS(List<Attractions> attractionsList, String permission) {
        List<Attractions> sorted = attractionsList.stream().sorted(Comparator.comparing(Attractions::getCost)).collect(Collectors.toList());
        List<Attractions> result = sorted
                .stream()
                .filter(a -> a.getPermission()
                        .equals(permission))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Attractions> sortByPermissionDESC(List<Attractions> attractionsList, String permission) {
        List<Attractions> reverse = attractionsList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Attractions::getCost))).collect(Collectors.toList());
        List<Attractions> result = reverse
                .stream()
                .filter(a -> a.getPermission()
                        .equals(permission))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Attractions> sortByNumberKidsABS(List<Attractions> attractionsList) {
        attractionsList.stream().max(Comparator.comparing(Attractions::getSeat));
        return attractionsList;
    }

    @Override
    public List<Attractions> sortByNumberKidsDESC(List<Attractions> attractionsList) {
        attractionsList.stream().min(Comparator.comparing(Attractions::getSeat));
        return attractionsList;
    }
}
