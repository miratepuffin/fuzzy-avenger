import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guardian")
public class WebController {
    private static final Logger logger = Logger.getLogger(WebController.class);
    private static final Manager manager = new Manager();

    @RequestMapping(value="/*", method = RequestMethod.GET)
    public static String getGuardianPoliticalArticle(ModelMap model){
        ConvertedPojo pojo = manager.getConvertedPojo();
        model.addAttribute("attribute", pojo.getAttribute());
        return "page";
    }
}