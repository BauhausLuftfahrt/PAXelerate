package net.bhl.cdt.paxelerate.model.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.model.astar.AreaMap;
import net.bhl.cdt.paxelerate.model.astar.Node;

@Deprecated
public class Exporter {

	private static final String FOLDER_NAME = "paxelerate", FILE_PATH = System
			.getProperty("user.home") + "/Documents/" + FOLDER_NAME + "/";

	public static boolean generateHeatmapFile(String filename, AreaMap areamap) {
		try {
			
			// Create a path before creating the file!
			File dir = new File(FILE_PATH);
			dir.mkdir();

			FileWriter writer = new FileWriter(FILE_PATH + filename + ".xls");
			for (ArrayList<Node> nodeList : areamap.getNodes()) {
				for (Node node : nodeList) {
					writer.append("" + node.getNumberOfOccupations());
					writer.append("\t");
				}
				writer.append("\n");
			}

			writer.flush();
			writer.close();
			return true;

		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean generateInterruptmapFile(String filename,
			AreaMap areamap) {
		
		try {
			// Create a path before creating the file!
						File dir = new File(FILE_PATH);
						dir.mkdir();
			FileWriter writer = new FileWriter(FILE_PATH + filename + ".xls");
			for (ArrayList<Node> nodeList : areamap.getNodes()) {
				for (Node node : nodeList) {
					writer.append("" + node.getNumberOfInterrupts());
					writer.append("\t");
				}
				writer.append("\n");
			}

			writer.flush();
			writer.close();
			return true;

		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
	}

	static void generateDistributionFile(String sFileName,
			GaussianStorage weight, GaussianStorage height,
			GaussianStorage depth, GaussianStorage width, AgeStorage age,
			LuggageStorage luggage, int[] pax) {
		
		try {
			
			// Create a path before creating the file!
						File dir = new File(FILE_PATH);
						dir.mkdir();

			FileWriter writer = new FileWriter(FILE_PATH + sFileName + ".xls");

			writeHeadline(writer);
			writeGaussian(writer, weight, "Weight");
			writeGaussian(writer, height, "Height");
			writeGaussian(writer, depth, "Depth");
			writeGaussian(writer, width, "Width");

			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeHeadline(FileWriter writer) throws IOException,
			FileNotFoundException {
		writer.append("Type");
		writer.append('\t');
		writer.append("Maximum Value F");
		writer.append('\t');
		writer.append("Maximum Value M");
		writer.append('\t');
		writer.append("Minimum Value F");
		writer.append('\t');
		writer.append("Minimum Value M");
		writer.append('\t');
		writer.append("Average Value F");
		writer.append('\t');
		writer.append("Average Value M");
		writer.append('\t');
		writer.append("Sum Value F");
		writer.append('\t');
		writer.append("Sum Value M");
		writer.append('\t');
		writer.append("Amount Value F");
		writer.append('\t');
		writer.append("Amount Value M");
		writer.append('\n');
	}

	private static void writeGaussian(FileWriter writer,
			GaussianStorage storage, String name) throws IOException,
			FileNotFoundException {
		writer.append(name);
		writer.append('\t');
		writer.append(str(storage.getMaximum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getMaximum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getMinimum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getMinimum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getAverage(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getAverage(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getSum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getSum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getAmount(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getAmount(Sex.MALE)));
		writer.append('\n');
	}

	private static String str(double value) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(value);
	}
}
