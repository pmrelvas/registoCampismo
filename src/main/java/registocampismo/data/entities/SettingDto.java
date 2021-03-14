package registocampismo.data.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import registocampismo.domain.entities.Setting;

@Entity
@Table(name = "settings")
public class SettingDto {
	
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public SettingDto(Integer id, String key, String value, String createdAt, String updatedAt) {
		this.id = id;
		this.key = key;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public SettingDto() {}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "key")
	private String key;
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "created_at", nullable = false)
	private String createdAt;
	
	@Column(name = "updated_at", nullable = false)
	private String updatedAt;
	
	public SettingDto(Setting setting) {
		this.id = setting.getId();
		this.key = setting.getKey();
		this.value = setting.getValue();
		this.createdAt = setting.getCreatedAt().format(DATE_TIME_FORMATTER);
		this.updatedAt = setting.getUpdatedAt().format(DATE_TIME_FORMATTER);
	}
	
	public Setting toEntity() {
		Setting setting = new Setting();
		setting.setId(id);
		setting.setKey(key);
		setting.setValue(value);
		setting.setCreatedAt(LocalDateTime.parse(createdAt, DATE_TIME_FORMATTER));
		setting.setUpdatedAt(LocalDateTime.parse(updatedAt, DATE_TIME_FORMATTER));		
		return setting;
	}
	
}
