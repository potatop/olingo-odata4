/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.msopentech.odatajclient.engine.data;

import java.net.URI;
import java.util.List;

/**
 * REST resource for an <tt>ODataEntitySet</tt>.
 *
 * @see ODataEntitySet
 */
public interface Feed {

    /**
     * Gets base URI.
     *
     * @return base URI.
     */
    URI getBaseURI();

    /**
     * Gets number of entries if an <tt>inlinecount</tt> was required.
     *
     * @return number of entries into the feed.
     */
    Integer getCount();

    /**
     * Gets entries.
     *
     * @return entries.
     */
    List<? extends Entry> getEntries();

    /**
     * Sets entries.
     *
     * @param entries entries.
     */
    void setEntries(List<Entry> entries);

    /**
     * Sets next link.
     *
     * @param next next link.
     */
    void setNext(URI next);

    /**
     * Gets next link if exists.
     *
     * @return next link if exists; null otherwise.
     */
    URI getNext();
}