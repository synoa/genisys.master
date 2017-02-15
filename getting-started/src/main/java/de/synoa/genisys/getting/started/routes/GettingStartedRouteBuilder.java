package de.synoa.genisys.getting.started.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GettingStartedRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // @formatter:off
		
		from("timer:helloworld?period=5000").routeId("Hello World Route")
		    .setBody(simple("{{genisys.greeting}}"))
			.to("activemq:{{activemq.queue.prefix}}talk");
		
		from("activemq:{{activemq.queue.prefix}}talk").routeId("Talk Route")
		    .log("${body}");
		
        // @formatter:on
    }

}
