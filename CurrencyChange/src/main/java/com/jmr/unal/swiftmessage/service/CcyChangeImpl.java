package com.jmr.unal.swiftmessage.service;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.jmr.unal.swiftmessage.CurrencyChangeApplication;
import com.jmr.unal.swiftmessage.bean.SourceDestination;

@Service
public class CcyChangeImpl implements CcyChnage {

	// @Autowired
	// private SourceDestination srcDest;

	private static Logger log = LoggerFactory.getLogger(CcyChangeImpl.class.getName());

	@Override
	public boolean changeAllLekMT103(File fileToBeModified) {
		final String method = "changeAllLekMT103()--->  ";
		log.debug(method + "In changeAllLekMT103 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {

				index = line.indexOf(":32A:");
				if (index >= 0) {
					log.debug(method + "The tag :32A: found in line : " + linecounter);

					if (line.substring(index + 11, index + 14).equals("ALL")) {
						log.debug(method + "The tag :32A: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :32A: tag");

						index = 0;

					}
				}

				index = line.indexOf(":33B:");
				if (index >= 0) {
					log.debug(method + "The tag :33B: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :33B: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :33B: tag");
						index = 0;

					}
				}
				index = line.indexOf(":71F:");
				if (index >= 0) {

					log.debug(method + "The tag :71F: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :71F: has currency code ALL");

						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :71F: tag");

						index = 0;

					}
				}
				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT103");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT103() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean changeAllLekMT202(File fileToBeModified) {
		final String method = "changeAllLekMT202()--->  ";
		log.debug(method + "In changeAllLekMT202 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {
// :32A:080529EUR727500,01 
				index = line.indexOf(":32A:");
				if (index >= 0) {
					log.debug(method + "The tag :32A: found in line : " + linecounter);

					if (line.substring(index + 11, index + 14).equals("ALL")) {
						log.debug(method + "The tag :32A: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :32A: tag");

						index = 0;

					}
				}

				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT202");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT202() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean changeAllLekMT300(File fileToBeModified) {
		final String method = "changeAllLekMT300()--->  ";
		log.debug(method + "In changeAllLekMT300 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {

				index = line.indexOf(":32B:");
				if (index >= 0) {
					log.debug(method + "The tag :32B: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :32B: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :32B: tag");

						index = 0;

					}
				}

				index = line.indexOf(":33B:");
				if (index >= 0) {
					log.debug(method + "The tag :33B: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :33B: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :33B: tag");
						index = 0;

					}
				}

				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT300");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT300() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean changeAllLekMT320(File fileToBeModified) {
		final String method = "changeAllLekMT103()--->  ";
		log.debug(method + "In changeAllLekMT103 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {

				index = line.indexOf(":32B:");
				if (index >= 0) {
					log.debug(method + "The tag :32A: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :32B: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :32B: tag");

						index = 0;

					}
				}

