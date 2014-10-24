import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by danlaptop on 16/10/2014.
 */
public class Network {
    private static final Logger logger = Logger.getLogger(Network.class);

    // API URL goes here (be sure to include api key)
    private final String url = "";
    private RestTemplate template;

    public Network(){
        logger.debug("Initialising Network");
        template = new RestTemplate();
        final MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
        final List<MediaType> supportedMediaTypes = new LinkedList<MediaType>(converter.getSupportedMediaTypes());
        final MediaType textJavascriptMediaType = new MediaType("application", "*+json", MappingJacksonHttpMessageConverter.DEFAULT_CHARSET);
        supportedMediaTypes.add(textJavascriptMediaType);
        converter.setSupportedMediaTypes(supportedMediaTypes);
        template.getMessageConverters().add(converter);
        logger.debug("Network initialised successfully");
    }

    public Pojo getPojo() throws Exception{
        logger.debug("ArticleListURL: " + url);
        return template.getForObject(url, Pojo.class);
    }
}
