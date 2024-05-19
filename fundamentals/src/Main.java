import com.plantflashcards.dto.IPlant;
import com.plantflashcards.dto.Plant;
import com.plantflashcards.dto.Tree;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IPlant plant = new Plant();
        plant.setGenus("Cercis");
        plant.setSpecies("canadensis");
        plant.setCultivar("alba");
        plant.setCommonName("eastern redbud");

        Tree pawpaw = new Tree();
        pawpaw.setGenus("Asimina");
        pawpaw.setSpecies("Triloba");
        pawpaw.setCultivar("Potomac");
        pawpaw.setCommonName("eastern redbud");
        pawpaw.setHeight(6);

        List<IPlant> allPlants = new ArrayList<>();
        allPlants.add(plant);
        allPlants.add(pawpaw);

        for(IPlant iPlant : allPlants) {
            System.out.println("Plant = " + iPlant.getScientificName());
        }
    }
}