package com.plantflashcards.dto;

public class Tree extends Plant{

    public String getFallColor() {
        return fallColor;
    }

    public void setFallColor(String fallColor) {
        this.fallColor = fallColor;
    }

    private String fallColor;

    @Override
    public String getScientificName() {
        return "This tree is: " +  super.getScientificName();
    }
}
