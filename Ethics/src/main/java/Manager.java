import org.apache.log4j.Logger;

/**
 * Created by danlaptop on 16/10/2014.
 */
public class Manager {
    private static final Network network = new Network();
    private static final Logger logger = Logger.getLogger(Manager.class);
    private static final Logic logic = new Logic();

    public Manager(){
    }

    private Pojo getPojo(){
        try {
            logger.debug("Manager is requesting pojos");
            return network.getPojo();
        }
        catch(Exception e){
            logger.debug("Failed to acquire pojo from api",e);
        }
        return null;
    }

    public ConvertedPojo getConvertedPojo(){
        Pojo beforePojo = getPojo();
        return logic.getConvertedPojo(beforePojo);
    }

}
