package registocampismo.domain.usecases.entrances;

import java.time.LocalDateTime;

import registocampismo.data.repositories.EntranceRepository;
import registocampismo.domain.entities.Agent;
import registocampismo.domain.entities.Entrance;

public class RegisterEntranceUseCase {

	private final EntranceRepository entranceRepository;
	
	public RegisterEntranceUseCase() {
		entranceRepository = new EntranceRepository();
	}
	
	public void execute(LocalDateTime login, LocalDateTime logout) {
		Entrance entrance = new Entrance();
		entrance.setAgent(Agent.LUCKY);
		entrance.setCheckIn(LocalDateTime.now());
		entrance.setCheckOut(LocalDateTime.now());
		entrance.setCreatedAt(LocalDateTime.now());
		entrance.setUpdatedAt(LocalDateTime.now());
		entranceRepository.create(entrance);
	}
}
