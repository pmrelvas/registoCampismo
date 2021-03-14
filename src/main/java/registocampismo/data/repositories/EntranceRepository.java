package registocampismo.data.repositories;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import registocampismo.data.entities.EntranceDto;
import registocampismo.domain.entities.Entrance;

public class EntranceRepository {
	
	private final EntityManager entityManager;
	
	public EntranceRepository() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RegistoCampismo_JPA");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void create(Entrance entrance) {
		entityManager.getTransaction().begin();
		
		entrance.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
		entrance.setUpdatedAt(LocalDateTime.now(ZoneOffset.UTC));
		EntranceDto entranceDto = new EntranceDto(entrance);
		
		entityManager.persist(entranceDto);
		entityManager.getTransaction().commit();
		
	}

}
