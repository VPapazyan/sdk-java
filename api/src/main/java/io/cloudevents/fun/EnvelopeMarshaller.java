/**
 * Copyright 2019 The CloudEvents Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cloudevents.fun;

import io.cloudevents.Attributes;
import io.cloudevents.CloudEvent;

/**
 * 
 * @author fabiojose
 *
 */
@FunctionalInterface
public interface EnvelopeMarshaller<A extends Attributes, T, P> {

	/**
	 * Marshals a CloudEvent instance into the wire format
	 * @param event The CloudEvents instance
	 * @return the wire format
	 */
	P marshal(CloudEvent<A, T> event);
}
