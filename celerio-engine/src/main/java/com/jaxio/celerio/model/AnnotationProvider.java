/*
 * Copyright 2015 JAXIO http://www.jaxio.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jaxio.celerio.model;

import java.util.List;
import java.util.Set;

import com.jaxio.celerio.model.support.PackageImport;

/**
 * Provides formatted annotations and their associated Java imports.
 */
public interface AnnotationProvider {

    /**
     * Returns the Java imports required by the annotations present in the list returned by {@link #getAnnotations()}.
     */
    Set<PackageImport> getImports();

    /**
     * Returns a list of formatted annotations ready to use in some Java source code.
     */
    List<String> getAnnotations();
}
