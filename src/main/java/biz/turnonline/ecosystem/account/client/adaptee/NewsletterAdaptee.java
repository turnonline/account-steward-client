package biz.turnonline.ecosystem.account.client.adaptee;

import biz.turnonline.ecosystem.steward.Steward;
import biz.turnonline.ecosystem.steward.model.NewsletterSubscription;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractUpdateExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;

/**
 * The {@link NewsletterSubscription} adaptee implementation.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class NewsletterAdaptee
        extends AbstractUpdateExecutorAdaptee<Steward, NewsletterSubscription>
{
    @Inject
    public NewsletterAdaptee( Steward client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull NewsletterSubscription resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        String loginEmail = identifier.getString();
        Identifier child = identifier.child();
        String contactId;

        // contact identification might be either Long ID or String contact email
        if ( child.isLong() )
        {
            contactId = String.valueOf( child.getLong() );
        }
        else
        {
            contactId = child.getString();
        }

        return client().contacts().newsletter().update( loginEmail, contactId, resource );
    }
}
