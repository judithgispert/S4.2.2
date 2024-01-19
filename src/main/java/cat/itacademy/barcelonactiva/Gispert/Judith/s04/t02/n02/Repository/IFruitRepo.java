package cat.itacademy.barcelonactiva.Gispert.Judith.s04.t02.n02.Repository;

import cat.itacademy.barcelonactiva.Gispert.Judith.s04.t02.n02.Domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFruitRepo extends JpaRepository<Fruit, Float> { }

