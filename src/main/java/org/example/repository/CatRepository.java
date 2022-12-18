package org.example.repository;

import org.example.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> findByWeightGreaterThan(int weight);

    @Query("select c from Cat c where name='Мурзик' ")
    List<Cat> findMurzik();

    //CRUD

    //Create
    //Insert - реализовано как catRepo.save(Cat cat) в методе App;

    //Read
    //findAll уже есть - catRepo.findAll();
    //findById тоже есть
    //findByName
    List<Cat> findByNameIs(String name);
    //findByWeight
    List<Cat> findByWeightEquals(int weight);
    //findByIsAngryTrue
    List<Cat> findByIsAngryTrue();

    //Update
    @Transactional
    @Modifying
    @Query("UPDATE Cat SET name = ?2 WHERE id = ?1")
    void updateCatName(Long id, String name);

    //Delete
    //Уже рализовано как repoCat.deleteById() или deleteAll()


}