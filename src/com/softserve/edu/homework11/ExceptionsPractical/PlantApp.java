package com.softserve.edu.homework11.ExceptionsPractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Plant {
	private Type type;
	private Color color;
	private int size;

	private Plant() {
	}

	@Override
	public String toString() {
		return "Plant [Type=" + type + ", Color=" + color + ", Size=" + size + "]";
	}

	public static class PlantMaker extends Plant {

		private PlantMaker() {
		}

		public static PlantMaker pickPlant() {
			PlantMaker plant = new PlantMaker();
			return plant;
		}

		private PlantMaker enterType(String type) throws TypeExceptions {
			switch (type.toLowerCase()) {
			case "lilie":
				((Plant) this).type = Type.Lilies;
				return this;
			case "orchid":
				((Plant) this).type = Type.Orchid;
				return this;
			case "rose":
				((Plant) this).type = Type.Roses;
				return this;
			case "tulip":
				((Plant) this).type = Type.Tulips;
				return this;
			default:
				throw new TypeExceptions("Input only following type: lilies, orchid, roses, tulips.");
			}

		}

		private PlantMaker enterColor(String color) throws ColorException {
			switch (color.toLowerCase()) {
			case "blue":
				((Plant) this).color = Color.Blue;
				return this;
			case "red":
				((Plant) this).color = Color.Red;
				return this;
			case "white":
				((Plant) this).color = Color.White;
				return this;
			default:
				throw new ColorException("Input only following colors: red, blue, white.");
			}
		}

		private PlantMaker enterSize(int size) throws SizeException {
			if (size < 1) {
				throw new SizeException("Inpur size is less then 1.");
			}
			((Plant) this).size = size;

			return this;
		}

		public Plant growPlant(String type, String color, int size)
				throws TypeExceptions, ColorException, SizeException {
			Plant plant = new PlantMaker();
			plant = enterType(type).enterColor(color).enterSize(size);
			return plant;
		}

	}

}

public class PlantApp {
	public static void main(String[] args) {

		List<Plant> plantsList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			boolean repeat = true;
			while (repeat) {
				System.out.println("Enter plant type: ");
				String type = br.readLine();
				System.out.println("Enter plant color: ");
				String color = br.readLine();
				System.out.println("Enter plant size: ");
				int size = Integer.parseInt(br.readLine());
				plantsList.add(Plant.PlantMaker.pickPlant().growPlant(type, color, size));

				System.out.println("Do you want to enter more plants? (yes | no)");
				if (!br.readLine().toLowerCase().equals("yes")) {
					repeat = false;
				}
			}

		} catch (TypeExceptions | ColorException | SizeException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
