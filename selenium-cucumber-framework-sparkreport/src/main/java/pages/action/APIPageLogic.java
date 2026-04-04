package pages.action;
import org.openqa.selenium.WebDriver;
import utils.APIUtils;
import utils.WaitUtil;

import static org.hamcrest.Matchers.*;

public class APIPageLogic extends APIUtils {

    private WebDriver driver;
    private WaitUtil wait;

    public APIPageLogic(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtil(driver, 10);
    }

    public void initializeBaseURIWith(String baseURL) {
        setBaseURI(baseURL);
    }

    public void verifyThatEndpointGetsRespose(String endPoint, int statusCode) {
                getResponse(endPoint,"GET",null)
                .then()
                .statusCode(statusCode);
    }
}