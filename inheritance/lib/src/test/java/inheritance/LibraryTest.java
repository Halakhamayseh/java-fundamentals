/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        //assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");

    }
    @Test public void testres(){
        Restaurant newInstanceRestaurant1=new Restaurant("Jood Restaurant",10);
        String resultTest="Restaurant{RestaurantName='Jood Restaurant', starsRate=0, RestaurantPrice=10, reviewsArray=[]}";
        assertEquals(resultTest,newInstanceRestaurant1.toString());
    }
    @Test public void testReview(){
        Review newInstanceReview=new Review("not good","hala",1);
        String resultTest="Review{body='not good', anAuthor='hala', numberOfStars=1}";
        assertEquals(resultTest,newInstanceReview.toString());
    }
    @Test public void testadd(){
        Restaurant newInstanceRestaurant1=new Restaurant("Jood Restaurant",10);
        Review newInstanceReview=new Review("not good","hala",1);
        newInstanceRestaurant1.addReview(newInstanceReview);
        String resultTest="Restaurant{RestaurantName='Jood Restaurant', starsRate=1, RestaurantPrice=10, reviewsArray=[Review{body='not good', anAuthor='hala', numberOfStars=1}";
        assertEquals(resultTest,newInstanceRestaurant1.toString());
    }
}