package videoExample.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="hocsinhs")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hocsinhid")
    private int Id;

    @Column(name = "tenhocsinh")
    private String tenHocSinh;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }
}
