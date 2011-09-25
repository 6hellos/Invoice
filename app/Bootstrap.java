/**
 * Created by IntelliJ IDEA.
 * User: pdelmundo
 * Date: 9/24/11
 * Time: 12:59 AM
 * To change this template use File | Settings | File Templates.
 */
import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Check if the database is empty
        if(Invoice.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }

}