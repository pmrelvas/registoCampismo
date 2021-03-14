package registocampismo.data.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import registocampismo.data.entities.SettingDto;
import registocampismo.domain.entities.Setting;

public class SettingRepository {

	private final EntityManager entityManager;
	
	public SettingRepository() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RegistoCampismo_JPA");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public Setting readSettingByKey(String key) {
		SettingDto settingDto = entityManager.createQuery("SELECT s FROM SettingDto s WHERE s.key = :key", SettingDto.class)
				.setParameter("key", key).getSingleResult();
		
		return settingDto.toEntity();
	}
}
