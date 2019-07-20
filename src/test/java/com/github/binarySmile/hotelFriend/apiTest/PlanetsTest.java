package com.github.binarySmile.hotelFriend.apiTest;

import com.github.binarySmile.hotelFriend.apiTest.pojo.PlanetsResponse;
import com.github.binarySmile.hotelFriend.apiTest.pojo.SearchResponse;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;


public class PlanetsTest {

    private static String base_URL = "https://swapi.co/api/planets/";
    private static String param = "murky";
    private static String param1 = "swamp, jungles";

    @Test
    public void testPlanets() {
        SearchResponse searchResponse = given()
                .get(base_URL)
                .body()
                .as(SearchResponse.class);

        searchResponse = (SearchResponse) getObjectFromCollection(searchResponse.getPlanets());
        System.out.println(searchResponse);
    }

    public SearchResponse getObjectFromCollection(List <PlanetsResponse> list) {
        for (PlanetsResponse planet : list) {
            if (planet.getClimate().equals(param)
                    && planet.getTerrain().equals(param1)
                    && planet.getResidents().isEmpty()) {
                return planet;
            }
        }
        return null;
    }
}
