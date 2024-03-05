package tech.gismi.Travels.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import tech.gismi.Travels.factory.TravelFactory;
import tech.gismi.Travels.model.Travel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {
    private TravelFactory factory;
    private List<Travel> travels;

    public void createTravelFactory() {
        if (factory == null) {
            factory = new TravelFactoryImpl();
        }
    }

    public void createTravelList() {

        if (travels == null) {
            travels = new ArrayList<>();

        }

    }

    public boolean isJSONValid(String jsonInString) {

        try {
            return new ObjectMapper().readTree(jsonInString) != null;

        } catch (IOException e) {

            return false;

        }

    }


}
