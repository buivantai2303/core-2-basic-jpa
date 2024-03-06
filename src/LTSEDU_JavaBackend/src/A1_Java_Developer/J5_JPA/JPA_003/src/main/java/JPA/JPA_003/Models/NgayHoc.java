package JPA.JPA_003.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "ngayHocs")
public class NgayHoc {
    @Id
    @Column(name = "ngayHocId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ngayHocId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hocViens")
    @JsonIgnoreProperties(value = "hocViens")
    Set<KhoaHoc> khoaHocs;

    @Column(name = "noiDung")
    private String noiDung;

    @Column(name = "ghiChu")
    private String ghiChu;


}
