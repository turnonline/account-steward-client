/*
 * Copyright 2017 Comvai, s.r.o.
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

public class Error
        implements Serializable
{
    private static final long serialVersionUID = -6511527402938052948L;

    private Integer code = null;

    private String message = null;

    /**
     * The HTTP status code
     **/
    public Error code( Integer code )
    {
        this.code = code;
        return this;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode( Integer code )
    {
        this.code = code;
    }

    /**
     * The error message
     **/
    public Error message( String message )
    {
        this.message = message;
        return this;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "class Error {\n" +
                "    code: " + toIndentedString( code ) + "\n" +
                "    message: " + toIndentedString( message ) + "\n" +
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

