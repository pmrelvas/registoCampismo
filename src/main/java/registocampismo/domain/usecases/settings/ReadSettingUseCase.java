package registocampismo.domain.usecases.settings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import registocampismo.data.repositories.SettingRepository;
import registocampismo.domain.entities.Setting;

public class ReadSettingUseCase {

	private static final String LIST_SEPARATOR = ",";
	
	private final SettingRepository settingRepository;
	
	public ReadSettingUseCase() {
		this.settingRepository = new SettingRepository();
	}
	
	public Float getPricePersonHighSeason() {
		return readFloat(Setting.PRICE_PERSON_HIGH_SEASON_KEY);
	}
	
	public Float getPricePersonLowSeason() {
		return readFloat(Setting.PRICE_PERSON_LOW_SEASON_KEY);
	}
	
	public Float getPriceDogHighSeason() {
		return readFloat(Setting.PRICE_DOG_HIGH_SEASON_KEY);
	}
	
	public Float getPriceDogLowSeason() {
		return readFloat(Setting.PRICE_DOG_LOW_SEASON_KEY);
	}
	
	public Float getPriceElectricityHighSeason() {
		return readFloat(Setting.PRICE_ELECTRICITY_HIGH_SEASON_KEY);
	}
	
	public Float getPriceElectricityLowSeason() {
		return readFloat(Setting.PRICE_ELECTRICITY_LOW_SEASON_KEY);
	}
	
	public List<Integer> getMonthsHighSeason() {
		return readIntList(Setting.MONTHS_HIGH_SEASON_KEY);
	}
	
	public List<Integer> getMonthsLowSeason() {
		return readIntList(Setting.MONTHS_LOW_SEASON_KEY);
	}
	
	private Float readFloat(String key) {
		return Float.parseFloat(settingRepository.readSettingByKey(key).getValue());
	}
	
	private List<Integer> readIntList(String key) {
		return Arrays.asList(settingRepository.readSettingByKey(key).getValue().split(LIST_SEPARATOR)).stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
	}
}
