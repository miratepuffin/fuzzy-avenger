import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by danlaptop on 12/10/2014.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvertedPojo {

    private String attribute;

    @JsonProperty("attributeName")
    public String getAttribute(){
        return attribute;
    }

}
