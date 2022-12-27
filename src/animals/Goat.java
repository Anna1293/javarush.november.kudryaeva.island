package animals;

public class Goat extends Herbivorous implements Runnable {

    public Goat() {
        gaveBirth = false;
        moved = true;
        deadBody = false;
        surviveWithoutFoodLeft = surviveWithoutFood = 5;
        weight = 60;
        speed = 3;
        maximumFood = 15;
        satiety = maximumFood / 3;
        hungerPerDay = maximumFood * 0.1;
        maxPopulation = 140;
    }

    @Override
    public void run() {
    }

    public int getSurviveWithoutFood() {
        return surviveWithoutFood;
    }

}
