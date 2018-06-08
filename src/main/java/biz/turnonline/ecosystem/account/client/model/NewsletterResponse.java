package biz.turnonline.ecosystem.account.client.model;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class NewsletterResponse
        implements Serializable
{
    private static final long serialVersionUID = 944193199845679076L;

    private Boolean successful = false;

    /**
     * True if requested contact has matched the security code and request has been processed (subscribed to the newsletter). If false, contact with requested email has been found and verification email has been sent to that contact email to let user verify newsletter subscription.
     **/
    public NewsletterResponse successful( Boolean successful )
    {
        this.successful = successful;
        return this;
    }

    public Boolean getSuccessful()
    {
        return successful;
    }

    public void setSuccessful( Boolean successful )
    {
        this.successful = successful;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper( this )
                .add( "successful", successful )
                .toString();
    }
}

