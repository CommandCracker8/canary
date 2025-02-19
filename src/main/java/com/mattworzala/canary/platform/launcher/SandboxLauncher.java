package com.mattworzala.canary.platform.launcher;

import com.mattworzala.canary.platform.junit.CanaryTestEngine;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;

public class SandboxLauncher {
    /**
     * A JUnit engine discovery request which allows any class in any package.
     */
    private static final LauncherDiscoveryRequest DEFAULT_REQUEST = LauncherDiscoveryRequestBuilder.request()
            .selectors(DiscoverySelectors.selectPackage(""))
            .build();

    public static void main(String[] args) {
        var engine = new CanaryTestEngine(false);

        // Handle discovery (preps server)
        engine.discover(DEFAULT_REQUEST, UniqueId.forEngine(engine.getId()));

        // Start the server manually since we are not calling `engine#execute(..)`
        engine.startServer();


//        MinestomMixin.inject(args); //"--mixin", "mixin.canary.base.json"

//        var server = ProxySandboxServer.create();

//        SandboxTestEnvironment.getInstance().discover();

//        server.start();
//        SandboxTestEnvironment.getInstance().setServer(server); //todo handle this somewhere better
        // Stopped by other means
    }
}
