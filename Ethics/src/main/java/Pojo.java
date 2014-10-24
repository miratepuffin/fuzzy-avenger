import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.*;

/**
 * Created by danlaptop on 12/10/2014.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class Pojo {

    private String attribute;

    @JsonProperty("attributeName")
    public String getAttribute(){
        return attribute;
    }

}
