package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paper {
    @Id
    @Column(length = 10,nullable = false)
    private String paper_id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String year;

    @Column(nullable = false)
    private String coursecode;

    public String getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(String paper_id) {
        this.paper_id = paper_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public Paper(String paper_id, String title, String subject, String year, String coursecode) {
        this.paper_id = paper_id;
        this.title = title;
        this.subject = subject;
        this.year = year;
        this.coursecode = coursecode;
    }
}
