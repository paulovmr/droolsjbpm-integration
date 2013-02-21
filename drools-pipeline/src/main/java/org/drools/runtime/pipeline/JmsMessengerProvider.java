/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.runtime.pipeline;

import java.util.Properties;

/**
 *
 * <p>This api is experimental and thus the classes and the interfaces returned are subject to change.</p>
 */
public interface JmsMessengerProvider {
    Service newJmsMessenger(Pipeline pipeline,
                            Properties properties,
                            String destinationName,
                            ResultHandlerFactory resultHandlerFactory);

    Service newJmsMessenger(Pipeline pipeline,
                            Properties properties,
                            String connectionFactoryName,
                            boolean useSecurityPrincipalForConnection,
                            String destinationName,
                            ResultHandlerFactory resultHandlerFactory);

    Action newJmsUnwrapMessageObject();
}