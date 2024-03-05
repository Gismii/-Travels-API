package tech.gismi.Travels.factory;

import tech.gismi.Travels.model.Travel;

public interface TravelFactory {
    Travel createTravel (String type);
}
