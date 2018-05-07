/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.authentication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Response extends StatusResponse<Response> {
    private List<Assertion> assertions = new LinkedList<>();

    public List<Assertion> getAssertions() {
        return Collections.unmodifiableList(assertions);
    }

    public Response setAssertions(List<Assertion> assertions) {
        this.assertions.clear();
        this.assertions.addAll(assertions);
        return this;
    }
}
