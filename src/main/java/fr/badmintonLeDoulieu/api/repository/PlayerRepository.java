package fr.badmintonLeDoulieu.api.repository;

import fr.badmintonLeDoulieu.api.Entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
