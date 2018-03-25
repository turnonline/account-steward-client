/*
 * Copyright (c) 2018 Comvai, s.r.o.
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
 *
 */

package biz.turnonline.ecosystem.account.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The domain resource URI list wrapper.
 **/
public class UriList
        implements Serializable
{
    private static final long serialVersionUID = -2138443122395896304L;

    private List<String> uris = new ArrayList<>();

    /**
     * The path of a domain URI. An optional slash “/” prefix will be ignored.
     */
    public UriList uris( List<String> uris )
    {
        this.uris = uris;
        return this;
    }

    public List<String> getUris()
    {
        return uris;
    }

    public void setUris( List<String> uris )
    {
        this.uris = uris;
    }

    @Override
    public String toString()
    {
        return "class UriList {\n" +
                "    uris: " + toIndentedString( uris ) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString( Object o )
    {
        if ( o == null )
        {
            return "null";
        }
        return o.toString().replace( "\n", "\n    " );
    }
}

