package sdet.rest_assured.support;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import com.jayway.restassured.RestAssured;

public abstract class AbstractRestAssuredTest {
    @Before
    public void setUpBeforeTest() {
        RestAssured.reset();
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

}
