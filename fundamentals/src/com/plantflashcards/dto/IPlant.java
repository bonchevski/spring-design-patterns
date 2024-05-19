package com.plantflashcards.dto;

/**
 * Describe a plant
 */
public interface IPlant {

    /**
     * Sets height.
     *
     * @param height the height
     */
    void setHeight(int height);

    /**
     * Sets genus.
     *
     * @param genus the genus
     */
    void setGenus(String genus);

    /**
     * Sets species.
     *
     * @param species the species
     */
    void setSpecies(String species);

    /**
     * Sets cultivar.
     *
     * @param cultivar the cultivar
     */
    void setCultivar(String cultivar);

    /**
     * Sets common name.
     *
     * @param commonName the common name
     */
    void setCommonName(String commonName);

    /**
     * Gets scientific name.
     *
     * @return the scientific name
     */
    public String getScientificName();
}
