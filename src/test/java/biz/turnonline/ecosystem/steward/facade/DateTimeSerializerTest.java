package biz.turnonline.ecosystem.steward.facade;


import com.google.api.client.util.DateTime;
import com.google.gson.JsonElement;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static com.google.common.truth.Truth.assertWithMessage;

/**
 * {@link DateTimeSerializer} unit testing.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DateTimeSerializerTest
{
    private final DateTimeSerializer serializer = new DateTimeSerializer();

    private final DateTimeDeserializer deserializer = new DateTimeDeserializer();

    @Test
    public void conversion()
    {
        DateTime date = new DateTime( new Date() );
        JsonElement serialized = serializer.serialize( date, null, null );
        DateTime deserialized = deserializer.deserialize( serialized, null, null );

        assertWithMessage( "The date (time) after conversion" )
                .that( deserialized )
                .isEqualTo( date );
    }
}