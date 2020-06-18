package com.mini.web.floating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloatingRepository extends JpaRepository<Floating,Long> {
}