				index = line.indexOf(":34E:");
				if (index >= 0) {
					log.debug(method + "The tag :34E: found in line : " + linecounter);

					if (line.substring(index + 6, index + 9).equals("ALL")) {
						log.debug(method + "The tag :34E: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :34E: tag");
						index = 0;

					}
				}

				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT320");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT320() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean changeAllLekMT950(File fileToBeModified) {
		final String method = "changeAllLekMT900()--->  ";
		log.debug(method + "In changeAllLekMT900 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {

				index = line.indexOf(":60M:");
				if (index >= 0) {
					log.debug(method + "The tag :60M: found in line : " + linecounter);

					if (line.substring(index + 12, index + 15).equals("ALL")) {
						log.debug(method + "The tag :60M: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :60M: tag");

						index = 0;

					}
				}

				index = line.indexOf(":60F:");
				if (index >= 0) {
					log.debug(method + "The tag :60F:: found in line : " + linecounter);

					if (line.substring(index + 12, index + 15).equals("ALL")) {
						log.debug(method + "The tag :60F: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :60F: tag");

						index = 0;

					}
				}
				index = line.indexOf(":62M:");
				if (index >= 0) {
					log.debug(method + "The tag :62M: found in line : " + linecounter);

					if (line.substring(index + 12, index + 15).equals("ALL")) {
						log.debug(method + "The tag :62M: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :62M: tag");

						index = 0;

					}
				}

				index = line.indexOf(":62F:");
				if (index >= 0) {
					log.debug(method + "The tag :62F:: found in line : " + linecounter);

					if (line.substring(index + 12, index + 15).equals("ALL")) {
						log.debug(method + "The tag :62F: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :62F: tag");

						index = 0;

					}
				}
				index = line.indexOf(":64:");
				if (index >= 0) {
					log.debug(method + "The tag :64:: found in line : " + linecounter);

					if (line.substring(index + 11, index + 14).equals("ALL")) {
						log.debug(method + "The tag :64: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :64: tag");

						index = 0;

					}
				}
				index = line.indexOf(":65:");
				if (index >= 0) {
					log.debug(method + "The tag :65:: found in line : " + linecounter);

					if (line.substring(index + 11, index + 14).equals("ALL")) {
						log.debug(method + "The tag :65: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :65: tag");

						index = 0;

					}
				}
				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT900");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT900() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean changeAllLekMT940(File fileToBeModified) {
		final String method = "changeAllLekMT940()--->  ";
		log.debug(method + "In changeAllLekMT940 ...");
		log.debug(method + "The current file is : " + fileToBeModified.getName());
		String finalData = "";
		StringBuffer data = new StringBuffer();

		BufferedReader reader = null;

		FileWriter writer = null;
		int index = -1;

		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			int linecounter = 0;
			log.debug(method + " In side while-loop");
			while (line != null) {

				index = line.indexOf(":32A:");
				if (index >= 0) {
					log.debug(method + "The tag :32A: found in line : " + linecounter);

					if (line.substring(index + 11, index + 14).equals("ALL")) {
						log.debug(method + "The tag :32A: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :32A: tag");

						index = 0;

					}
				}

				index = line.indexOf(":33B:");
				if (index >= 0) {
					log.debug(method + "The tag :33B: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :33B: has currency code ALL");
						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :33B: tag");
						index = 0;

					}
				}
				index = line.indexOf(":71F:");
				if (index >= 0) {

					log.debug(method + "The tag :71F: found in line : " + linecounter);

					if (line.substring(index + 5, index + 8).equals("ALL")) {
						log.debug(method + "The tag :71F: has currency code ALL");

						line = line.replace("ALL", "LEK");
						log.debug(method + "Currency code ALL is replaced by LEK for :71F: tag");

						index = 0;

					}
				}
				data = data.append(line).append(System.lineSeparator());

				line = reader.readLine();
				linecounter++;
			} // while
			log.debug(method + "Out of while loop");
			writer = new FileWriter(fileToBeModified);

