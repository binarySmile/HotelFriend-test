package com.github.binarySmile.hotelFriend.apiTest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class PlanetsResponse extends SearchResponse {

    @JsonProperty("films")
    private List <String> films;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("climate")
    private String climate;

    @JsonProperty("rotation_period")
    private String rotationPeriod;

    @JsonProperty("url")
    private String url;

    @JsonProperty("population")
    private String population;

    @JsonProperty("orbital_period")
    private String orbitalPeriod;

    @JsonProperty("surface_water")
    private String surfaceWater;

    @JsonProperty("diameter")
    private String diameter;

    @JsonProperty("gravity")
    private String gravity;

    @JsonProperty("name")
    private String name;

    @JsonProperty("residents")
    private List <String> residents;

    @JsonProperty("terrain")
    private String terrain;

    public List <String> getFilms() {
        return films;
    }

    public void setFilms(List <String> films) {
        this.films = films;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <String> getResidents() {
        return residents;
    }

    public void setResidents(List <String> residents) {
        this.residents = residents;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public String toString() {
        return
                "PlanetsResponse{" +
                        "films = '" + films + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",created = '" + created + '\'' +
                        ",climate = '" + climate + '\'' +
                        ",rotation_period = '" + rotationPeriod + '\'' +
                        ",url = '" + url + '\'' +
                        ",population = '" + population + '\'' +
                        ",orbital_period = '" + orbitalPeriod + '\'' +
                        ",surface_water = '" + surfaceWater + '\'' +
                        ",diameter = '" + diameter + '\'' +
                        ",gravity = '" + gravity + '\'' +
                        ",name = '" + name + '\'' +
                        ",residents = '" + residents + '\'' +
                        ",terrain = '" + terrain + '\'' +
                        "}";
    }
}