package task5;

public interface ExportFormat {
    <T extends Contact> String createString(T contact);
}  
