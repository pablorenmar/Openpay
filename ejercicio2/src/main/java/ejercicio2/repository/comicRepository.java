package ejercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejercicio2.model.comicLog;

@Repository
public interface comicRepository extends JpaRepository<comicLog, Long>{

}
