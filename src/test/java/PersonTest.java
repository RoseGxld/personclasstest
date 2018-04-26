import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void defaultConstructorTest(){

        Person p1= new Person();


        Assert.assertTrue(p1 instanceof Person);
        }

        @Test
    public  void constructorWithNameTest(){

        String expected = "Eric";

        Person p1 = new Person(expected);

        String actual = p1.getName();

        Assert.assertEquals(expected, actual);
        }

        @Test
    public void constructorWithAgeTest(){
        int expected = 25;

        Person p1 = new Person(expected);

        int actual = p1.getAge();

        Assert.assertEquals(expected, actual);
        }

        @Test
    public void constructorWithNameAndAgeTest(){
        int expectedAge = 25;
        String expectedName = "Pablo";

        Person p1 = new Person(expectedName, expectedAge);

        String retrievedName = p1.getName();
        int retrievedAge = p1.getAge();

        Assert.assertEquals(expectedAge, retrievedAge );
        Assert.assertEquals(expectedName, retrievedName);

        }

        @Test
    public void setNameTest(){
        String expected = "Alex";

        Person p1 = new Person("Darius");

        p1.setName(expected);

        String actual = p1.getName();

        Assert.assertEquals(expected, actual );

        }
        @Test
        public void setAgeTest(){

        int expected = 25;

        Person p1 = new Person(25);

        p1.setAge(expected);

        int actual = p1.getAge();

        Assert.assertEquals(expected,actual);

        }

}
C:\Users\Student\Downloads\demo-greeting-app\persontest\src\test\java\PersonTest.java