package biz.turnonline.ecosystem.steward.facade;

import com.google.api.client.util.DateTime;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * It serializes {@link DateTime} to the {@link JsonElement}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class DateTimeSerializer
        implements JsonSerializer<DateTime>
{
    @Override
    public JsonElement serialize( DateTime src, Type typeOfSrc, JsonSerializationContext context )
    {
        long millis = src.getValue();
        long seconds = millis / 1000;
        long diff = millis - ( seconds * 1000 );

        JsonObject root = new JsonObject();
        root.addProperty( "seconds", seconds );
        root.addProperty( "nanos", diff * 1000000 );

        return root;
    }
}
