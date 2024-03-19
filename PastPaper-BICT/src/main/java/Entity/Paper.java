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


}
