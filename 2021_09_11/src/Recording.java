import java.util.Date;

/**
 * 借阅记录
 */
public class Recording extends CatalogItem {
    private String performer;
    private String format;

    public Recording() {
    }

    public Recording(String performer, String format) {
        this.performer = performer;
        this.format = format;
    }

    public Recording(String code, String title, Date publishDate, String performer, String format) {
        super(code, title, publishDate);
        this.performer = performer;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Recording_" + super.toString() + performer + "_" + format;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
