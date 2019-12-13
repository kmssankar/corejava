package org.corejava.probsolv.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.corejava.probsolv.domain.Patient;

public class FileUtils {

	public List<Patient> getfilerec(String path){
		List<Patient> patientList = new ArrayList<Patient>();
		try(BufferedReader br = new BufferedReader(new FileReader(new File(path)))){
			String fileLine;
			while((fileLine = br.readLine())!=null) {
				if (isValid(fileLine)) {
					patientList.add(parseInp(fileLine));
				}
			}		
		} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		
		
		return null;
	}

	private boolean isValid(String line) {
		String[] fields = line.split(";|,");

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		if (!(fields.length == 6))
			{
				return false;
			}
		if (!(fields[0].matches("[A-Z]+")))
			{
				return false;
			}
		if (!(fields[1].matches("(IN|OUT){1}\\d+")))
			{
				return false;
			}
		if (!(fields[2].matches("(M|F){1}")))
			{
				return false;
			}
		if (!(fields[4].matches("\\d+(ENT|GEN|NEU){1}")))
			{
				return false;
			}
		Date admDate;
		try
			{
				admDate = dateFormat.parse(fields[4]);
			} catch (ParseException e)
			{
				return false;
			}
		Date dschDate;
		try
			{
				dschDate = dateFormat.parse(fields[5]);
			} catch (ParseException e)
			{
				return false;
			}
		return true;
	}
	
	private Patient parseInp (String linein) {
		Patient patient = new Patient();
		String[] parsed = linein.split(";|,");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		patient.setName(parsed[0]);
		patient.setMrnId(parsed[1]);
		patient.setGender(parsed[2]);
		patient.setPhysicianId(parsed[3]);
		try {
		patient.setAdmitteddt(dateFormat.parse(parsed[4]));
		patient.setDschrgedt(dateFormat.parse(parsed[4]));
		}
		catch(ParseException p) {
			System.out.println(p);
		}
		return patient;
	}
	
	private String getPhysicianType(String physicianId) {
		if(physicianId.contains("ENT")) {
			return "ENT";
		}else if(physicianId.contains("GEN")) {
			return "GEN";
		}else {
			return "NEU";
		}
	}
	
	private int calculateBill(Patient patient) {
		
		
		
		return 0;
	}
}
