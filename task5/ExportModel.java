package task5;

public class ExportModel <T  extends Contact> {
    ExportFormat format;
    String text;
    String path;
    T contact;
    public ExportModel(T contact) {
        this.contact = contact;
    }

    public void setFormat(ExportFormat format) {
        this.format = format;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void save() {
        text = format.createString(contact);
        SaveFile.saveTextToFile(text, this.path);

    }
}
