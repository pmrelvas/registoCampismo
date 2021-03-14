package registocampismo.domain.entities;

import java.time.LocalDateTime;

public class Setting {
	
	public static final String PRICE_PERSON_LOW_SEASON_KEY = "low-season.price.person";
	public static final String PRICE_PERSON_HIGH_SEASON_KEY = "high-season.price.person";
	public static final String PRICE_DOG_LOW_SEASON_KEY = "low-season.price.dog";
	public static final String PRICE_DOG_HIGH_SEASON_KEY = "high-season.price.dog";
	public static final String PRICE_ELECTRICITY_LOW_SEASON_KEY = "low-season.price.electricity";
	public static final String PRICE_ELECTRICITY_HIGH_SEASON_KEY = "high-season.price.electricity";
	public static final String MONTHS_LOW_SEASON_KEY = "low-season.months";
	public static final String MONTHS_HIGH_SEASON_KEY = "high-season.months";

	private Integer id;
	private String key;
	private String value;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