			finalData = data.toString();
			log.debug(finalData); // TODO remove this line
			writer.write(finalData);

		} // try

		catch (IOException e) {
			log.debug(method + "IOException occured in changeAllLekMT940");
			e.printStackTrace();
			return false;
		} finally {
			try {
				reader.close();
				writer.close();

			} catch (IOException e) {
				log.debug(method + "IOException occured while closing object");

				e.printStackTrace();
			}
		}
		log.debug(method + " Success from changeAllLekMT940() for " + fileToBeModified.getName() + " file");
		return true;
	}

	@Override
	public boolean fileProcess(SourceDestination srcDest) {
		final String method = "In fileProcess()--->  ";
		log.debug("Start of the fileProcess()");
		Path from;
		Path to;

		File folder = new File(srcDest.getSource());

		String destPath = "";
		File[] files = folder.listFiles();

		int fileCounter = 0;

		int failed = 0;
		String msgType;

		// while (files.length != 0) {

		for (File file : files) {
			log.debug(method + "Total files need to be processed : " + files.length);
			// tempDestPath = destPath;
			log.debug(method + " Inside the loop... The file which is bieng processed : " + file.getName());
			try {

				msgType = checkType(file);
				if (msgType != null) {
					switch (msgType) {
					case "103":
						log.debug(method + "Message type is 103");
						log.debug(method + "Calling changeAllLekMT103()");
						if (!changeAllLekMT103(file)) {

							log.debug(method + " Unable to call changeAllLekMT103()");

						}
						break;
					case "202":
						log.debug(method + "Message type is 202");
						log.debug(method + "Calling changeAllLekMT202()");
						if (!changeAllLekMT202(file)) {

							log.debug(method + " Unable to call changeAllLekMT202()");

						}
						break;
					case "300":
						log.debug(method + "Message type is 300");
						log.debug(method + "Calling changeAllLekMT300()");
						if (!changeAllLekMT300(file)) {

							log.debug(method + " Unable to call changeAllLekMT300()");

						}
						break;
					case "320":
						log.debug(method + "Message type is 320");
						log.debug(method + "Calling changeAllLekMT320()");
						if (!changeAllLekMT320(file)) {

							log.debug(method + " Unable to call changeAllLekMT320()");

						}
						break;
					case "940":
						log.debug(method + "Message type is 940");
						log.debug(method + "Calling changeAllLekMT940()");
						if (!changeAllLekMT940(file)) {

							log.debug(method + " Unable to call changeAllLekMT940()");

						}
						break;
					case "950":
						log.debug(method + "Message type is 950");
						log.debug(method + "Calling changeAllLekMT950()");
						if (!changeAllLekMT950(file)) {

							log.debug(method + " Unable to call changeAllLekMT950()");

						}
						break;

					default:
						log.debug(method + "Message type " + msgType + " is undefined for the file " + file.getName());
						failed++;

						continue;
					}
				} else {

					log.debug(method + "Unable find the message type for the file" + file.getAbsolutePath());
					failed++;
					continue;
				}

				from = Paths.get(file.getAbsolutePath());
				log.debug(method + "The Source path " + from);
				destPath = srcDest.getDestination() + file.getName();
				log.debug(method + "The destination path for the file " + file.getName() + "  is  " + destPath);
				to = Paths.get(destPath);

				Files.move(from, to, REPLACE_EXISTING);

				log.debug(method + "The file " + file.getName() + " moved successfully... to "
						+ srcDest.getDestination());
			} catch (IOException e) {
				log.debug(method + " IOException occured at file moving for " + file.getName());
				e.printStackTrace();
				return false;

			} catch (Exception e) {
				log.debug(method + " Undefined Exception occured " + file.getName());
				e.printStackTrace();
				return false;

			}
			fileCounter++;

		}

		log.debug(method + "Total files processed : " + fileCounter);

		log.debug(method + "Total  files failed : " + failed);

		log.debug(" End of FileProcess()");
		// }

		return true;
	}

	@Override
	public String checkType(File fileToBeChecked) {

		final String method = "In checkFileType()--->  ";

		log.debug(method + "Start of checkFileType()");
		log.debug(method + " The file to be checked " + fileToBeChecked.getName());
		// char inOut;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeChecked));
			String line = reader.readLine();
			int index = 0;

			while (line != null) {

				if (line.contains("{2:")) {
					index = line.indexOf("{2:");
					if (line.contains("{2:I")) {
						log.debug(method + " checkFileType()" + fileToBeChecked.getName() + " is a IncomingMessage");

					}

					else if (line.contains("{2:O")) {
						log.debug(method + " checkFileType()" + fileToBeChecked.getName() + " is a OutgoingMessage");

					}
					return line.substring(index + 4, index + 7);

				}

				line = reader.readLine();

			}

		} // try

		catch (

		IOException e) {
			log.debug(method + " IOExcetion occurred at " + fileToBeChecked.getName() + " file");
			e.printStackTrace();
			log.debug(method + "End of checkFileType()");
			return null;
		} finally {
			try {
				reader.close();

			} catch (IOException e) {
				log.debug(method + " Excetion occurred at object closing");
				e.printStackTrace();
			}
		}
		log.debug(method + " The file " + fileToBeChecked.getName() + " is undefined ");
		log.debug(method + "End of checkFileType()");
		return null;
	}

}
