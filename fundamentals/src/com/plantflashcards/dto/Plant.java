package com.plantflashcards.dto;

public class Plant implements IPlant {

    private String genus;
    private String species;

    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    public String getGenus() {
        return genus;
    }

    @Override
    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCultivar() {
        return Cultivar;
    }

    @Override
    public void setCultivar(String cultivar) {
        Cultivar = cultivar;
    }

    public String getCommonName() {
        return commonName;
    }

    @Override
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    private String Cultivar;
    private String commonName;

    @Override
    public String getScientificName() {
        return getGenus() +  " " + getSpecies() + " " + getCultivar();
    }
}
