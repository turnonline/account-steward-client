package biz.turnonline.ecosystem.account.client.model;

import java.io.Serializable;

/**
 * The company legal form code-book definition.
 **/
public class LegalForm
        implements Serializable
{
    private static final long serialVersionUID = 6113966187062616402L;

    private String code = null;

    private String label = null;

    private String locale = null;

    private Integer version = null;

    /**
     * The ISO 3166 alpha-2 country code.
     **/
    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    /**
     * The codebook value, legal form short name.
     **/
    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    /**
     * The label language. ISO 639 alpha-2 or alpha-3 language code.
     **/
    public String getLocale()
    {
        return locale;
    }

    public void setLocale( String locale )
    {
        this.locale = locale;
    }

    /**
     * The codebook item version.
     **/
    public Integer getVersion()
    {
        return version;
    }

    public void setVersion( Integer version )
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "class LegalForm {\n" +
                "    code: " + toIndentedString( code ) + "\n" +
                "    label: " + toIndentedString( label ) + "\n" +
                "    locale: " + toIndentedString( locale ) + "\n" +
                "    version: " + toIndentedString( version ) + "\n" +
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

