import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws itemNotFoundException, restaurantNotFoundException {

        //these are for testing purpose only...

        LocalTime openingTime = LocalTime.parse("09:00:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        RestaurantService restaurantService = new RestaurantService();
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        restaurant.addToMenu("Chicken", 350);
        restaurant.removeFromMenu("Sweet corn soup");
        restaurantService.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        //System.out.println(restaurantService.findRestaurantByName("Amelie's "));
        System.out.println(restaurant.isRestaurantOpen());

    }
}