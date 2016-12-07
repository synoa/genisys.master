package de.synoa.genisys.gettingstarted;

import org.apache.camel.builder.RouteBuilder;

public class GettingStartedRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
        // @formatter:off
		
		from("file:")
			.log("Hello ${body}");
		
        // @formatter:on
	}

}
