package de.boeserwolf91.xml.exception;

public class XmlSaveException extends XmlException
{
    public XmlSaveException(String message)
    {
        super(message);
    }

    public XmlSaveException(String message, Throwable t)
    {
        super(message, t);
    }
}
