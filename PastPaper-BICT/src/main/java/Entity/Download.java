package Entity;


import jakarta.persistence.*;

@Entity
public class Download {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileName;

    @ManyToOne
    @JoinColumn(name="paper_id", nullable = false)
    private Paper paper;

    private Long downloadCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Entity.Paper getPaper() {
        return paper;
    }

    public void setPaper(Entity.Paper paper) {
        this.paper = paper;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Download(Long id, String fileName, Entity.Paper paper, Long downloadCount) {
        this.fileName = fileName;
        this.paper = paper;
    }
}
