/*
 * Copyright 2013 Real Logic Ltd.
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
package uk.co.real_logic.sbe.generation;

import java.io.IOException;
import java.io.Writer;

/**
 * Abstraction that manages the destination of generated output.
 */
public interface OutputManager
{
    /**
     * Create a new output destination based on a name. The user is responsible for calling
     * {@link java.io.Writer#close()}.
     *
     * @param name of the given output.
     * @return A {@link Writer} to which the code generation should be output.
     */
    Writer createOutput(final String name) throws IOException;
}
