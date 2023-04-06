package task5; 

public class ExportToXML implements ExportFormat{

    public static final String XMLFile = null;

    @Override
    public <T extends Contact> String createString(T contact) {
        return String.format("""
                <xml>
                <Contact>
                <Name>%s</Name>
                <Number>%d</Number>
                </Contact></xml>
                """, contact.getName(), contact.getNumber());
    }
}
