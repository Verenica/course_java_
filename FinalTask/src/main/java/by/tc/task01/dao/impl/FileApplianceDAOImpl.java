package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> result = null;
		ClassLoader loader = getClass().getClassLoader();
		File file = new File(loader.getResource("appliances_db.txt").getFile());
		try {
			result = parcdata(file, criteria);
		} catch (ExceptionDAO e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<Appliance> parcdata(File file, Criteria criteria) throws ExceptionDAO {
		List<Appliance> result = new ArrayList<Appliance>();
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			List<String> data = new ArrayList<String>();
			while (fileReader.ready()) {
				String text = fileReader.readLine();
				if (text.length() > 0) {
					if (criteria.isSearchObject(text)) {
						data.add(text);
					}
				}
			}
			fileReader.close();
			for (String info : data) {
				result.add(getObject(info));
			}
		} catch (FileNotFoundException e) {
			throw new ExceptionDAO(e);
		} catch (IOException e) {
			throw new ExceptionDAO(e);
		} 
		return result;
	}

	public Appliance getObject(String text) {
		Map<String, String> hm = new HashMap<>();
		String obj = text.substring(0, text.indexOf(":") - 1);
		text = text.substring(text.indexOf(":") + 1);
		if (text.indexOf(",") > 0) {
			String[] m = text.split(",");
			for (int i = 0; i < m.length; i++) {
				String[] m1 = m[i].split("=");
				if (m1.length > 1) {
					hm.put(m1[0].trim(), m1[1].trim());
				}
			}
			switch (obj) {
			case "Oven":
				Oven oven = new Oven();
				oven.setPowerConsumption(Integer.parseInt(hm.get("POWER_CONSUMPTION")));
				oven.setWeight(Integer.parseInt(hm.get("WEIGHT")));
				oven.setCapacity(Integer.parseInt(hm.get("CAPACITY")));
				oven.setDepth(Integer.parseInt(hm.get("DEPTH")));
				oven.setHeight(Integer.parseInt(hm.get("HEIGHT")));
				oven.setWidth(Integer.parseInt(hm.get("WIDTH")));
				return oven;
			case "Laptop":
				Laptop laptop = new Laptop();
				laptop.setBatteryCapacity(Double.parseDouble("BATTERY_CAPACITY"));
				laptop.setOs(hm.get("OS"));
				laptop.setMemoryRom(Integer.parseInt(hm.get("MEMORY_ROM")));
				laptop.setSystemMemory(Integer.parseInt(hm.get("SYSTEM_MEMORY")));
				laptop.setCpu(Integer.parseInt(hm.get("CPU")));
				laptop.setDisplayInchs(Integer.parseInt(hm.get("DISPLAY_INCHS")));
				return laptop;
			case "Refrigerator":
				Refrigerator refrigerator = new Refrigerator();
				refrigerator.setPowerConsumption(Integer.parseInt(hm.get("POWER_CONSUMPTION")));
				refrigerator.setWeight(Integer.parseInt(hm.get("WEIGHT")));
				refrigerator.setFreezerCapacity(Integer.parseInt(hm.get("FREEZER_CAPACITY")));
				refrigerator.setOverallCapacity(Double.parseDouble("OVERALL_CAPACITY"));
				refrigerator.setHeight(Integer.parseInt(hm.get("HEIGHT")));
				refrigerator.setWidth(Integer.parseInt(hm.get("WIDTH")));
				return refrigerator;
			case "VacuumCleaner":
				VacuumCleaner vacuumCleaner = new VacuumCleaner();
				vacuumCleaner.setPowerConsumption(Integer.parseInt(hm.get("POWER_CONSUMPTION")));
				vacuumCleaner.setFilterType("FILTER_TYPE");
				vacuumCleaner.setBagType("BAG_TYPE");
				vacuumCleaner.setWandType("WAND_TYPE");
				vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(hm.get("MOTOR_SPEED_REGULATION")));
				vacuumCleaner.setCleaningWidth(Integer.parseInt(hm.get("CLEANING_WIDTH")));
				return vacuumCleaner;
			case "TabletPC":
				TabletPC tabletPC = new TabletPC();
				tabletPC.setBatteryCapacity(Integer.parseInt(hm.get("BATTERY_CAPACITY")));
				tabletPC.setDisplayInchs(Integer.parseInt(hm.get("DISPLAY_INCHES")));
				tabletPC.setMemoryRom(Integer.parseInt(hm.get("MEMORY_ROM")));
				tabletPC.setFlashMemoryCapacity(Integer.parseInt(hm.get("FLASH_MEMORY_CAPACITY")));
				tabletPC.setColour(hm.get("COLOR"));
				return tabletPC;
			case "Speakers":
				Speakers speakers = new Speakers();
				speakers.setPowerConsumption(Integer.parseInt(hm.get("POWER_CONSUMPTION")));
				speakers.setNumberOfSpekers(Integer.parseInt(hm.get("NUMBER_OF_SPEAKERS")));
				speakers.setFrequenceRange("FREQUENCY_RANGE");
				speakers.setCordLength(Integer.parseInt(hm.get("CORD_LENGTH")));
				return speakers;
			}
		}
		return null;
	}
}