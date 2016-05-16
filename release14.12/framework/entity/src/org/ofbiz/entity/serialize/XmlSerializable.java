/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.ofbiz.entity.serialize;

import org.w3c.dom.Element;

/**
 * XmlSerializable
 *
 */
public interface XmlSerializable<T> {

    /**
     * Deserialize the XML element back to an object
     * @param element XML element
     * @throws SerializeException
     */
    public T deserialize(Element element) throws SerializeException;

    /**
     * Serialize the object to an XML element
     * @throws SerializeException
     */
    public Element serialize() throws SerializeException;

}

