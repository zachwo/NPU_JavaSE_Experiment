import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 藏书目录项
 */
public abstract class CatalogItem {
    private String code;
    private String title;
    private Date publishDate;

    public CatalogItem() {
    }

    public CatalogItem(String code, String title, Date publishDate) {
        this.code = code;
        this.title = title;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return code + "_" + title + "_" + sdf.format(publishDate) + "_";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
