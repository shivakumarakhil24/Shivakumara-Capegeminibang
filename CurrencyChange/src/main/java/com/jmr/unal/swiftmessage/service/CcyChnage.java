package com.jmr.unal.swiftmessage.service;

import java.io.File;

import com.jmr.unal.swiftmessage.bean.SourceDestination;

public interface CcyChnage {
	
	public boolean changeAllLekMT103(File fileToBeModified);
	public boolean changeAllLekMT202(File fileToBeModified);
	public boolean changeAllLekMT300(File fileToBeModified);
	public boolean changeAllLekMT320(File fileToBeModified);
	public boolean changeAllLekMT940(File fileToBeModified);
	public boolean changeAllLekMT950(File fileToBeModified);
	
	public boolean fileProcess(SourceDestination srcDest);

	public String checkType(File fileToBeChecked);
}
