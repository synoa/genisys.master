package de.synoa.genisys.gettingstarted;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GettingStartedRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // @formatter:off
		
		from("timer:gettingStarted?period=5000").routeId("Hello World Route")
			.log("{{genisys.greeting}}");
		
        // @formatter:on
    }

}
