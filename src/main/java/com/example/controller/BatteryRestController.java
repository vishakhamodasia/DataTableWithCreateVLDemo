package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Battery;
import com.example.model.CustomBattery;
import com.example.service.BatteryService;

@RestController
public class BatteryRestController {
	
	@Autowired
	private BatteryService batteryService;
	
	@RequestMapping(path="/battery", method=RequestMethod.GET)
	public List<Battery> getAllBatteries(){
		return batteryService.getAllBatteries();
	}
    
	@RequestMapping(value = "/battery/{id}", method = RequestMethod.GET)
	public Battery getBatteryById(@PathVariable("id") long id){
		return batteryService.getBatteryById(id);
	}
	
	@RequestMapping(path="/saveVendorList", method=RequestMethod.POST)
	public void saveVendorList(@RequestParam("batteries") List<Battery> batteryList){
		/* List<Battery> listOfBatteries=batteryService.saveVendorList(batteryList); */
		
		for(Battery battery:batteryList) {
			System.out.println(battery);
		}
	}
	
	@RequestMapping(path="/saveItems", method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addPersons(@RequestBody List<CustomBattery> customBatteries){
		System.out.println("selected ids:");
		for(CustomBattery c: customBatteries) {
			System.out.println(c.toString());
		}
            
		return "Successfully created vendor list";
    }

}
