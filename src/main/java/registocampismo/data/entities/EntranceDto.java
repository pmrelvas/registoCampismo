package registocampismo.data.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import registocampismo.domain.entities.Agent;
import registocampismo.domain.entities.Entrance;

@Entity
@Table(name = "entrances")
public class EntranceDto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "agent", nullable = false)
	private String agent;
	
	@Column(name = "check_in", nullable = false)
	private LocalDateTime checkIn;
	
	@Column(name = "check_out")
	private LocalDateTime checkOut;
	
	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;
	
	public EntranceDto(Entrance entrance) {
		id = entrance.getId();
		agent = entrance.getAgent().name();
		checkIn = entrance.getCheckIn();
		checkOut = entrance.getCheckOut();
		createdAt = entrance.getCreatedAt();
		updatedAt = entrance.getUpdatedAt();
	}

	public Entrance toEntity() {
		Entrance entrance = new Entrance();
		entrance.setAgent(Agent.valueOf(agent));
		entrance.setCheckIn(checkIn);
		entrance.setCheckOut(checkOut);
		entrance.setCreatedAt(createdAt);
		entrance.setUpdatedAt(updatedAt);
		return entrance;
	}
}
