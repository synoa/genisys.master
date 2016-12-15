#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GettingStartedRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // @formatter:off
		
		from("timer:helloworld?period=5000").routeId("Hello World Route")
			.log("{{genisys.greeting}}");
		
        // @formatter:on
    }

}
