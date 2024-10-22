package lesson_29.persons;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestExample {

    @BeforeEach
    void setUp(){
        System.out.println("Method BeforeEach");
    }
    @Test
    public void testAddition(){
        System.out.println("testAddition");

        int result = 2 +2;
        Assertions.assertEquals(4,result);
        Assertions.assertNotEquals(5,result);
        Assertions.assertTrue(result >= 4);
        Assertions.assertFalse(result > 4);
        Assertions.assertNull(null);
        Assertions.assertNotNull("String");
    }

    @Disabled
    @Test
    public void emptyTest(){
        System.out.println("Test emptyTest");
    }

    public void testFruits(String fruit){
        System.out.println(fruit);
        Assertions.assertTrue(fruit.length() > 2);
    }
}