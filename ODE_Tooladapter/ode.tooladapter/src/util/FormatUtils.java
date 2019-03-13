package util;

import org.apache.logging.log4j.message.FormattedMessage;

public class FormatUtils
{
    public static String format(String text, Object... params)
    {
        return new FormattedMessage(text, params).getFormattedMessage();
    }
}
