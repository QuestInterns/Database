package me.salisuwy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Integer> {

    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
    
    // CUSTOM QUERY
    
    @Query(value = "SELECT * from qpd_trans where id = 1", nativeQuery = true)
    List<Blog> findAllTransactions();
}
