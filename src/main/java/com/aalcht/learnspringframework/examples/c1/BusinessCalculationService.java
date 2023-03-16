package com.aalcht.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {

    DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
