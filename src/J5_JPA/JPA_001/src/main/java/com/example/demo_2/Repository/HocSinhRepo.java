package com.example.demo_2.Repository;

import com.example.demo_2.Model.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocSinhRepo extends JpaRepository<HocSinh, Integer> {

}
