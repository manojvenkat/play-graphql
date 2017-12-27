import play.Environment;
import play.Logger;
import play.inject.ApplicationLifecycle;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationStart {

    @Inject
    public ApplicationStart(ApplicationLifecycle lifecycle, Environment environment) {
        Logger.info("Starting application....");
        if(environment.isDev()) {
            // do dev specific stuff
        }
    }

}
