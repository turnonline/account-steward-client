package biz.turnonline.ecosystem.steward.facade;

import com.google.api.client.util.DateTime;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * It deserializes {@link JsonElement} to the {@link DateTime}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DateTimeDeserializer
        implements JsonDeserializer<DateTime>
{
    @Override
    public DateTime deserialize( JsonElement json, Type typeOfT, JsonDeserializationContext context )
            throws JsonParseException
    {
        long seconds = json.getAsJsonObject().get( "seconds" ).getAsLong();
        long nanos = json.getAsJsonObject().get( "nanos" ).getAsLong();
        // seconds and nanos converted first to milliseconds
        return new DateTime( ( seconds * 1000 ) + ( nanos / 1000000 ) );
    }
}
